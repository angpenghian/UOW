// Design a class to describe what a character is?
//
// ASCII character
// - letters, digits, and other symbols
//
// File name: TestSwitch_2
//
// Divide the characters into three types, that is letter, digit and other.
// For each type, we perform some analysis.

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

class TestSwitch_2
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
		switch (ch)
		{
			case 'a':
			case 'A':
			case 'e':
			case 'E':
			case 'i':
			case 'I':
			case 'o':
			case 'O':
			case 'u':
			case 'U': return true; // break statement is not neccessary
			default: return false; 
		}
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
		
		boolean ok;
		
		switch (n % 2)
		{
			case 1: ok = true;
						break;
			default: ok = false;
		}
		
		return ok;
	}
	
	// This method checks if a character is a space. If it is, returns true, else returns false
	private static boolean isSpace (char ch)
	{
		switch (ch)
		{
			case ' ': return true;
			default: return false;
		}
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
		
		// To determine the type of the character
		if (isLetter (ch))
			ct = CharacterType.LETTER;
		else if (isDigit (ch))
			ct = CharacterType.DIGIT;
		else 
			ct = CharacterType.OTHER;
		
		// For each type we perform some analysis
		MyCharacter mc = new MyCharacter (ch, ct);
		mc.displayInfo();
		
		int n;
		
		switch (ct)
		{
			case LETTER: if (isUpperCase (ch))
										System.out.println("==> It is  an uppercase letter");
									else
										System.out.println("==> It is a lowercase letter");
									
									if (isVowel (ch))
										System.out.println("==> It is a vowel");
									else
										System.out.println("==> It is not a vowel");
									break;
			case DIGIT: n = ch - '0';
								 switch (n)
								 {
									 case 0: 
									 case 2:
									 case 4:
									 case 6:
									 case 8: System.out.println("==> It is an even character digit");
												 break;
									 default: System.out.println("==> It is an odd character digit");
								 }
								 break;
			default: switch (ch)
							{
								case ' ': System.out.println("==> It is a space");
											 break;
								default: System.out.println("==> It is a non-space symbol");
							}
		}
	}
}












		