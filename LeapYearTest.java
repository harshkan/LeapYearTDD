import static org.junit.Assert.*;

import org.junit.Test;

public class LeapYearTest {
	
	@Test
	public void testLeapYear() {
		LeapYear obj = new LeapYear();
		assertEquals(true,obj.isLeapYear(1600));
	}
	@Test
	public void testNonLeapYear() {
		LeapYear obj = new LeapYear();
		assertEquals(false,obj.isLeapYear(1601));
	}

}
