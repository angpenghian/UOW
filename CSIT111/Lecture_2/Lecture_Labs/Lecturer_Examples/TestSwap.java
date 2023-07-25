// How to swap two values in Java?
// 
// File name: TestSwap.java
class TestSwap
{
	public static void main (String [ ] args)
	{
		int m = 123;
		int n = 456;
		
		System.out.println ("Before the swaps");
		System.out.println ("\tm = " + m);
		System.out.println ("\tn = " + n);
		
		// How to swap? Can I do ... no, m and n will have the same values
		m = n;
		n = m;
		
		System.out.println ("\nAfter the swaps");
		System.out.println ("\tm = " + m);
		System.out.println ("\tn = " + n);
		
	}
}