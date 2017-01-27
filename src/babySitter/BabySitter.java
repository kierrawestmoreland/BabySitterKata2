package babySitter;

public class BabySitter {

	private int endTime;
	private int startTime;
	
	public void setStartTime(int startTime) {
		this.startTime = convertStartTime(startTime);
	}

	public int getStartTime() {
		return startTime;
	}
	
	public int getStartTimeLimit(){
		int startTimeLimit = 17;
		return startTimeLimit;
	}

	public void setEndTime(int endTime) {
		this.endTime = convertEndTime(endTime);
	}

	public int getEndTime() {
		return endTime;
	}

	public int getEndTimeLimit() {
		int endTimeLimit = 28;
		return endTimeLimit;
	}

	public boolean verifyEndAfterStartTime() {
		if(getStartTime() < getEndTime()){
			return true;
		}else{
			return false;
		}
	}

	public boolean verifyBabySittingWithinLimits() {
		if((getStartTime() >= getStartTimeLimit()) && (getEndTime() <= getEndTimeLimit())){
			System.out.println("I can work those hours.");
			return true;
		}else{
			System.out.println("I won't be able to work those hours since they are out of the allowed range.");
			return false;
		}
	}
	
	public int convertStartTime(int startTime){

		if(startTime < 13 && startTime > 4){
			startTime = startTime + 12;
		}else if(startTime > 0 && startTime < 5){
			startTime = startTime + 24;
		}else{
			return startTime;
		}
		return startTime;
	}

	public int convertEndTime(int endTime){
		
		if(endTime < 13 && endTime > 4){
			endTime = endTime + 12;
		}else{
			endTime = endTime + 24;
		}
		return endTime;
	}
}
