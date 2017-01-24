package babySitter;

public class BabySitter {

	private int startTime;
	private int endTime;
	
	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}

	public int getStartTime() {
		return startTime;
	}
	
	public int getStartTimeLimit(){
		int startTimeLimit = 17;
		return startTimeLimit;
	}

	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}

	public int getEndTime() {
		return endTime;
	}

	public int getEndTimeLimit() {
		int endTimeLimit = 28;
		return endTimeLimit;
	}

}
