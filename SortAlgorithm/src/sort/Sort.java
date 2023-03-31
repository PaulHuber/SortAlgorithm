package sort;
import java.util.Arrays;
import java.util.List;


public class Sort {

	public static void printIntArray(int[] toPrint) {
		System.out.print("(");
		for(int i=0; i<toPrint.length; i++) {
			System.out.print(toPrint[i] + ", ");
		}
		System.out.print(")");
	}
	
	public static void printIntList(List<Integer> toPrint) {
		System.out.print("(");
		for(int i=0; i<toPrint.size();i++)
			System.out.print(toPrint.get(i) + ", ");
		
		System.out.print(")");
	}
	
	
	public static void sort(int[] input) {
		int swap;
		printIntArray(input);
		for(int outer=0; outer < input.length-1; outer++) {
			for(int inner=outer+1; inner<input.length;inner++) {
				if(input[outer]>input[inner]) {
					swap = input[outer];
					input[outer]= input[inner];
					input[inner] = swap;
				}
			}
		}
		printIntArray(input);
		
	}
	public static void sort(List<Integer> input) {
		int swap;
		printIntList(input);
		for(int outer=0; outer<input.size()-1; outer++) {
			for(int inner=outer+1; inner<input.size(); inner++) {
				if(input.get(outer)>input.get(inner)) {
					swap = input.get(outer);
					input.set(outer, input.get(inner));
					input.set(inner, swap);
				}
			}
		}
		printIntList(input);
		
	}
	
	public int square(int x) {
		return x*x;
		
	}
	
	
	public static void main(String args[]) {
		
		
		List<Integer> list = Arrays.asList(10, 50, 20, 15, 5);
		int[] input = {2,4,6,1,3,8,13,2473,88,4};
		
		
		sort(input);
		System.out.println();
		sort(list);
		
		System.out.println("\nGit Test");
	}
}
