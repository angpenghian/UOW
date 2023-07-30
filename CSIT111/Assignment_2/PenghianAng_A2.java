// Full name: Penghian Ang
// Java version: 17.0.7, 64 bit
// Tutorial Group:
// Declaration: I declare that this assignment is my own work and i have not passed this progranm to anyone else.
// I am willing to accept whatever penalty given to you. 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

enum Month {
    Jan, Feb, Mar, Apr, May, June, July, Aug, Sept, Oct, Nov, Dec
}

class Date {
    private int day;
    private Month month;
    private int year;

    public Date() {
        day = 1;
        month = Month.Jan;
        year = 2022;
    }

    public Date(int day, Month month, int year) {
        this.day = day;
        this.year = year;
        this.month = month;
    }

    public int getDay() {
        return this.day;
    }

    public Month getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public void setDay(int day, Month month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
}

class Name {
    private String firstName;
    private String lastName;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }
}

class Height {
    private int feet;
    private int inches;

    public Height() {
        feet = 0;
        inches = 0;
    }

    public Height(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    public int getFeet() {
        return this.feet;
    }

    public int getInches() {
        return this.inches;
    }

    void setHeight(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    public double getHeightInmeter() {
        double NewHeightFeet = (getFeet() / 3.281);
        double NewHeightInches = (getInches() / 39.37);
        double newHEIGHT = NewHeightFeet + NewHeightInches;
        return newHEIGHT;
    }
}

class HealthProfile {
    private Name name;
    private Date dob;
    private Height h;
    private double weight;
    private int currentYear;

    public HealthProfile(Name name, Date dob, Height h, double weight, int currentYear) {
        this.name = name;
        this.dob = dob;
        this.h = h;
        this.weight = weight;
        this.currentYear = currentYear;
    }

    public Name getName() {
        return this.name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Date getDOB() {
        return this.dob;
    }

    public Height getHeight() {
        return this.h;
    }

    public double getWeight() {
        return weight;
    }

    public void setDOB(Date dob) {
        this.dob = dob;
    }

    public void setHeight(Height h) {
        this.h = h;
    }

    public int getCurrentYear() {
        return currentYear;
    }

    public int getAge() {
        int ActualAge = getCurrentYear() - dob.getYear();
        return ActualAge;
    }

    private int getMaximumHeartRate() {
        int Hr = 220 - getAge();
        return Hr;
    }

    private double getMinimumTargetHeartRate() {
        double Minhr = 0.50 * getMaximumHeartRate();
        return Minhr;
    }

    private double getMaximumTargetHeartRate() {
        double Maxhr = 0.85 * getMaximumHeartRate();
        return Maxhr;
    }

    double getBMI() {
        double bmi = getWeight() / (h.getHeightInmeter() * h.getHeightInmeter());
        return bmi;
    }

    public void printInfo() {
        System.out.printf("Name: %s%s%s%n", name.getFirstName(), ", ", name.getLastName());
        System.out.printf("Date of birth: %d %s %d%n", dob.getDay(), dob.getMonth(), dob.getYear());
        System.out.printf("Your weight: %.1fkg%n", getWeight());
        System.out.printf("Your height: %d%s%d%s ", h.getFeet(), " feet ", h.getInches(), " inches");
        System.out.printf("equivalent to %.2f in meters%n", h.getHeightInmeter());
        System.out.printf("Current Year: %d%n", getCurrentYear());
        System.out.printf("Your age: %d years old%n", getAge());
        System.out.printf("Clinical analysis, based on your age: %n");
        System.out.printf("         1.Your maximum heart rate is %d%n", getMaximumHeartRate());
        System.out.printf("         2.Your minimum target heart rate is %.2f%n", getMinimumTargetHeartRate());
        System.out.printf("         3.Your maximum target heart rate is %.2f%n", getMaximumTargetHeartRate());
        System.out.printf("Your BMI is %.1f%n", getBMI());
        System.out.printf("%-35s%-15s %n", "         Weight Category", "Range");
        System.out.printf("%-35s%-15s %n", "         Underweight / too low", "below 18.5");
        System.out.printf("%-35s%-15s %n", "         Healthy Range", "18.5-25");
        System.out.printf("%-35s%-15s %n", "         Overweight", "25-30");
        System.out.printf("%-35s%-15s %n", "         Obese", "30-35");
        System.out.printf("%-35s%-15s %n", "         Severe Obesity", "35-40");
        System.out.printf("%-35s%-15s %n", "         Morbid Obesity", "over 40");

    }
}

public class PenghianAng_A2 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new File("/Users/v_fphhang/Desktop/personal-projects/UOW/CSIT111/Assignment_2/input.txt"));

        String firstName = input.nextLine();
        String lastName = input.nextLine();
        int day = input.nextInt();
        String month = input.next();
        int Year = input.nextInt();
        Date dob = new Date(day, Month.valueOf(month), Year);
        int feet = input.nextInt();
        int inches = input.nextInt();
        Height h = new Height(feet, inches);
        double weight = input.nextDouble();
        int currentYear = input.nextInt();
        HealthProfile hp1 = new HealthProfile(new Name(firstName, lastName), dob, h, weight, currentYear);

        String firstPatient = "\nFirst patient";
        out.println(firstPatient);
        String firstLine = new String(new char[firstPatient.length()]).replace('\0', '-');
        out.println(firstLine + "\n");
        hp1.printInfo();

        input.nextLine(); // Consume newline left-over
        System.out.println();
        System.out.println();

        firstName = input.nextLine();
        lastName = input.nextLine();
        day = input.nextInt();
        month = input.next();
        Year = input.nextInt();
        dob = new Date(day, Month.valueOf(month), Year);
        feet = input.nextInt();
        inches = input.nextInt();
        h = new Height(feet, inches);
        weight = input.nextDouble();
        currentYear = input.nextInt();
        HealthProfile hp2 = new HealthProfile(new Name(firstName, lastName), dob, h, weight, currentYear);
        System.out.println("Second patient");
        hp2.printInfo();

        input.close();
    }
}
