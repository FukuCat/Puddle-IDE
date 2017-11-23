package org.kon.jgame.controller;

import org.kon.jgame.model.external.ExternalAction;
import org.kon.jgame.model.game.GameScene;

public class ExternalActionController {

    private GameScene scene;
    public ExternalActionController(GameScene scene){
        this.scene = scene;
    }

    public GameScene getScene() {
        return scene;
    }

    public void putAction(String name, ExternalAction action){
        if(scene.getExternalActions().containsKey(name))
            System.err.println("Cannot put action because it already exists: ["+name+"]");
        else
            scene.getExternalActions().put(name, () -> action.run());
    }
    public boolean queueAction(String name){
        System.out.println("Queuing action: ["+name+"]");
        return scene.getActionQueue().add(name);
    }
}
