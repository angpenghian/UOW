package UOW.CSIT111.Lecture_4.Lecture_Labs.Lecture_Notes_Examples;

public class Example_another_method {
    public static void main(String[] args){
        System.out.println("This is main() method");
        sayHello();
        System.out.println("This is main() method again");
    }

    public static void sayHello(){
        System.out.println(" > This is sayHello() method - Hello!");
        return;
    }
}
