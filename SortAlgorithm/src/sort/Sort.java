package sort;
import java.util.Arrays;
import java.util.List;


public class Sort {

	public static void printIntArray(int[] toPrint) {
		System.out.print("(");
		for(int i=0; i<toPrint.length; i++) {
			System.out.print(toPrint[i]);
			if(i<toPrint.length-1)
				System.out.print(",");
		}
		System.out.print(")");
	}
	
	public static void printIntList(List<Integer> toPrint) {
		System.out.print("(");
		for(int i=0; i<toPrint.size();i++) {
			System.out.print(toPrint.get(i));
			if(i<toPrint.size()-1)
				System.out.print(",");
		}
		System.out.print(")");
	}
	
	//Min Sort/Selection Sort O(n^2)
	public static int[] minSortIntArray(int[] input) {
		int swap;
		for(int outer=0; outer < input.length-1; outer++) {
			for(int inner=outer+1; inner<input.length;inner++) {
				if(input[outer]>input[inner]) {
					swap = input[outer];
					input[outer]= input[inner];
					input[inner] = swap;
				}
			}
		}
		return input;		
	}
	//Min Sort/Selection Sort O(n^2)
	public static List<Integer> minSortIntList(List<Integer> input) {
		int swap;
		for(int outer=0; outer<input.size()-1; outer++) {
			for(int inner=outer+1; inner<input.size(); inner++) {
				if(input.get(outer)>input.get(inner)) {
					swap = input.get(outer);
					input.set(outer, input.get(inner));
					input.set(inner, swap);
				}
			}
		}
		return input;
	}
	
	
	public static int[] bubbleSortIntArray(int[] input) {
		int swap;
		boolean unsorted = false;
		do {
		for(int i=0; i<input.length-1; i=i+2) {
			if(input[i]>input[i+1]) {
				swap = input[i];
				input[i]= input[i+1];
				input[i+1] = swap;
				unsorted=true;
			}
		}
		}while(unsorted);
		return input;
	}
	
	public static int nullPinterTest(int[] input) {
		int a=0;
		try {
			a= input[5];
		} catch (Exception e) {
			System.out.println("array to short");
			
		}
		
		return a;
	}
	
	public int square(int x) {
		return x*x;
	}
	
	
	public static void main(String args[]) {
		
		
		List<Integer> list = Arrays.asList(10, 50, 20, 15, 5);
		int[] input = {2,4,6,1,3,8,13,2473,88,4};
		
		int[] test = new int[3];
		
		//int[] nullTest = {1,2};
		//int a = nullPinterTest(nullTest);
		
		printIntArray(minSortIntArray(input));
		System.out.println();
		printIntList(minSortIntList(list));
		System.out.println();
		printIntArray(bubbleSortIntArray(input));
		

	}
}
