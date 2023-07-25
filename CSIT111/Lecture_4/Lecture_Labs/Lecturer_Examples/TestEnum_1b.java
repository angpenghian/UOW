// enum data type
//
// File name: TestEnum_1b.java
//
// The use of valueOf method defined in the String class

class TestEnum_1b
{
	private enum UOWGrade {HD, D, C, P, F}
	
	public static void main (String [ ] args)
	{
		UOWGrade g = UOWGrade.HD;
		System.out.printf ("Your grade = %s%n", String.valueOf (g));
	}
}