package week3.day1.assignments;

public class Desktop extends Computer {
      public void noOfKeyboard() {
		// TODO Auto-generated method stub
System.out.println("There is one keyboard is used");
	}
      public static void main(String[] args) {
		Desktop desk=new Desktop();
		desk.operatingSystem();
		desk.systemModel();
		desk.windowsModel();
		desk.noOfKeyboard();
	}
}
