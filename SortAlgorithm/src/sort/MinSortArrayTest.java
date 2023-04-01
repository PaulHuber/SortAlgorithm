package sort;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import junit.framework.Assert;


class MinSortArrayTest {

	@Test
	void test() {
		Sort test = new Sort();
		int[] outputTrivial = {1,2,3,4,5,6};
		int[] inputTrivial = {5,2,6,3,1,4};
		
		//int[] outputTrivial = {1,2,3,4,5,6};
		//int[] inputTrivial = {5,2,6,3,1,4};

		assertArrayEquals(outputTrivial, test.minSortIntArray(inputTrivial));
		
		
	}

}
