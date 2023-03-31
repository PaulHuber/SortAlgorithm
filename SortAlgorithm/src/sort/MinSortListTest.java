package sort;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinSortListTest {

	@Test
	void test() {
		Sort test = new Sort();
		int output = test.square(5);
		
		assertEquals(25, output);
		assertEquals(15, output);
	}

}
