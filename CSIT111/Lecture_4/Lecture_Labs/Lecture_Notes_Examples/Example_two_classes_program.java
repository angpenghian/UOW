package UOW.CSIT111.Lecture_4.Lecture_Labs.Lecture_Notes_Examples;

public class Example_two_classes_program {
    private String sName; // a private field that can be accessed via
    // public methods defined in this class

    public String getName() {
        return sName;
    }
}

class AccountSystem {
    public static void main(String[] args) {
        Example_two_classes_program stud1 = new Example_two_classes_program(); // create an object
        String name1 = stud1.getName(); // call a public method to get sName
        System.out.println("Student's name: " + name1);
    }
}