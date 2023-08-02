// Design a class to describe what a character is?
//
// ASCII character
// - letters, digits, and other symbols
//
// File name: TestSwitch_3
//
// Divide the characters into three types, that is letter, digit and other.
// For each type, we perform some analysis.
// 
// Most of the methods should not have parameters

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
	public MyCharacter (char ch)
	{
		this.ch = ch;
		possibleType();
	}
	
	// copy constructor
	public MyCharacter (MyCharacter mc)
	{
		this (mc.ch);
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
	
	private void possibleType()
	{
	// To determine the type of the character
		if (isLetter ())
			ct = CharacterType.LETTER;
		else if (isDigit ())
			ct = CharacterType.DIGIT;
		else 
			ct = CharacterType.OTHER;
	}
	
	// This method returns true if ch is an uppercase letter, else return false
	private boolean isUpperCase ()
	{
		if (ch >= 'A' && ch <= 'Z')
			return true;
		else
			return false;
	}
	
	// This method returns true if ch is a lowercase letter, else return false
	private boolean isLowerCase ()
	{
		if (ch >= 'a' && ch <= 'z')
			return true;
		else
			return false;
	}
	
	// This method checks if a character is a letter. 
	// - If it is returns true else returns false
	private boolean isLetter ()
	{
		if (isUpperCase () || isLowerCase ())
			return true;
		else
			return false;
	}
	
	// This method checks if a character is a vowel. Returns true if it is; return false otherwise
	private boolean isVowel ()
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
	private boolean isDigit ()
	{
		if (ch >= '0' && ch <= '9')
			return true;
		else
			return false;
	}
	
	// This method test if a character digit is odd. If it is returns true, else returns false
	private boolean isOdd ()
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
	private boolean isSpace ()
	{
		switch (ch)
		{
			case ' ': return true;
			default: return false;
		}
	}

	// display method
	public void displayInfo ()
	{
		System.out.printf ("==> Character is \'%c\'. Its type is %s%n", ch, ct);
		futherAnalysis();
	}
	
	private void futherAnalysis()
	{
		int n;
		
		switch (ct)
		{
			case LETTER: if (isUpperCase ())
										System.out.println("==> It is  an uppercase letter");
									else
										System.out.println("==> It is a lowercase letter");
									
									if (isVowel ())
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

class TestSwitch_3
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
		
		
		// For each type we perform some analysis
		MyCharacter mc = new MyCharacter (ch);
		mc.displayInfo();
		
	}
}












		