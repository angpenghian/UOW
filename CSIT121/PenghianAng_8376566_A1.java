package UOW.CSIT121;
// Full name: Penghian Ang
// Java version: 17.0.7, 64 bit
// Tutorial Group: tutorial 1
// Declaration: I declare that this assignment is my own work and i have not passed this progranm to anyone else.
// I am willing to accept whatever penalty given to you. 

import java.util.Scanner;
import java.util.ArrayList;

enum NumberType
{
    One(1, "un", "satu", "uno"),
    Two(2, "deux", "dua", "dos"),
    Three(3, "trois", "tiga", "tres"),
    Four(4, "quatre", "empat", "cuatro"),
    Five(5, "cinq", "lima", "cinco"),
    Six(6, "six", "enam", "seis"),
    Seven(7, "sept", "tujuh", "siete"),
    Eight(8, "huit", "delapan", "ocho"),
    Nine(9, "neuf", "sembilan", "nueve"),
    Ten(10, "dix", "sepuluh", "diez");

    private final int number;
    private final String french;
    private final String bahasa;
    private final String spanish;

    NumberType(int number, String french, String bahasa, String spanish)
    {
        this.number = number;
        this.french = french;
        this.bahasa = bahasa;
        this.spanish = spanish;
    }

    public int getNumber()
    {
        return number;
    }

    public String getFrench()
    {
        return french;
    }
    
    public String getBahasa()
    {
        return bahasa;
    }
    
    public String getSpanish()
    {
        return spanish;
    }
}

class Set
{
    private ArrayList<NumberType> s;

    public Set()
    {
        this.s = new ArrayList<NumberType>();
    }
    public Set(Set otherSet)
    {
        this.s = new ArrayList<NumberType>();
        for(NumberType nt : otherSet.s)
        {
            this.s.add(nt);
        }
    }

    public boolean isEmpty()
    {
        return (s.size() == 0);
    }
    public int cardinality()
    {
        return (s.size());
    }
    public boolean belongTo(NumberType element)
    {
        return (s.contains(element));
    }
    public void addElement(NumberType element)
    {
        if (!s.contains(element))
        {
            s.add(element);
        }
    }
    public boolean subSet(Set otherSet)
    {
        for(NumberType nt : this.s)
        {
            if(!otherSet.s.contains(nt))
                return false;
        }
        return true;
    }
    public void union(Set otherSet)
    {
        for (NumberType nt : otherSet.s)
        {
            if (this.s.contains(nt))
            {
                continue;
            }
            this.s.add(nt);
        }
    }
    public void intersection(Set otherSet)
    {
        Set result = new Set();

        for (NumberType nt : this.s) 
        {
            if (otherSet.s.contains(nt)) 
            {
                result.addElement(nt);
            }
        }
        this.s = result.s;
    }

    public void difference(Set otherSet)
    {
        for (NumberType nt : otherSet.s)
            {
                if (this.s.contains(nt))
                {
                    this.s.remove(nt);
                }
            }
    }

    public Set complement()
    {
        Set comp = new Set();
        for (NumberType all: NumberType.values())
        {
            comp.s.add(all);
        }
        for (NumberType nt : this.s)
        {
            if(comp.s.contains(nt))
            {
                comp.s.remove(nt);
            }
        }
        return comp;
    }

    public boolean equality(Set otherSet)
    {
        return (subSet(otherSet) == true && (s.size() == otherSet.s.size()));
    }

    @Override
    public String toString()
    {
        String string = "{";
        for (int i = 0; i< s.size(); i++)
        {
            string = string + String.format("%s", s.get(i));
            if(i < s.size() - 1)
                string += ", ";
        }
        string += "}";
        return string;
    }

    public String getNumberInfoFormat()
    {
        int generateNumber = (int)(Math.random() * 4) ;
        switch (generateNumber)
        {
            case 0:
                String stringN = "{";
                for (int i = 0; i< s.size(); i++)
                {
                    stringN = stringN + String.format("%s", s.get(i).getNumber());
                    if(i < s.size() - 1)
                        stringN += ", ";
                }
                stringN += "}";
                return stringN;
            case 1:
                String stringF = "{";
                for (int i = 0; i< s.size(); i++)
                {
                    stringF = stringF + String.format("%s", s.get(i).getFrench());
                    if(i < s.size() - 1)
                        stringF += ", ";
                }
                stringF += "}";
                return stringF;
            case 2:
                String stringB = "{";
                for (int i = 0; i< s.size(); i++)
                {
                    stringB = stringB + String.format("%s", s.get(i).getBahasa());
                    if(i < s.size() - 1)
                        stringB += ", ";
                }
                stringB += "}";
                return stringB;
            default:
                String stringS = "{";
                for (int i = 0; i< s.size(); i++)
                {
                    stringS = stringS + String.format("%s", s.get(i).getSpanish());
                    if(i < s.size() - 1)
                        stringS += ", ";
                }
                stringS += "}";
                return stringS;
        }
    }
}


public class PenghianAng_8376566_A1
{
    private static Scanner input = new Scanner(System.in);
    
    private static void displayNumberTypeInfo()
    {
        System.out.println("Universal set info");
        System.out.println();
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%n", "Number Type", "Number", "French", "Bahasa", "Spanish");
        for (NumberType nt: NumberType.values())
        {
            System.out.printf("%-20s%-20d%-20s%-20s%-20s%n", nt, nt.getNumber(), nt.getFrench(), nt.getBahasa(), nt.getSpanish());
        }
        System.out.println();
    }

    private static NumberType getAnElement()
    {
        return NumberType.values()[(int)(Math.random()* NumberType.values().length)];
    }
    
    private static Set getASet()
    {
        Set set1 = new Set();
        int setSize = (int)(Math.random()* NumberType.values().length);
        for (int i = 0; i < setSize; i++)
        {
            set1.addElement(getAnElement());
        }
        return set1;
    }

    private static void displayMenu()
    {
        System.out.println("Welcome to SIM Set Theory Lesson");
        System.out.println();
        System.out.println("0: Properties of set");
        System.out.println("1: Union example");
        System.out.println("2: Intersection example");
        System.out.println("3: Subset example");
        System.out.println("4: Difference example");
        System.out.println("5: Complement example");
        System.out.println("6: Sets equality example");
        System.out.println("7: Distributive Law 1");
        System.out.println("8: Distributive Law 2");
        System.out.println("9: Quit");
        System.out.println();
        System.out.print("Your option: ");
    }

    private static void unionExample()
    {
        Set set1 = getASet();
        Set set2 = getASet();
        System.out.println("Given sets");
        System.out.printf("\t A = %s%n", set1);
        System.out.printf("\t B = %s%n", set2);
        set1.union(set2);
        System.out.printf("\t Union of A and B = %s%n", set1);
    }

    private static void intersectionExample()
    {
        Set set1 = getASet();
        Set set2 = getASet();
        System.out.println("Given sets");
        System.out.printf("\t A = %s%n", set1);
        System.out.printf("\t B = %s%n", set2);
        set1.intersection(set2);
        System.out.printf("\t Intersection of A and B = %s%n", set1);
    }

    private static void subsetExample()
    {
        Set set1 = getASet();
        Set set2 = getASet();
        System.out.println("Given sets");
        System.out.printf("\t A = %s%n", set1);
        System.out.printf("\t B = %s%n", set2);
        System.out.println();
        System.out.println("Conclusion");
        System.out.printf("\t A subset of B: " + (set1.subSet(set2) ? "true%n" : "false%n"));
        System.out.printf("\t B subset of A: " + (set2.subSet(set1) ? "true%n" : "false%n"));
    }

    private static void differenceExample()
    {
        Set set1 = getASet();
        Set set2 = getASet();
        System.out.println("Given sets");
        System.out.printf("\t A = %s%n", set1);
        System.out.printf("\t B = %s%n", set2);
        set1.difference(set2);
        System.out.println();
        System.out.printf("\t A - B = %s%n", set1);
    }

    private static void complementExample()
    {
        Set set1 = getASet();
        System.out.println("Given set");
        System.out.printf("\t A = %s%n", set1);
        System.out.println();
        System.out.printf("\t A' = %s%n", set1.complement());
    }

    private static void equalityExample()
    {
        Set set1 = getASet();
        Set set2 = getASet();
        System.out.println("Given sets");
        System.out.printf("\t A = %s%n", set1);
        System.out.printf("\t B = %s%n", set2);
        System.out.println();
        System.out.println("Analysis");
        System.out.printf("\t A subset of B: " + (set1.subSet(set2) ? "true%n" : "false%n"));
        System.out.printf("\t B subset of A: " + (set2.subSet(set1) ? "true%n" : "false%n"));
        System.out.println();
        System.out.println("Conclusion");
        System.out.printf("\t A equals to B: " + (set1.equality(set2) ? "true%n" : "false%n"));
    }

    private static void distributiveLaw_1()
    {
        Set set1 = getASet();
        Set set2 = getASet();
        Set set3 = getASet();
        Set set1Copy = new Set (set1);
        Set set2Copy = new Set (set2);
        Set set3Copy = new Set (set3);
        System.out.println("We wish to prove A U (B I C) = (A U B) I (A U C)");
        System.out.println("Given sets");
        System.out.printf("\t A = %s%n", set1);
        System.out.printf("\t B = %s%n", set2);
        System.out.printf("\t C = %s%n", set3);
        System.out.println();
        System.out.println("LHS analysis");
        set2.intersection(set3);
        set1.union(set2);
        System.out.printf("\t LHS = %s%n", set1);
        System.out.println();
        System.out.println("RHS analysis");
        set2Copy.union(set1Copy);
        set3Copy.union(set1Copy);
        set2Copy.intersection(set3Copy);
        System.out.printf("\t RHS = %s%n", set2Copy);
        System.out.println();
        System.out.println("Conclusion");
        System.out.printf("\t LHS  = RHS is " + (set1.equality(set2Copy) ? "true%n" : "false%n"));
    }

    private static void distributiveLaw_2()
    {
        Set set1 = getASet();
        Set set2 = getASet();
        Set set3 = getASet();
        Set set1Copy = new Set (set1);
        Set set2Copy = new Set (set2);
        Set set3Copy = new Set (set3);
        System.out.println("We wish to prove A I (B U C) = (A I B) U (A I C)");
        System.out.println("Given sets");
        System.out.printf("\t A = %s%n", set1);
        System.out.printf("\t B = %s%n", set2);
        System.out.printf("\t C = %s%n", set3);
        System.out.println();
        System.out.println("LHS analysis");
        set2.union(set3);
        set1.intersection(set2);
        System.out.printf("\t LHS = %s%n", set1);
        System.out.println();
        System.out.println("RHS analysis");
        set2Copy.intersection(set1Copy);
        set3Copy.intersection(set1Copy);
        set2Copy.union(set3Copy);
        System.out.printf("\t RHS = %s%n", set2Copy);
        System.out.println();
        System.out.println("Conclusion");
        System.out.printf("\t LHS  = RHS is " + (set1.equality(set2Copy) ? "true%n" : "false%n"));
    }

    public static void displaySubMenu()
    {
        System.out.println("Some basic operations in set");
        System.out.printf("\t 1. Add an element%n");
        System.out.printf("\t 2. Check an element%n");
        System.out.printf("\t 3. Cardinality%n");
        System.out.printf("\t 4. Number Info format%n");
        System.out.printf("\t 9. Quit%n");
        System.out.println();
        System.out.print("Enter your option: ");
    }

    public static void anExample()
    {
        Set subMenuSet = getASet();
        int subMenuOption;
        do
        {
            System.out.printf("%nHere is an example of a set%n");
            System.out.printf("\t A = %s%n", subMenuSet);
            System.out.printf("\t All elements in set are distinct and random order");
            System.out.println();
            displaySubMenu();
            subMenuOption = input.nextInt();
            switch(subMenuOption)
            {
                case 1:
                    System.out.println();
                    System.out.print("Enter an element: ");
                    input.nextLine();
                    NumberType element1 = NumberType.valueOf(input.nextLine());
                    subMenuSet.addElement(element1);
                    System.out.printf("===> A = %s%n", subMenuSet);
                    break;
                case 2:
                    System.out.println();
                    System.out.print("Enter an element: ");
                    input.nextLine();
                    NumberType element2 = NumberType.valueOf(input.nextLine());
                    System.out.printf("===> Element %s is %s%n", element2, (subMenuSet.belongTo(element2) ? "in set" : "not in set"));
                    break;
                case 3:
                    System.out.println();
                    input.nextLine();
                    System.out.printf("===> No of elements in set is %d%n", subMenuSet.cardinality());
                    break;
                case 4:
                    System.out.println();
                    System.out.println("Notation in enum format");
                    System.out.printf("\t A = %s%n", subMenuSet.getNumberInfoFormat());
                    break;
                case 9:
                    System.out.printf("%nLeaving sub-menu%n");
                    break;
                default:
                    System.out.println("Invalid option. Please enter options 1 - 4 or option 9 to exit.");
            }
        }while (subMenuOption != 9);

    }
    public static void main (String [] args)
    {
        int menuOption;
        displayNumberTypeInfo();
        do
        {
            displayMenu();
            menuOption = input.nextInt();
            switch(menuOption)
            {
                case 0:
                    anExample();
                    break;
                case 1:
                    unionExample();
                    break;
                case 2:
                    intersectionExample();
                    break;
                case 3:
                    subsetExample();
                    break;
                case 4:
                    differenceExample();
                    break;
                case 5:
                    complementExample();
                    break;
                case 6:
                    equalityExample();
                    break;
                case 7:
                    distributiveLaw_1();
                    break;
                case 8:
                    distributiveLaw_2();
                    break;
                case 9:
                    System.out.println("Thank you");
                    break;
                default:
                    System.out.println("Invalid option. Please enter options 1 - 8 or option 9 to exit.");
            }
        }while (menuOption != 9);
    }
}       


