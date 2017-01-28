package babySitter;

public class BabySitter {

	private int endTime;
	private int startTime;
	private int bedTime;
	
	public BabySitter(int startTime, int endTime, int bedTime) {		
		
		this.endTime = endTime;
		this.startTime = startTime;
		this.bedTime = bedTime;
		
		convertTime();
	}

	public int getStartTime() {
		System.out.println(startTime);
		return startTime;
	}
	
	public int getStartTimeLimit(){
		int startTimeLimit = 17;
		return startTimeLimit;
	}

	public int getEndTime() {
		System.out.println(endTime);
		return endTime;
	}

	public int getBedTime() {
		return bedTime;
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
	
	public void convertTime(){

		if(startTime < 13 && startTime > 4){
			startTime = startTime + 12;
		}else if(startTime > 0 && startTime < 5){
			startTime = startTime + 24;
		}else{
		}
		
		if(endTime < 13 && endTime > 4){
			endTime = endTime + 12;
		}else if(endTime > 0 && endTime < 5){
			endTime = endTime + 24;
		}else{
		}
		
		if(bedTime < 13 && bedTime > 4){
			bedTime = bedTime + 12;
		}else if(bedTime > 0 && bedTime < 5){
			bedTime = bedTime + 24;
		}else{
		}
	}

	public int payRate() {

		int currentHour = getStartTime();
		int startTimeToBedTimeHours = 0;
		
		//fix if statement. program is bypassing
		//maybe add user prompts
			if(currentHour >= getStartTimeLimit() && currentHour <= getBedTime()){
			startTimeToBedTimeHours++;
		}
		
		System.out.println(startTimeToBedTimeHours);	
		return startTimeToBedTimeHours * 8;
	}
}
