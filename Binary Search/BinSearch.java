package binsearch;
import java.util.Scanner;
import java.util.Arrays;

public class BinSearch {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] input = new int[5];
		for(int i=0; i<input.length; i++) {
			input[i] = scan.nextInt();
		}
		Arrays.sort(input);

		
		int target = scan.nextInt();
		
		Find f = new Find();
		
		System.out.println(f.finder(input, target));

	}
}
