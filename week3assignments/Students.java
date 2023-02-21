package week3.day1.assignments;

public class Students {
	public void getStudentInfo(int id)
	{
   System.out.println("My id number is "+id);
	}
	public void getStudentInfo(int id,String name)
	{
		System.out.println("Name of the "+id+"is "+name);
	}
	public void getStudentInfo(String email,long mobileNo)
	{
		System.out.println("My email address is :"+email);
		System.out.println("My mobileno is :"+mobileNo);
	}
	public static void main(String[] args) {
		Students stu=new Students();
		stu.getStudentInfo(60701);
		stu.getStudentInfo(60701, "Kowsalya");
		stu.getStudentInfo("kowsalya22gmail.com",9077655662L);
	}
}
