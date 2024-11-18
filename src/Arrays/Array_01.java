package Arrays;
import java.util.Scanner;

//array is a collection of value which have same data type
//single dimensional array and multidimensional array we have
//single :-  int[] ar = {1,2,5,6} ....here lenght are predefined
//multidimensional :-  int[][]  ar1 = new int[3][3] .....here length defined of array
// array indexing start with zero

public class Array_01 {
	
	public static void main(String[] args) {
//		
//		int[] ary = {2,5,8 ,1,4};
//		
//		System.out.println(ary[1]);
//		System.out.println(ary[0]);
//		
//		ary[3]=5;
//		System.out.println(ary[3]);
		
//		------------------------------------------------------------------------Single dimensional predefine arry end here -------------------------------------------------
		
		
//		int[] ary = new  int[4];
//		
//		ary[0]=3;
//		ary[1]=5;
//		ary[2]=6;
//		ary[3]=7;
//		
//		
//		
//		for(int i=0; i<ary.length; i++) {
//			
//			System.out.println(ary[i]);
//		}
		
//		------------------------------------------------single length define arry end here----------------------------------------------------------------------------
		
		
		
//		int[] ary = new int[4];
//		System.out.println("Enter the number here");
//		Scanner sc = new Scanner(System.in);	
//		
////		int num = sc.nextInt();
//		
//		for(int i=0;i<ary.length;i++) {
//			
//			ary[i]=sc.nextInt();
//			
//		}
//		System.out.println();
//		
//		for(int i=0; i<ary.length;i++) {
//			System.out.print(ary[i]);
//		}
//		System.out.println();
		
//		---------------------------------------------------------user input single arry end here--------------------------------------------------------------------
		
		
		
		int[][] ary = new int[3][4];
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("ENter here number");
		
		for(int i=0; i<3; i++) {
			
			for(int j=0; j<4;j++) {
				
				ary[i][j]=sc.nextInt();
			}
		}
		
		System.out.println();
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(ary[i][j]+" ");
			}
			System.out.println();
		}
		
		
	
	}

}
