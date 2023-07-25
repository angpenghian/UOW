// Name: PengHian Ang
// Tutorial: T03P
// Java version: 17.0.7, 64 bit
//
// Objective: Write a java program with two classes (see UML diagram) 
// Name of the program: Penghian_Ang_Lab3.java
// Declaration: This is my own program

import java.util.Scanner;

class PetrolPurchase {
	//declare instance variables
    private String station, type;
    private double quantity, price;
    private int discount;

    //default constructor
    public PetrolPurchase() {
    }

	// constructor
    public PetrolPurchase(String s, double q, String t, double p, int d) {
        setInfo(s, q, t, p, d);
    }

	// copy constructor
    public PetrolPurchase(PetrolPurchase pp) {
        this.station = pp.station;
        this.quantity = pp.quantity;
        this.type = pp.type;
        this.price = pp.price;
        this.discount = pp.discount;
    }

	// accessor and mutator methods
    public String getStation() {
        return station;
    }

    public String getType() {
        return type;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return quantity * price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public void setDiscount(int discount) {
		this.discount = discount;
    }

    public double computeDiscount() {
        double disPrice = ((double) discount / 100) * getPrice();
        return disPrice;
    }

    private double computePayment() {
        double d = getPrice() - computeDiscount();
        return d;
    }

    public double getPayment() {
        return computePayment();
    }

	private void setInfo(String s, double q, String t, double p, int d) {
		station = s;
		quantity = q;
		type = t;
		price = p;
		discount = d;
	}

    public void printInfo() {
        System.out.printf("Station: %s%n", getStation());
        System.out.printf("Total liter: %.2f%n", getQuantity());
        System.out.printf("Petrol type: %s%n", getType());
        System.out.printf("Price per liter: %.2f%n", price);
        System.out.printf("Actual cost: %.2f%n", getPrice());
        System.out.printf("Discount (%02d%%): %.2f%n", discount, computeDiscount());
        System.out.printf("Amount to pay: %.2f%n", getPayment());
    }
}

// main class
public class PenghianAng_Lab3 {
    public static void main(String[] args) {
        String station, type;
        int discount;
        double quantity, price;
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter Station: ");
        station = input.nextLine();
        System.out.printf("Enter quantity in litre: ");
        quantity = input.nextDouble();
        input.nextLine();
        System.out.printf("Enter type of petrol: ");
        type = input.nextLine();
        System.out.printf("Enter price per litre: ");
        price = input.nextDouble();
        System.out.printf("Enter discount: ");
        discount = input.nextInt();

        PetrolPurchase p = new PetrolPurchase(station, quantity, type, price, discount);
        System.out.printf("%nSummary of your purchase%n");
        p.printInfo();

        System.out.printf("%nEnter additional quantity of petrol: ");
        double additional = input.nextDouble();

        p.setQuantity(additional + quantity);
        System.out.printf("%nYour new purchased price%n");
        p.printInfo();

        PetrolPurchase pp = new PetrolPurchase(p);
        System.out.printf("%nDuplicate the same object%n");

        pp.printInfo();
        input.close();
    }
}