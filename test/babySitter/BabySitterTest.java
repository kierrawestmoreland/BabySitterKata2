package babySitter;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BabySitterTest {

	private BabySitter babySitter;
	
	@Before
	public void setUpForTests(){
		babySitter = new BabySitter();
		babySitter.setStartTime(6);
		babySitter.setEndTime(12);
	}
	
	@Test
	public void startNoEarlierThan5pm(){
		Assert.assertTrue(babySitter.getStartTime() >= babySitter.getStartTimeLimit());
	}
	
	@Test
	public void endNoLaterThan4am(){
		Assert.assertTrue(babySitter.getEndTime() <= babySitter.getEndTimeLimit());
	}
	
	@Test
	public void verifyEndTimeIsAfterStartTime(){
		Assert.assertTrue(babySitter.verifyEndAfterStartTime());
	}
	
	@Test
	public void verifyStartAndEndTimeAreWithinLimits(){
		Assert.assertTrue(babySitter.verifyBabySittingWithinLimits());
	}
	
	@Test
	public void enteredTimeIsConverted(){
		babySitter.setStartTime(6);
		int startTimeTest = babySitter.getStartTime();
		Assert.assertTrue(startTimeTest == 18);
	}
	
	@Test
	public void payRateIsEstablished(){
		long actual = (long) babySitter.payRate();
		Assert.assertEquals(8, actual);
	}

}
