package week1.day2;

public class IsPrime {
public static void main(String[] args) {
	int num=5;
	int count=0;
	for(int i=1;i<=num-1;i++) 
	{
		if(num%i==0)
		{
			count++;
		}
		
	}
	if(count>2) 
	{
		System.out.println(num+" is not a primenumber");
	}
	else
	{
		System.out.println(num+" is  a primenumber");
	}
}
}
