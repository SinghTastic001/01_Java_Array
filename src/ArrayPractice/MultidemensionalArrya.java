package ArrayPractice;

public class MultidemensionalArrya {
	
	public static void main(String[] args) {
		
		int[][] ary = {{5,6,3,6},{2,4,8,1,2},{5,7}};
		
		for(int i=0; i<ary.length; i++) {
			
//			System.out.println(ary[i]);
			for(int j=0; j<ary[i].length; j++) {
				System.out.print(ary[i][j]+" ");
			}
			System.out.println();
		}
	}

}
