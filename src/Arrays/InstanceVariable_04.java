package Arrays;

//Enhanced or foreach loop


class Student1{
	
	int rollno;
	String name;
	String course;
	
	void getData(int rollno,String name, String course) {
//		this with variable
		this.rollno = rollno;
		this.name = name;
		this.course = course;
		
		System.out.println(rollno+" "+name+" "+course);
	}
}
public class InstanceVariable_04 {
	
	public static void main(String[] args) {
		
		Student1 st = new Student1();
		st.getData(1,"shubhi","full stack with aws");
	}

}
