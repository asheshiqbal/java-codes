package palindrome;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		
		Check c = new Check();
		
		if(c.isPal(input))
			System.out.println("Y");
		else System.out.println("N");
	}
}
