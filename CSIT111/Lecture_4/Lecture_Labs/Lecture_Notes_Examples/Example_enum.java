package UOW.CSIT111.Lecture_4.Lecture_Labs.Lecture_Notes_Examples;

public class Example_enum {
    public enum Day {MONDAY, TUESDAY, WEDNESDAY, FRIDAY};

    public static void main(String[] args) {
        Day lectureDay; // a varable of type Day
        lectureDay = Day.MONDAY; // OK
        // lectureDay = Day.SUNDAY; // error
        lectureDay = Day.FRIDAY; // OK
        System.out.println(lectureDay); // output: FRIDAY
    }
}