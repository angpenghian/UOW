// What is an UOW student?
//  - Every UOW student is a student
//  - Every UOW student enrols to a program
//
// Questions arise ....
//  - What is a student?
//  - What is a program?
//
// File name: TestStudent_3.java
//Extract information from a data file call student.txt and process the file
import java.io.IOException;
import java.io.File;
import java.util.Scanner;

enum UOWProgram {BBIS, BMM, BSS, BBD}

class Student
{ 
	private static int No=2023000;
	private String name;
	private int id;
	private char gender;
	
	public Student ()
	{ 
		++No;
		id= No;
	}
	
	public Student (String name , char gender )
	{
		++No ;
		id=No;
		this.name=name;
		this.gender=gender;
	}
	
	public Student (Student s)
	{
		this(s.name, s.gender);
	}
	
	//Accessor Method
	public int getId ()
	{
		return id;
	}
	
	public String getName()
	{
		return name ;
	}
	
	public char getGender()
	{
		return gender;
	}
	
	public void setInfo(String name , char gender)
	{
		this.name=name;
		this.gender=gender;
	}
	
	public void displayInfo ()
	{
		System.out.printf("Name: %s%n", name);
		System.out.printf("Student Id: %d%n", id);
		System.out.printf("Gender: %c%n", gender);
	}
}
	
class Program
{
		private UOWProgram up;
		private String description;
		
		public Program ()
		{
		}
		
		public Program (UOWProgram up , String description)
		{
			this.up=up;
			this.description=description;
		}
		
		public Program (Program p)
		{
			this(p.up, p.description);
		}
		
		//Access Method
		public UOWProgram getProgram()
		{
			return up;
		}
		
		public String getDescription ()
		{
			return description;
		}
		
		//Mutator Method
		public void setInfo (UOWProgram up , String description )
		{
			this.up=up;
			this.description=description;
		}
		
		public void displayInfo ()
		{
			System.out.printf("Degree info: %s%n", up);
			System.out.printf("Description: %s%n", description);
		}
}

				
 class UOWStudent
 {
	 private Student s;
	 private Program p;
	 
	 public UOWStudent()
	 {
	 }
	 
	 public UOWStudent ( Student s , Program p)
	 {
		 //this.s=s;
		 //this.p=p;
		 this.s=new Student(s);
		 this.p=new Program(p);
	 }
	 
	 public UOWStudent (UOWStudent us )
	 {
		 this(us.s, us.p);
	 }

		public Student getStudent ()
		{
			return s;
		}
		
		public Program getProgram()
		{
			return p;
		}
		
		public void setInfo(Student s, Program p)
		{
		 //this.s=s;
		 //this.p=p;
		 this.s=new Student(s);
		 this.p=new Program(p);
		}
		
		public void displayInfo ()
		{
			s.displayInfo();
			p.displayInfo();
		}
 }
 
			
 
class TestStudent_3
{
	public static void main (String [ ] args) throws IOException
	{
		//Construct a scanner class object
		Scanner input = new Scanner(new File("student.txt"));

		//Extract information from the data file
		String name=input. nextLine();
		char gender =input.next().charAt(0);
		UOWProgram up = UOWProgram.valueOf(input.next());
		
		//Clear the input buffer, which is the enter key
		input.nextLine();
		
		String description= input.nextLine();
		
		//Construct 2 Object
		Student s =new Student(name, gender);
		Program p=new Program(up, description);
		
		//Construct UOW Student Object
		UOWStudent us=new UOWStudent(s , p);
		us.displayInfo();
		
		
	}
}