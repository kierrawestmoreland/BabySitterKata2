package babySitter;

import static org.junit.Assert.*;

import org.junit.Test;

public class BabySitterTest {

	@Test
	public void startNoEarlierThan5pm(){
		BabySitter babySitter = new BabySitter();
		babySitter.setStartTime(18);
		assertTrue(babySitter.getStartTime() >= babySitter.getStartTimeLimit());
	}
	
	@Test
	public void endNoLaterThan4am(){
		BabySitter babySitter = new BabySitter();
		babySitter.setEndTime(24);
		assertTrue(babySitter.getEndTime() <= babySitter.getEndTimeLimit());
	}
	
	

}
