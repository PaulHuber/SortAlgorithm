package sort;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NullPointerTest {

	@Test
	void test() {
		Sort test = new Sort();
		int[] input = {1,2,3,4,5,6};
		int[] input2 = {1,2,3};
		assertEquals(6,test.nullPinterTest(input));
		assertEquals(6,test.nullPinterTest(input2));
	}

}
