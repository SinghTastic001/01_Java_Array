package ArrayPractice;
import java.util.Scanner;

public class UserInputArray {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of ary  ");
		int length = sc.nextInt();
		System.out.println("Enter the number here: ");
		
		
		int[] ary = new int[length];
		
		for(int i=0; i<ary.length; i++) {
			int num = sc.nextInt();
			
		}
	}

}
