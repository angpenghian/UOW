// enum data type
//
// File name: TestEnum_1.java

class TestEnum_1
{
	private enum UOWGrade {HD, D, C, P, F}
	
	public static void main (String [ ] args)
	{
		UOWGrade g = UOWGrade.HD;
		System.out.println ("Your grade = " + g);
	}
}