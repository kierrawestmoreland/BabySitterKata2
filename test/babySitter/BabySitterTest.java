package babySitter;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BabySitterTest {

	private BabySitter babySitter;
	
	@Before
	public void setUpForTests(){
		babySitter = new BabySitter();
		babySitter.setStartTime(18);
		babySitter.setEndTime(24);
	}
	
	@Test
	public void startNoEarlierThan5pm(){
		assertTrue(babySitter.getStartTime() >= babySitter.getStartTimeLimit());
	}
	
	@Test
	public void endNoLaterThan4am(){
		assertTrue(babySitter.getEndTime() <= babySitter.getEndTimeLimit());
	}
	
	@Test
	public void verifyEndTimeIsAfterStartTime(){
		assertTrue(babySitter.verifyEndAfterStartTime());
	}
	
	@Test
	public void verifyStartAndEndTimeAreWithinLimits(){
		assertTrue(babySitter.verifyBabySittingWithinLimits());
	}
	
	@Test
	public void enteredTimeIsConverted(){
		babySitter.setStartTime(6);
		int startTimeTest = babySitter.getStartTime();
		assertTrue(startTimeTest == 18);
	}

}
