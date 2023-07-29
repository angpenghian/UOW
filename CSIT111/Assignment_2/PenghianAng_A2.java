// Month enumeration
public enum Month {
    JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC
}

// Name class
public class Name {
    private String firstName;
    private String lastName;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

// Date class
public class Date {
    private int day;
    private Month month;
    private int year;

    public Date() {
        this.day = 1;
        this.month = Month.JAN;
        this.year = 2023;
    }

    public Date(int day, Month month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return this.day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public Month getMonth() {
        return this.month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

// Height class
public class Height {
    private int feet;
    private int inches;

    public Height(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    public int getFeet() {
        return this.feet;
    }

    public void setFeet(int feet) {
        this.feet = feet;
    }

    public int getInches() {
        return this.inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

    public double toMeter() {
        int totalInches = (this.feet * 12) + this.inches;
        return totalInches * 0.0254;  // Convert inches to meters
    }
}

// HealthProfile class
public class HealthProfile {
    private Date dob;
    private Height height;
    private double weight;
    // ... other variables like gender, physical activity level etc.

    public HealthProfile(Date dob, Height height, double weight) {
        this.dob = dob;
        this.height = height;
        this.weight = weight;
    }

    // ... getter and setter methods ...

    public int getMaxHeartRate() {
        // 220 - age is a commonly used formula to estimate max heart rate
        int age = // calculate age using dob;
        return 220 - age;
    }

    public int[] getTargetHeartRate() {
        int max = getMaxHeartRate();
        return new int[]{(int) (max * 0.5), (int) (max * 0.85)};
    }

    public double getBMI() {
        double heightInMeters = this.height.toMeter();
        return this.weight / (heightInMeters * heightInMeters);
    }

    public void printHealthProfile() {
        // print the health profile details
    }
}

public class PenghianAng_A2 {
    public static void main(String[] args) {
        // Create a new HealthProfile object
        // ... set the values for the object
        // ... print the health profile details
    }
}
```