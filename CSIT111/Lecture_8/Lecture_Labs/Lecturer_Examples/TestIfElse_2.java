// Design a class to describe what a character is?
//
// ASCII character
// - letters, digits, and other symbols
//
// File name: TestIfElse_2.java
//
// We wish to see if a character entered is a letter? 
// - If it is letter
//   : assign character type to LETTER
//   : Is it uppercase or lower?
//     :: display some info
//   : Is it a vowel? 
//     :: display some info
// - If it is not, also display some info
//   : Is it a digit? display some info


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

class TestIfElse_2
{
	public static void main (String [ ] args)
	{
		Scanner input = new Scanner (System.in);
		
		// Declare variables
		char ch;
		CharacterType ct;
		
		// Get a character from the user
		System.out.print ("Enter a character: ");
		ch = input.next ().charAt (0);
		
		// To check if the character is a letter or not a letter
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
		else
		{
			ct = CharacterType.OTHER;
			
			if (ch == '0' || ch == '1' || ch == '2' || ch == '3' || ch == '4'  ||
				ch == '5' || ch == '6' || ch == '7' || ch == '8' || ch == '9')
				System.out.println ("==> It is a character digit");
			else
				System.out.println ("==> It is other non-digit symbol");
		}
			
		
		// Construct MyCharacter object and display it
		MyCharacter mc = new MyCharacter (ch, ct);
		mc.displayInfo ();
	}
}












		