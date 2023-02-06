package week1.day2;

public class Fibbinocci {
	public static void main(String[] args) {
		int num1=0;
		int num2=1;
		int sum;
		System.out.println(num1);
		
		for(int k=1;k<11;k++)
		{
			sum=num1+num2;//1 1
			num1=num2;//0 1
			num2=sum;//11
			System.out.println(num1);//1
		}
	}

}
