package babySitter;

public class BabySitter {

	private int startTime;
	private int startTimeLimit = 17;
	
	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}

	public int getStartTime() {
		return startTime;
	}
	
	public int getStartTimeLimit(){
		return startTimeLimit;
	}

}
