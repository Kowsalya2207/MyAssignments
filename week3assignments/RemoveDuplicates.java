package week3.day1.assignments;

public class RemoveDuplicates {

	public static void main(String[] args) {
		/*
		 * Pseudo code
		 * 
		 * a) Use the declared String text as input String text =
		 * "We learn java basics as part of java sessions in java week1"; b) Initialize
		 * an integer variable as count c) Split the String into array and iterate over
		 * it d) Initialize another loop to check whether the word is there in the array
		 * e) if it is available then increase and count by 1. f) if the count > 1 then
		 * replace the word as ""
		 * 
		 * g) Displaying the String without duplicate words
		 */
		String text = "We learn java basics as part of java sessions in java week1";
		int count = 0;
		String str[] = text.split(" ");
		for (int i = 0; i < str.length; i++) {
			for (int j = 1; j < str.length; j++) {
				if (str[i] == str[j]) {
					count++;
				}
			}
		

			if (count > 1) {
				
				String relaced = text.replace(str[i], "");
				System.out.print(relaced);
				break;

			}

		}
	}
}
