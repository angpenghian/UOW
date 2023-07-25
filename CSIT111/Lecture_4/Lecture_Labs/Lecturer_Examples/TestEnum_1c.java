// enum data type, it is also considered to be a class
//
// File name: TestEnum_1c.java
//
// We prefer to declare enum class outside of a class

enum UOWGrade {HD, D, C, P, F}
	
class TestEnum_1c
{
	public static void main (String [ ] args)
	{
		UOWGrade g = UOWGrade.HD;
		System.out.printf ("Your grade = %s%n", String.valueOf (g));
	}
}