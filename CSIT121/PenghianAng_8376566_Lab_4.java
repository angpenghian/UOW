package UOW.CSIT121;
// Full name: Penghian Ang
// Java version: 17.0.7, 64 bit
// Tutorial Group: tutorial 1
// Declaration: I declare that this assignment is my own work and i have not passed this progranm to anyone else.
// I am willing to accept whatever penalty given to you. 

import java.util.Scanner;

class InvalidHrExcep extends Exception {
    private String message;

    public InvalidHrExcep() {
        message = "The values of hours must be between 0 and 12";
    }

    public InvalidHrExcep(String str) {
        this.message = str;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return String.format("%s", getMessage());
    }
}

class InvalidMinExcep extends Exception {
    private String message;

    public InvalidMinExcep() {
        message = "The values of minutes must be between 0 and 59";
    }

    public InvalidMinExcep(String str) {
        this.message = str;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return String.format("%s", getMessage());
    }
}

class InvalidSecExcep extends Exception {
    private String message;

    public InvalidSecExcep() {
        message = "The values of seconds must be between 0 and 59";
    }

    public InvalidSecExcep(String str) {
        this.message = str;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return String.format("%s", getMessage());
    }
}

public class PenghianAng_8376566_Lab_4 {
    private static Scanner console = new Scanner(System.in);

    public static int getHours() throws InvalidHrExcep {
        System.out.print("Enter hours: ");
        int hours = console.nextInt();
        console.nextLine();
        if (hours < 0 || hours > 12)
            throw new InvalidHrExcep();
        else
            return hours;
    }

    public static int getMinutes() throws InvalidMinExcep {
        System.out.print("Enter minutes: ");
        int minutes = console.nextInt();
        console.nextLine();
        if (minutes < 0 || minutes > 59)
            throw new InvalidMinExcep();
        else
            return minutes;
    }

    public static int getSeconds() throws InvalidSecExcep {
        System.out.print("Enter seconds: ");
        int seconds = console.nextInt();
        console.nextLine();
        if (seconds < 0 || seconds > 59)
            throw new InvalidSecExcep();
        else
            return seconds;
    }

    public static void print24HourTime(int hr, int min, int sec, String str) {
        str = str.toLowerCase();
        if (str.equals("am")) {
            if (hr == 12)
                hr = 0;
        }

        if (str.equals("pm")) {
            if (hr != 12)
                hr += 12;
        }
        System.out.printf("24 hour clock time: %02d:%02d:%02d%n", hr, min, sec);
    }

    public static void main(String[] args) {
        int hours;
        int mins;
        int secs;
        do {
            try {
                hours = getHours();
            } catch (InvalidHrExcep e) {
                System.err.println(e.toString());
                hours = -1;
            }

        } while (hours < 0 || hours > 12);

        do {
            try {
                mins = getMinutes();
            } catch (InvalidMinExcep e) {
                System.err.println(e.toString());
                mins = -1;
            }
        } while (mins < 0 || mins > 60);

        do {
            try {
                secs = getSeconds();
            } catch (InvalidSecExcep e) {
                System.err.println(e.toString());
                secs = -1;
            }
        } while (secs < 0 || secs > 60);

        System.out.print("Enter am or pm: ");
        String str = console.next();
        print24HourTime(hours, mins, secs, str);
    }
}