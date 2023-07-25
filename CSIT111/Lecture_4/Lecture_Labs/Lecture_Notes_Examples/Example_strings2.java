package UOW.CSIT111.Lecture_4.Lecture_Labs.Lecture_Notes_Examples;

public class Example_strings2 {
    /* convert "158" to an integer value 158 */
    public static void main(String[] args) {
        String str1 = args[0]; // read 1st command line argument
        String str2 = args[1]; // read 2nd command line argument

        int num1 = Integer.parseInt(str1); // convert
        int num2 = Integer.parseInt(str2); // convert

        int result = Math.max(num1, num2);
        System.out.print("Max: " + result);

    }
    
}
