package org.cmpiler.kotlin.utils.config;

import org.cmpiler.kotlin.utils.PropertiesIO;

import java.io.IOException;

public class GlobalConfig {

    private static GlobalConfig instance = null;

    private static final String path = "rcs/config.properties";

    private boolean quickRun;
    private boolean devMode;
    private boolean runUI;
    private String quickRunPath;

    private GlobalConfig(){
        String sQuickRun = null, sDevMode = null;
        quickRun = devMode = false;
        setRunUI(true);
        try {
            //PropertiesIO.printProperty("rcs/config.properties");
            sDevMode = PropertiesIO.readProperty("developerMode", path);
            sQuickRun = PropertiesIO.readProperty("quickRun", path);
            setQuickRunPath(PropertiesIO.readProperty("quickRunPath", path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(sDevMode != null)
            if(sDevMode.equalsIgnoreCase("true")){
                setDevMode(true);
            }
        if(sQuickRun != null && getQuickRunPath() != null)
            if(sQuickRun.equalsIgnoreCase("true")){
                setRunUI(false);
                setQuickRun(true);
            }
    }

    public static GlobalConfig getInstance(){return instance == null? (instance = new GlobalConfig()) : instance; }


    public boolean isQuickRun() {
        return quickRun;
    }

    public void setQuickRun(boolean quickRun) {
        this.quickRun = quickRun;
    }

    public boolean isDevMode() {
        return devMode;
    }

    public void setDevMode(boolean devMode) {
        this.devMode = devMode;
    }

    public boolean isRunUI() {
        return runUI;
    }

    public void setRunUI(boolean runUI) {
        this.runUI = runUI;
    }

    public String getQuickRunPath() {
        return quickRunPath;
    }

    public void setQuickRunPath(String quickRunPath) {
        this.quickRunPath = quickRunPath;
    }
}
