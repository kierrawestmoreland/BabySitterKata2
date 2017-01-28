package babySitter;

public class BabySitter {

	private int endTime;
	private int startTime;
	private int bedTime;
	private int startTimeLimit = 17;
	private int endTimeLimit = 28;
	
	public BabySitter(int startTime, int endTime, int bedTime) {		
		
		this.endTime = endTime;
		this.startTime = startTime;
		this.bedTime = bedTime;
		
		convertTime();
	}

	public int getStartTime() {
		return startTime;
	}

	public int getEndTime() {
		return endTime;
	}

	public int getBedTime() {
		return bedTime;
	}

	public boolean verifyEndAfterStartTime() {
		if(getStartTime() < getEndTime()){
			return true;
		}else{
			return false;
		}
	}

	public boolean verifyBabySittingWithinLimits() {
		if((getStartTime() >= startTimeLimit) && (getEndTime() <= endTimeLimit)){
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

		int startTimeToBedTimeHours = 0;
		int bedTimeToMidnightHours = 0;
		int midnightToEndTimeLimitHours = 0;
		
		for(int currentHour = getStartTime(); currentHour < getEndTime(); currentHour++){
		
			if(currentHour >= 17 && currentHour < getBedTime()){
				startTimeToBedTimeHours++;
				}
			if(currentHour >= getBedTime() && currentHour < 24){
				bedTimeToMidnightHours++;
				}
			if(currentHour >= 24 && currentHour < endTimeLimit){
				midnightToEndTimeLimitHours++;
				}
		}
		System.out.println(startTimeToBedTimeHours + " " + bedTimeToMidnightHours + " " + midnightToEndTimeLimitHours);	
		return startTimeToBedTimeHours * 12 + bedTimeToMidnightHours * 8 + midnightToEndTimeLimitHours *16;
	}
}
