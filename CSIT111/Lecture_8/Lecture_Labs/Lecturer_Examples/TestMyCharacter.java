// Design a class to describe what a character is?
//
// ASCII character
// - letters, digits, and other symbols
//
// File name: TestMyCharacter.java

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

class TestMyCharacter
{
	public static void main (String [ ] args)
	{
		Scanner input = new Scanner (System.in);
		
		// Declare variables
		char ch;
		CharacterType ct;
		
		// Read info
		System.out.print ("Enter a character and its type: ");
		ch = input.next ().charAt (0);
		ct = CharacterType.valueOf (input.next ());
		
		// Construct MyCharacter object
		MyCharacter mc = new MyCharacter (ch, ct);
		
		// Display the object
		mc.displayInfo ();
	}
}
		