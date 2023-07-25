package UOW.CSIT111.Lecture_4.Lecture_Labs.Lecture_Notes_Examples;

import java.util.Scanner;

public class Example_strings1 {
    public static void main(String[] args){
        String userName = "Peter";
        System.out.print("Enter your name: ");
        Scanner userInput = new Scanner(System.in);
        String typedName = userInput.nextLine();

        boolean theSame = userName.equals(typedName);
        System.out.println("The same? " + theSame);

        userInput.close();
    }
}
