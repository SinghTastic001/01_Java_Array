package Arrays;

class Student{
	
	int RollNo;
	String Name;
	String Course;
//	this are instance variable means create inside class not inside method
}

public class ArrayOfObject_03 {
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		s1.RollNo = 1;
		s1.Name = "shubhi";
		s1.Course = "full Stack development";
		
		Student s2 = new Student();
		s2.RollNo = 2;
		s2.Name = "Pushpa";
		s2.Course = "Data Science";
		
		Student s3 = new Student();
		s3.RollNo = 1;
		s3.Name = "Poonam";
		s3.Course = "Data Analyst";
		
		Student[] student = new Student[3];
		student[0]=s1;
		student[1]=s2;
		student[2]=s3;
		
		
		
//		for(int i=0; i<student.length; i++) {
//			
//			System.out.println(student[i].RollNo +" "+student[i].Name+" "+student[i].Course);
//		}
		
//		System.out.println();
		
		System.out.println(s3.Course);
	}
	
//	this is foreach or enchanced loop
//	for(Student stud : student) {
//		System.out.println(stud.RollNo+" "+stud.Name+" "+stud.Course);
//		
//	}
	

}
