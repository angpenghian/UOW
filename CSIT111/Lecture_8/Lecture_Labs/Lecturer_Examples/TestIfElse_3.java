// Design a class to describe what a character is?
//
// ASCII character
// - letters, digits, and other symbols
//
// File name: TestIfElse_3.java
//
// We wish to see if a character entered is a letter? 
// - If it is letter
//   : assign character type to LETTER
//   : Is it uppercase or lower?
//     :: display some info
//   : Is it a vowel? 
//     :: display some info
// - If it is digit?
//   : Is it odd or even? display some info
// - If it is not, also display some info
//   : Is it a space or a non space symbol?
//
// Not the use of nextLine method to enter a character space


import java.util.Scanner;

enum CharacterType {LETTER, DIGIT, OTHER}

class MyCharacter
{
	private char ch;
	private CharacterType ct;
	
	// default constructor
	public MyCharacter ()
	{
		// ch is a space
		// by ct is null
		ct = CharacterType.OTHER;
	}
	
	// other constructor
	public MyCharacter (char ch, CharacterType ct)
	{
		this.ch = ch;
		this.ct = ct;
	}
	
	// copy constructor
	public MyCharacter (MyCharacter mc)
	{
		this (mc.ch, mc.ct);
	}
	
	// Accessor methods
	public char getChar ()
	{
		return ch;
	}
	
	public CharacterType getType ()
	{
		return ct;
	}
	
	// Mutator methods
	public void setCharacter (char ch)
	{
		this.ch = ch;
	}
	
	public void setType (CharacterType ct)
	{
		this.ct = ct;
	}
	
	public void setInfo (char ch, CharacterType ct)
	{
		this.ch = ch;
		this.ct = ct;
	}
	
	// display method
	public void displayInfo ()
	{
		System.out.printf ("==> Character is \'%c\'. Its type is %s%n", ch, ct);
	}
}

class TestIfElse_3
{
	public static void main (String [ ] args)
	{
		Scanner input = new Scanner (System.in);
		
		// Declare variables
		char ch;
		CharacterType ct;
		
		// Get a character from the user
		// Note the use of nextLine method
		System.out.print ("Enter a character: ");
		ch = input.nextLine ().charAt (0);
		
		// To check if the character is letter or digit or others
		if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
		{
			ct = CharacterType.LETTER;
			
			if (ch >= 'A' && ch <= 'Z')
				System.out.println ("==> It is an uppercase letter");
			else
				System.out.println ("==> It is a lowercase letter");
			
			if (ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'i' ||
				 ch == 'I' || ch == 'O' || ch == 'o' || ch == 'U' || ch == 'u')
				 System.out.println ("==> It is a vowel");
			else
				System.out.println ("==> It is not a vowel");
		}
		else if (ch >= '0' && ch <= '9')
		{
			ct = CharacterType.DIGIT;
			
			if (ch == '0' || ch == '2' || ch == '4' || ch == '6' || ch == '8')
				System.out.println ("==> It is an even character digit");
			else
				System.out.println ("==> It is an odd character digit");
		}
		else
		{
			ct = CharacterType.OTHER;
			
			if (ch == ' ')
				System.out.println ("==> It is a space");
			else
				System.out.println ("==> It is a non-space symbol");
		}
			
		// Construct MyCharacter object and display it
		MyCharacter mc = new MyCharacter (ch, ct);
		mc.displayInfo ();
	}
}












		