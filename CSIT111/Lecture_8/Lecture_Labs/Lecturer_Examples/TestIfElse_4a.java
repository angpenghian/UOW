// Design a class to describe what a character is?
//
// ASCII character
// - letters, digits, and other symbols
//
// File name: TestIfElse_4a.java
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
// Explore some user defined methods to handle for some
// of the subtasks


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

class TestIfElse_4a
{
	// This method returns true if ch is an uppercase letter, else return false
	private static boolean isUpperCase (char ch)
	{
		if (ch >= 'A' && ch <= 'Z')
			return true;
		else
			return false;
	}
	
	// This method returns true if ch is a lowercase letter, else return false
	private static boolean isLowerCase (char ch)
	{
		if (ch >= 'a' && ch <= 'z')
			return true;
		else
			return false;
	}
	
	// This method checks if a character is a letter. 
	// - If it is returns true else returns false
	private static boolean isLetter (char ch)
	{
		if (isUpperCase (ch) || isLowerCase (ch))
			return true;
		else
			return false;
	}
	
	// This method checks if a character is a vowel. Returns true if it is; return false otherwise
	private static boolean isVowel (char ch)
	{
			if (ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'i' ||
				 ch == 'I' || ch == 'O' || ch == 'o' || ch == 'U' || ch == 'u')
				 return true;
			else
				return false;
	}
	
	// This method checks if a character is a digit. If it is, returns true; otherwise returns false
	private static boolean isDigit (char ch)
	{
		if (ch >= '0' && ch <= '9')
			return true;
		else
			return false;
	}
	
	// This method test if a character digit is odd. If it is returns true, else returns false
	private static boolean isOdd (char ch)
	{
		int n = ch - '0';
		
		if (n % 2 != 0)
			return true;
		else
			return false;
	}
	
	// This method checks if a character is a space. If it is, returns true, else returns false
	private static boolean isSpace (char ch)
	{
		if (ch == ' ')
			return true;
		else
			return false;
	}
	
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
		if (isLetter (ch))
		{
			ct = CharacterType.LETTER;
			
			if (isUpperCase (ch))
				System.out.println ("==> It is an uppercase letter");
			else
				System.out.println ("==> It is a lowercase letter");
			
			if (isVowel (ch))
				 System.out.println ("==> It is a vowel");
			else
				System.out.println ("==> It is not a vowel");
		}
		else if (isDigit (ch))
		{
			ct = CharacterType.DIGIT;
		
			if (isOdd (ch))
				System.out.println ("==> It is an odd character digit");
			else
				System.out.println ("==> It is an even character digit");
		}
		else
		{
			ct = CharacterType.OTHER;
			
			if (isSpace (ch))
				System.out.println ("==> It is a space");
			else
				System.out.println ("==> It is a non-space symbol");
		}
			
		// Construct MyCharacter object and display it
		MyCharacter mc = new MyCharacter (ch, ct);
		mc.displayInfo ();
	}
}












		