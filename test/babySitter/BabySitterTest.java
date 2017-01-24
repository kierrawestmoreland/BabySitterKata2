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
	
	

}
