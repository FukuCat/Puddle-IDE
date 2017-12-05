package org.cmpiler.kotlin.ide.controller;

import org.cmpiler.kotlin.interpreter.Interpreter;
import org.cmpiler.kotlin.utils.console.Console;

import java.sql.Timestamp;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class InterpreterController {

    private static InterpreterController instance = null;
    private Interpreter interpreter;
    private boolean isRunning;
    private boolean isBuilding;
    private boolean isExecuting;
    protected Semaphore semBuild;
    protected Semaphore semRunning;
    protected Semaphore semBuilding;
    protected Semaphore semExecuting;
    private Thread autoBuildThread;


    private InterpreterController(){
        interpreter = Interpreter.getInstance();
        semBuild = new Semaphore(1, true);
        semRunning = new Semaphore(1, true);
        semBuilding = new Semaphore(1, true);
        semExecuting = new Semaphore(1, true);
        setRunning(true);
        setBuilding(false);
        setExecuting(false);
        autoBuildThread = new Thread(){
            public void run() {
                try {
                    while(isRunning()){
                        TimeUnit.SECONDS.sleep(8);
                        build();
                    }
                } catch(InterruptedException v) {
                    v.printStackTrace();
                }
            }
        };
    }

    public void execute(){
        try {
            setExecuting(true);
            semBuild.acquire(1);
            interpreter.execute();
            semBuild.release(1);
            setExecuting(false);
        } catch (InterruptedException e) {
            e.printStackTrace();
            semBuild.release(1);

        }
    }

    public static InterpreterController getInstance() {
        return instance == null? (instance = new InterpreterController()): instance;
    }

    public void build() throws InterruptedException {
        if(isBuilding()){
            System.err.println("Cannot build now. Build operation already in progress");
        } else {
            if(!isExecuting()) {
                Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                System.out.println("Building at: "+timestamp+"\n");
                setBuilding(true);
                semBuild.acquire(1);
                EditorController.getInstance().clearHighlights();
                ConsoleController.getInstance().clear();
                interpreter.parseText(EditorController.getInstance().getCode());
                semBuild.release(1);
                setBuilding(false);
            }
        }
    }

    public void startAutoBuild(){
        autoBuildThread.start();
    }

    public boolean isRunning() {
        boolean result = false;
        try {
            semRunning.acquire(1);
            result = isRunning;
            semRunning.release(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return result;
    }

    public void setRunning(boolean running) {
        try {
            semRunning.acquire(1);
            isRunning = running;
            semRunning.release(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public boolean isBuilding() {
        boolean result = false;
        try {
            semBuilding.acquire(1);
            result = isBuilding;
            semBuilding.release(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return result;
    }

    public void setBuilding(boolean building) {
        try {
            semBuilding.acquire(1);
            isBuilding = building;
            semBuilding.release(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public Semaphore getSemBuilding() {
        return semBuilding;
    }

    public void setSemBuilding(Semaphore semBuilding) {
        this.semBuilding = semBuilding;
    }

    public boolean isExecuting() {
        boolean result = false;
        try {
            semExecuting.acquire(1);
            result = isExecuting;
            semExecuting.release(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return result;
    }

    public void setExecuting(boolean executing) {
        try {
            semExecuting.acquire(1);
            isExecuting = executing;
            semExecuting.release(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
