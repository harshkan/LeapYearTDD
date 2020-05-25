import static org.junit.Assert.*;

import org.junit.Test;

public class LeapYearTest {
	
	@Test
	public void testLeapYear() {
		LeapYear obj = new LeapYear();
		assertEquals(true,obj.isLeapYear(1600));
	}

}
