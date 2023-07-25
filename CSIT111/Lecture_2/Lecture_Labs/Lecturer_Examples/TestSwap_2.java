// How to swap two values in Java?
// 
// File name: TestSwap_2.java
class TestSwap_2
{
	public static void main (String [ ] args)
	{
		int m = 123;
		int n = 456;
		
		System.out.println ("Before the swaps");
		System.out.println ("\tm = " + m);
		System.out.println ("\tn = " + n);
		
		// How to swap? We need to use some temporary location(s)
		// to store the information
		int temp = m;
		m = n;
		n = temp;;
		
		System.out.println ("\nAfter the swaps");
		System.out.println ("\tm = " + m);
		System.out.println ("\tn = " + n);
		
	}
}