package timeofday;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeOfDayTest {

	@Test
	void test() {
		TimeOfDay noon = new TimeOfDay(12, 0);
		assertEquals(12, noon.getHours());
		assertEquals(0, noon.getMinutes());
		assertEquals(720, noon.getMinutesSinceMidnight());
		
		noon.setHours(14);
		assertEquals(14, noon.getHours());
		assertEquals(0, noon.getMinutes());
		assertEquals(840, noon.getMinutesSinceMidnight());
		
//		noon.setMinutes(30);
//		assertEquals(14, noon.getHours());
//		assertEquals(30, noon.getMinutes());
//		assertEquals(870, noon.getMinutesSinceMidnight());
//		
//		noon.setMinutesSinceMidnight(90);
//		assertEquals(1, noon.getHours());
//		assertEquals(30, noon.getMinutes());
//		assertEquals(90, noon.getMinutesSinceMidnight());
	}

}
