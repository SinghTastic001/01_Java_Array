package ArrayPractice;
import java.util.Scanner;

public class SumMatrix {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a matrix1 number : ");
		int[][] m1 = new int[3][3];
		
		for(int i=0; i<m1.length; i++) {
			for(int j=0; j<m1[i].length; j++) {
				m1[i][j]= sc.nextInt();
			}
		}
		System.out.println("Enter a matrix2 here: ");
		int[][] m2 = new int[3][3];
		
		for(int i=0; i<m2.length; i++) {
			
			for(int j=0; j<m2[i].length; j++) {
				m2[i][j] = sc.nextInt();
			}
		}
		
		int[][] sum = new int[3][3];
		
		for(int i=0; i<m1.length; i++) {
			for(int j=0; j<m1[i].length; j++) {
				sum[i][j] = m1[i][j]+m2[i][j];
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
	

}
