package week3.day1.assignments;

public class ChangeOddIndexToUpperCase {

	private static char[] charArray;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Pseudo Code
		 * 
		 * Declare String Input as Follow
		 * 
		 * String test = "changeme";
		 * 
		 * a) Convert the String to character array
		 * 
		 * b) Traverse through each character (using loop)
		 * 
		 * c)find the odd index within the loop (use mod operator)
		 * 
		 * d)within the loop, change the character to uppercase, if the index is odd
		 * else don't change
		 */
		 String test="changeme";//c,H,a,N,g,E,m,E
		
		char[] ch = test.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(i%2!=0)
			{
				char upperCase = Character.toUpperCase(ch[i]);
				System.out.print(upperCase);
			}
			else
			{
			System.out.print(ch[i]);
			}
	}

}
}
