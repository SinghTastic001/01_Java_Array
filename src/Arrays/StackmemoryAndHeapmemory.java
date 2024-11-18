package Arrays;

class Calculator1 {
	
	int num;
	
	int getAdd(int n1,int n2) {
		return n1+n2;
	}
}

public class StackmemoryAndHeapmemory {

	public static void main(String[] args) {
		
		
		int data = 10;
		
		Calculator1 obj = new Calculator1();
//		obj (stack memory) = new Calculator1() (heap memory)
//		each method have it's stack memory like main method or getAdd method
		
		Calculator1 obj1 = new Calculator1();
		
		int result = obj.getAdd(2, 2);
		
//		stack memory of main and have object like data , obj, obj1, result
		
//		stack memory of getAdd have object value like n1,n2
		
//		heap memory have num, getAdd() of obj and also num , getAdd() object of obj1;
	}
}
