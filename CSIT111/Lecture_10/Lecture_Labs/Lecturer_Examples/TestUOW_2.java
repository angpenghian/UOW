// A class to describe UOW student
//
// File name: TestUOW_2.java
//
// Note the use of falling thru feature in the switch statement
//
// the use of for loop

enum UOWGrade {HD, D, C, P, F}

class UOW
{
	private static int NO = 2023000;
	
	private int id;
	private double assessment;
	private double exam;
	private int finalMark;
	private UOWGrade g;
	
	public UOW ()
	{
		++NO;
		id = NO;
	}
	
	public UOW (double assessment, double exam)
	{
		this ();
		this.assessment = assessment;
		this.exam = exam;
		computeFinal ();
		computeGrade ();
	}
	
	public UOW (UOW u)
	{
		this (u.assessment, u.exam);
	}
	
	// accessor methods
	public int getID ()
	{
		return id;
	}
	
	public double getAssessment ()
	{
		return assessment;
	}
	
	public double getExam ()
	{
		return exam;
	}
	
	public UOWGrade getGrade ()
	{
		return g;
	}
	
	public int getFinalMark ()
	{
		return finalMark;
	}
	
	// mutator methods
	public void setInfo (double assessment, double exam)
	{
		this.assessment = assessment;
		this.exam = exam;
	}
	
	// Some private methods
	private void computeFinal ()
	{
		double average = (assessment + exam) / 2.0;
		finalMark = (int) (average + 0.5);
	}
	
	private void computeGrade ()
	{
		if (finalMark >= 85)
			g = UOWGrade.HD;
		else if (finalMark >= 75)
			g = UOWGrade.D;
		else if (finalMark >= 65)
			g = UOWGrade.C;
		else if (finalMark >= 50)
			g = UOWGrade.P;
		else
			g = UOWGrade.F;
	}
	
	// A display method
	private void encouragement ()
	{
		System.out.println ("\nSome words from UOW");
		
		switch (g)
		{
			case HD: System.out.println ("\tCongratulations!!! You got HD");
						break;
			case D   : System.out.println ("\tNot bad, you got a distinction");
						break;
			case C   :  System.out.println ("\tYou got a credit");
			case P    : System.out.println ("\tYou pass the subject");
			default  : System.out.println ("\tHope for better grade in future");
		}
	}
	
	public void displayInfo ()
	{
		System.out.printf ("\tStudent id: %d%n", id);
		System.out.printf ("\tAssessment: %.1f%n", assessment);
		System.out.printf ("\tExam mark: %.1f%n", exam);
		System.out.printf ("\tFinal mark: %d%n", finalMark);
		System.out.printf ("\tGrade: %s%n", g);
		
		encouragement ();
	}
}

class TestUOW_2
{
	private static double getMark ()
	{
		return Math.random () * 100;
	}
	
	public static void main (String [ ] args)
	{
		// construct a few students
		
		for (int count = 1; count <= 3; ++count)
		{
			UOW u = new UOW (getMark (), getMark ());
			
			System.out.println ("Student " + count);
			u.displayInfo ();
	
			System.out.println ("-------------------------------------------------------");
		}
		
	}
}







