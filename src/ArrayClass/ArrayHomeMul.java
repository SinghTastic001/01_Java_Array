package ArrayClass;
import java.util.Scanner;

public class ArrayHomeMul {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter martrix number1 here: ");
		int[][] m1 = new int[3][3];
		
		for(int i=0; i<m1.length; i++) {
			for(int j=0; j<m1[i].length; j++) {
				m1[i][j] = sc.nextInt();
			}
		}
		for(int i=0; i<m1.length; i++) {
			for(int j=0; j<m1[i].length; j++) {
				System.out.print(m1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("Enter martrix number2 here: ");
		int[][] m2 = new int[3][3];
		
		for(int i=0; i<m2.length; i++) {
			for(int j=0; j<m2[i].length; j++) {
				m2[i][j] = sc.nextInt();
			}
		}
		for(int i=0; i<m2.length; i++) {
			for(int j=0; j<m2[i].length; j++) {
				System.out.print(m2[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
