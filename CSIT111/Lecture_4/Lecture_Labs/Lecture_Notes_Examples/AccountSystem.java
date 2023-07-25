package UOW.CSIT111.Lecture_4.Lecture_Labs.Lecture_Notes_Examples;

import java.util.Scanner;

public class AccountSystem {
    public static void main(String[] args){
        Scanner keyboard = new Scanner( System.in );
        System.out.print(" Enter a name: ");
        String aName = keyboard.next(); // read a word from the input buffer
        StudentAccount stud1 = new StudentAccount(); // create an object
        stud1.setName( aName ); // call a public method to set private field sName
        String name1 = stud1.getName(); // get a private field via a public method
        System.out.println("Student's name: " + name1);
        keyboard.close();
    }
}
