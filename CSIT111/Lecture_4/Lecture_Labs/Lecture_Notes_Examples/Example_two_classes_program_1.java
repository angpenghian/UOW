package UOW.CSIT111.Lecture_4.Lecture_Labs.Lecture_Notes_Examples;

import java.util.Scanner;

public class Example_two_classes_program_1 {
    private String sName;
    public String getName() { return sName; }
    public void setName(String name) { sName = name; }
}

class AccountSystem {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print(" Enter a name: ");
        String aName = keyboard.next(); // read a word

        Example_two_classes_program_1 stud1 = new Example_two_classes_program_1(); // create an object
        stud1.setName(aName); // call a public method to set sName
        String name1 = stud1.getName(); // get a private field
        
        System.out.println("Student's name: " + name1);
        keyboard.close();
    }
}