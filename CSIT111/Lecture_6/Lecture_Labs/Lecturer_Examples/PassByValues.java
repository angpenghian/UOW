// Explore the concept of passing by values
//
// File name: PassByValues.java

class PassByValues
{
	private static void swap (int m, int n)
	{
		int temp = m;
		m = n;
		n = temp;
		
		System.out.println ("\nInside the swap method");
		System.out.printf ("\tm = %d%n", m);
		System.out.printf ("\tn = %d%n", n);
	}
	
	public static void main (String [ ] args)
	{
		int m = 123;
		int n = 456;
		
		System.out.println ("Before the swaps, values in main method are");
		System.out.printf ("\tm = %d%n", m);
		System.out.printf ("\tn = %d%n", n);
		
		swap (m, n);
		
		System.out.println ("\nValues stored in main method remain unchanged");
		System.out.printf ("\tm = %d%n", m);
		System.out.printf ("\tn = %d%n", n);
	}
}
