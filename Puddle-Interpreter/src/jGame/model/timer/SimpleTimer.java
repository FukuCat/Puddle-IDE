package jGame.model.timer;

public class SimpleTimer {
	
	private long prevTime;
	private long waitTime;
	private long lastTime;
	private boolean result = false;
	//private boolean status = false;
	
	public SimpleTimer(long wait){
		waitTime = wait;
		prevTime = System.nanoTime();
		lastTime = 0;
	}
	
	public SimpleTimer(float waitSeconds){
		waitTime = (long) (waitSeconds * 1000000000L);
		prevTime = System.nanoTime();
		lastTime = 0;
	}
	
	public void restart(){
		prevTime = System.nanoTime();
		setResult(false);
	}
	public long checkCurrentTime(){
		checkTime();
		return result? lastTime: System.nanoTime() - prevTime; 
	}
	
	public float toSeconds(){ return checkCurrentTime() / 1000000000.0f; }
	
	public boolean checkTime(){ // true if set time has passed
		if(System.nanoTime() - prevTime > waitTime){
			setResult(true);
			lastTime = System.nanoTime() - prevTime;
			prevTime = System.nanoTime();
			return true;
			}
		setResult(false);
		return false;
	}

	public boolean getResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

	public long getLastTime() {
		return lastTime;
	}

	public void setLastTime(long lastTime) {
		this.lastTime = lastTime;
	}
}