// The use of / and % operators
// 
// File name: TestOperators.java

class TestOperators
{
	public static void main (String [ ] args)
	{
		int m = 1234;
		
		// How to get the last digit of m?
		int lastDigit = m % 10;
		System.out.println ("The last digit of " + m + " is " + lastDigit);
		
		// What about the last 2 digits of m?
		int last2Digits = m % 100;
		System.out.println ("The last 2 digits of " + m + " are " + last2Digits);	
		
		// How to remove the last digit of m?
		System.out.print ("After removing the last digit of " + m);
		m = m / 10;			// Integer division
		System.out.println (", the new integer is " + m);
	}
}