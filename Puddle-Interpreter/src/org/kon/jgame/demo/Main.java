package org.kon.jgame.demo;

import org.kon.jgame.JGameDriver;
import org.kon.jgame.demo.scene.DemoScene;

public class Main {

    public static void main(String[] args) {
        JGameDriver driver = new JGameDriver("Demo Game",400,400,30);
        driver.registerScene(new DemoScene("SCENE_NAME"));
        driver.initialScene("SCENE_NAME");
        driver.start();
    }
}
