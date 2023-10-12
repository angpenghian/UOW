package UOW.CSIT121;
// Full name: Penghian Ang
// Java version: 17.0.7, 64 bit
// Tutorial Group: tutorial 1
// Declaration: I declare that this assignment is my own work and i have not passed this progranm to anyone else.
// I am willing to accept whatever penalty given to you. 

import java.util.ArrayList;
import java.util.List;

class Info {
    private String name;
    private String nationality;
    private String dob;
    private ArrayList<String> hobbies;
    private ArrayList<String> wishes;

    public Info(String name, String nationality, String dob, List<String> hobbies, List<String> wishes) {
        this.name = name;
        this.nationality = nationality;
        this.dob = dob;
        this.hobbies = new ArrayList<>(hobbies);
        this.wishes = new ArrayList<>(wishes);
    }

    public void displayInfo() {
        System.out.println("My Information");
        System.out.printf("Name: %s%n", name);
        System.out.printf("Nationality: %s%n", nationality);
        System.out.printf("Date of birth: %s%n", dob);
        System.out.printf("I have %d hobbies%n", hobbies.size());
        for (int i = 0; i < hobbies.size(); i++) {
            System.out.printf("\t%d: %s%n", (i + 1), hobbies.get(i));
        }
        System.out.printf("I have %d wishes%n", wishes.size());
        for (int j = 0; j < wishes.size(); j++) {
            System.out.printf("\t%d: %s%n", (j + 1), wishes.get(j));
        }
    }
}

class PenghianAng_8376566_Lab_1 {
    public static void main(String[] args) {
        String name = "Ang Peng Hian";
        String nationality = "Singaporean";
        String dob = "13 July 1992";

        List<String> hobbies = new ArrayList<>();
        hobbies.add("Coding");
        hobbies.add("Computer games");

        List<String> wishes = new ArrayList<>();
        wishes.add("I want to be a CTO");
        wishes.add("I want to be a Tech Lead");
        wishes.add("I want to work in FAANG");
        wishes.add("I want to quit Chinese FAANG");

        Info info = new Info(name, nationality, dob, hobbies, wishes);
        info.displayInfo();
    }
}
