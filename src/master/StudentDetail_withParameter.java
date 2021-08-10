package master;

public class StudentDetail_withParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Student Details");
		
		StudentDetail_withParameter s=new StudentDetail_withParameter();
		s.firstclass("Mukesh", 21, 85.99f);
		subject("Physics", "Chemistry", "Biology", "Mathamatics");
		
		

	}
	
	public void firstclass(String name, int Rollno, float mark)
	{
		System.out.println("Student Name is "+name);
		System.out.println("Student Name is "+Rollno);
		System.out.println("Student Name is "+mark+"%");
	}
	
	public static void subject(String Sub1, String Sub2, String Sub3, String Sub4)
	{
		
	System.out.println("Subject Details are "+Sub1+", "+Sub2+", "+Sub3+", "+Sub4 );
		
	}
	
	

}
