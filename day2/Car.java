package week1.day2;

public class Car {
	
	public static void main(String[] args) {
		Car c=new Car();
		c.getRegistrationNum();
		c.getownersName();
	    c.carModel();
	    c.isPunctured();
		int product=c.multiplyNumbers(23,34,45);
		System.out.println(product);
		int divide=c.divideNumbers(23,9);
		System.out.println(divide);
		int sub=c.subNumbers(907,756);
		System.out.println(sub);
	}
	public int getRegistrationNum()
	{
		int regNum=3411;
		System.out.println(regNum);
		return regNum;
	}
	private String getownersName()
	{
		String ownersName="Kowsalya";
		System.out.println(ownersName);
		return ownersName;
	}
	void carModel()
	{
		String carModelName="Kia";
		System.out.println("Car model is "+carModelName);
	}
    public boolean isPunctured()
    {
    	boolean carPunctured=false;
    	System.out.println(carPunctured);
    	return carPunctured;
    }
    public int subNumbers(int num1,int num2)
    {
    	return num1-num2;
    }
    public int multiplyNumbers(int num1,int num2,int num3)
    {
    	return num1*num2*num3;
    }
    public int divideNumbers(int num1,int num2)
    {
    	return num1/num2;
    }
    
}
	
	
