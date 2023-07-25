// Explore the concept of passing by reference(s)
//
// File name: PassByReference_1.java

class MyInteger
{
	private int value;
	
	public MyInteger (int value)
	{
		this.value = value;
	}
	
	public int getValue ()
	{
		return value;
	}
	
	public void setValue (int value)
	{
		this.value = value;
	}
}

class PassByReference_1
{
	private static void swap (MyInteger m1, MyInteger m2)
	{
		MyInteger temp = m1;
		m1 = m2;
		m2 = temp;
		
		System.out.println ("\nInside the swap method");
		System.out.printf ("\tValue stored in m1 = %d%n", m1.getValue ());
		System.out.printf ("\tValue stored in m2 = %d%n", m2.getValue ());	
	}
	
	public static void main (String [] args)
	{
		MyInteger m1 = new MyInteger (123);
		MyInteger m2 = new MyInteger (456);
		
		System.out.println ("Information stored in m1 and m2 in main method");
		System.out.printf ("\tValue stored in m1 = %d%n", m1.getValue ());
		System.out.printf ("\tValue stored in m2 = %d%n", m2.getValue ());
		
		// Intend to swap
		swap (m1, m2);
		
		System.out.println ("\nInformation stored in m1 and m2 in main method remain unchanged");
		System.out.printf ("\tValue stored in m1 = %d%n", m1.getValue ());
		System.out.printf ("\tValue stored in m2 = %d%n", m2.getValue ());
	}
}