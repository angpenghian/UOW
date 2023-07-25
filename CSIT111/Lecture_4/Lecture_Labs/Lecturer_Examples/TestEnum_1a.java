// enum data type
//
// File name: TestEnum_1a.java

class TestEnum_1a
{
	private enum UOWGrade {HD, D, C, P, F}
	
	public static void main (String [ ] args)
	{
		UOWGrade g = UOWGrade.HD;
		System.out.printf ("Your grade = %s%n", g);
	}
}