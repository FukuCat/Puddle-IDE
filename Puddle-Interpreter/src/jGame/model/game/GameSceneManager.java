package jGame.model.game;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class GameSceneManager {

	private HashMap<String, GameScene> sceneMap;
	
	private GameScene currentScene;
	
	public GameSceneManager(){
		setSceneMap(new HashMap<>());
		setCurrentScene(null);
	}
	
	public void addScene(GameScene scene){
		if(!sceneMap.containsKey(scene.getName())){
			scene.setGameSceneManager(this);
			sceneMap.put(scene.getName(), scene);
			if(currentScene == null)
				changeScene(scene.getName());
			}
	}
	
	public boolean changeScene(String name){
		if(sceneMap.containsKey(name)){
			if(currentScene != null){
				currentScene.close();
				currentScene.setSceneEnded(true);
				}
			setCurrentScene(sceneMap.get(name));
			if(currentScene.isSceneEnded()){
				currentScene.init();
				}
			return true;
		}
		return false;
	}
	
	public void close(){
		Iterator<Entry<String, GameScene>> it = sceneMap.entrySet().iterator();
		    while (it.hasNext()) {
		        Entry<String, GameScene> pair = it.next();
		        if(!pair.getValue().isSceneEnded())
		        	pair.getValue().close();
		        it.remove(); // avoids a ConcurrentModificationException
		    }
	}
	
	public GameScene getScene(String name){
		return sceneMap.get(name);
	}

	public HashMap<String, GameScene> getSceneMap() {
		return sceneMap;
	}

	public void setSceneMap(HashMap<String, GameScene> sceneMap) {
		this.sceneMap = sceneMap;
	}

	public GameScene getCurrentScene() {
		return currentScene;
	}

	public void setCurrentScene(GameScene currentScene) {
		this.currentScene = currentScene;
	}
	
}
