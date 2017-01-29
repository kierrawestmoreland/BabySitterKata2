package babySitter;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BabySitterTest {

	private BabySitter babySitter;
	
	
	@Before
	public void setUpForTests(){
		babySitter = new BabySitter(6, 10, 8);
		long startToBedPay = (babySitter.getBedTime()-babySitter.getStartTime()-1)*12;
		long bedToMidnightPay = (24-babySitter.getBedTime()-1)*8;
		long midnightToEndPay = (babySitter.getEndTime()-24-1)*16;
	}
	
	@Test
	public void startNoEarlierThan5pm(){
		Assert.assertTrue(babySitter.getStartTime() >= 17);
	}
	
	@Test
	public void endNoLaterThan4am(){
		Assert.assertTrue(babySitter.getEndTime() <= 28);
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
		long startToBedPay = (babySitter.getBedTime()-babySitter.getStartTime())*12;
		long bedToEndPay = (babySitter.getEndTime()-babySitter.getBedTime())*8;
		Assert.assertEquals(startToBedPay+bedToEndPay, actual);
	}

	@Test
	public void payRateTestForMultipleRates(){
		babySitter = new BabySitter(6, 1, 10);
		long actual = (long) babySitter.payRate();
		long startToBedPay = (babySitter.getBedTime()-babySitter.getStartTime())*12;
		long bedToMidnightPay = (24-babySitter.getBedTime())*8;
		long midnightToEndPay = (babySitter.getEndTime()-24)*16;
		//pay for midnight-end rate
		Assert.assertEquals(startToBedPay+bedToMidnightPay+midnightToEndPay, actual);
	}
	
	@Test
	public void payIfBedTimeEqualsOrIsAfterMidNight(){
		babySitter = new BabySitter(7, 2, 12);
		long actual = (long) babySitter.payRate();
		long startToBedPay = (babySitter.getBedTime()-babySitter.getStartTime())*12;
		long bedToMidnightPay = (24-babySitter.getBedTime())*8;
		long bedTimeToEndPay = (babySitter.getEndTime() - babySitter.getBedTime())*8;
		Assert.assertEquals(startToBedPay+bedToMidnightPay+bedTimeToEndPay, actual);
	}
}
