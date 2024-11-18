package ArrayPractice;

public class ReverseArray {
	
	public static void main(String[] args) {
		
		int[] ary = {1,4,7,0,10,3};
		int[] temp = new int[ary.length];
		
		for(int i=0; i<ary.length; i++) {
			
			temp[i]=ary[ary.length-i-1];
			System.out.print(temp[i]+" ");
		}
		
	}

}
