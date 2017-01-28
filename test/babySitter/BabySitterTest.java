package babySitter;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BabySitterTest {

	private BabySitter babySitter;
	
	@Before
	public void setUpForTests(){
		babySitter = new BabySitter(6, 10, 8);
		
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
		int startTimeTest = babySitter.getStartTime();
		Assert.assertTrue(startTimeTest == 18);
	}
	
	@Test
	public void payRateIsEstablished(){
		long actual = (long) babySitter.payRate();
		Assert.assertEquals((babySitter.getEndTime()-babySitter.getStartTime()-1)*8, actual);
	}

}
