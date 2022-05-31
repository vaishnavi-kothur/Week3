package Week3.day1;

public class Students {
  public static void main(String args[])
  {
	  Students s= new Students();
	  int x=10;
	  String studentName= "Vaishnavi";
	  String email = "kothurvaish@gmail.com";
	 String phone ="9964771722";
	  s.getStudentInfo(x);
	  s.getStudentInfo(x, studentName);
	  s.getStudentInfo(email, phone);
	  s.getStudentInfo(x,x);
  }
  
  public void getStudentInfo(int id)
  {
	  int x=5;
	  System.out.println("Student ID is : "+id);
  }
  public void getStudentInfo(int id, String name)
  {
	  int x=5;
	  String studentName= "Vaishnavi";
	  System.out.println("Student ID is : "+id+ "\nStudent Name is " +name);
  }
  public void getStudentInfo(String email, String phone)
  {
	  //string email
	  System.out.println("Student email is : "+email +"\nStudent Phone number is " +phone);
  }
}
