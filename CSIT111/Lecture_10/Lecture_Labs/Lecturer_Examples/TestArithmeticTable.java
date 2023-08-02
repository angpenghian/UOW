// The design of arithmetic table
//
//    *		1		2		3							+		1		2		3
//    1		1		2		3							1		2		3		4
//    2		2		4		6							2		2		4		5
//    3		3		6		9							3		4		5		6
//
// File name: TestArithmeticTable.java

class ArithmeticTable
{
	private int n;					// the size of the table
	private char operator;		// + - * / %
	
	public ArithmeticTable (int n, char operator)
	{
		this.n = n;
		this.operator = operator;
	}
	
	private int getValue (int i, int j)
	{
		switch (operator)
		{
			case '+' : return i + j;
			case '-': return i - j;
			case '*' : return i * j;
			case '/' : return i / j;
			default: return i % j;
		}
	}
	
	public void displayTable ()
	{
		System.out.printf ("%-5s", operator);
		for (int i = 1; i <= n; i++)
			System.out.printf ("%-5d", i);
		System.out.println ();
		
		for (int i = 1; i <= n; i++)
		{
			System.out.printf ("%-5d", i);
			
			for (int j = 1; j <= n; j++)
			{
				System.out.printf ("%-5d", getValue (i, j));
			}
			
			System.out.println ();
		}
	}
}

class TestArithmeticTable
{
	private static char getOperator ()
	{
		int k = (int) (Math.random () * 5);
		
		switch (k)
		{
			case 0: return '+';
			case 1: return '-';
			case 2: return '*';
			case 3: return '/';
			default: return '%';
		}
	}
	
	private static int getSize ()
	{
		return (int) (Math.random () * 5) + 5;
	}
	
	public static void main (String [] arg)
	{
		for (int i = 1; i <= 3; i++)
		{
			ArithmeticTable at  = new ArithmeticTable (getSize (), getOperator ());
			at.displayTable ();
			
			System.out.println ();
		}
	}
}