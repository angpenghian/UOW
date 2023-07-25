// enum data type, it is also considered to be a class
//
// File name: TestEnum_1d.java
//
// How to read an enum constant?
import java.util.Scanner;

enum UOWGrade {HD, D, C, P, F}
	
class TestEnum_1d
{
	public static void main (String [ ] args)
	{
		// Construct a Scanner class object
		Scanner input = new Scanner (System.in);
		
		// How to read an enum constant?
		// - step 1: read in String related to the constant
		// - step 2: convert it to an enum constant
		
		System.out.print ("Enter an UOW grade: ");
		String s = input.next ();
		UOWGrade g = UOWGrade.valueOf (s);
		
		System.out.printf ("==> Your grade = %s%n", g);
	}
}