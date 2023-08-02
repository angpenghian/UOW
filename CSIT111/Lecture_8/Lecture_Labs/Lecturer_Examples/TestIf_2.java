// Design a class to describe what a character is?
//
// ASCII character
// - letters, digits, and other symbols
//
// File name: TestIf_2.java
//
// We wish to see if a character entered is a letter? 
// - If it is, display some info.
//        ==> Is it a vowel? if it is, display some info

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

class TestIf_2
{
	public static void main (String [ ] args)
	{
		Scanner input = new Scanner (System.in);
		
		// Declare variables
		char ch;
		CharacterType ct = CharacterType.OTHER;		// must initialize
		
		// Get a character from the user
		System.out.print ("Enter a character: ");
		ch = input.next ().charAt (0);
		
		// To check if the character is a letter
		if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
		{
			ct = CharacterType.LETTER;
			
			if (ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' ||
				ch == 'i' || ch =='O' || ch == 'o' || ch == 'U' || ch == 'u')
				System.out.println ("==> It is a vowel");
		}
		
		// Construct MyCharacter object and display it
		MyCharacter mc = new MyCharacter (ch, ct);
		mc.displayInfo ();
	}
}












		