// Full name: Penghian Ang
// Java version: 17.0.7, 64 bit
// Tutorial Group:
// Declaration: I declare that this assignment is my own work and i have not passed this progranm to anyone else.
// I am willing to accept whatever penalty given to you. 
package UOW.CSIT111.Assignment_1;

import static java.lang.System.*;
import java.util.Scanner;

public class PenghianAng_A1 {
    public static void main(String[] args) {
        // Construct Scanner
        Scanner input = new Scanner(System.in);

        // Declare and initialise variables
        String itemOne = "";
        String itemTwo = "";
        String itemThree = "";




        // -------------------- Task 1 --------------------
        // Welcome message
        String welcomeInfo = "\nWelcome to Penghian Ang's online service";
        out.println(welcomeInfo);

        String welcomeLine = new String(new char[welcomeInfo.length()]).replace('\0', '-');
        out.println(welcomeLine);

        out.println("Enter three items to be sold");
        out.print("1. ");
        itemOne = input.nextLine();

        // Input validation for itemOne
        while (itemOne.isEmpty()) {
            out.println("\nInvalid input. Please enter at least one character.");
            out.print("1. ");
            itemOne = input.nextLine();
        }

        // Input validation for itemTwo
        out.print("2. ");
        itemTwo = input.nextLine();
        while (itemTwo.isEmpty()) {
            out.println("\nInvalid input. Please enter at least one character.");
            out.print("2. ");
            itemTwo = input.nextLine();
        }

        // Input validation for itemThree
        out.print("3. ");
        itemThree = input.nextLine();
        while (itemThree.isEmpty()) {
            out.println("\nInvalid input. Please enter at least one character.");
            out.print("3. ");
            itemThree = input.nextLine();
        }

        // Delivery information
        String deliveryInfo = "\nDelivery information";
        out.println(deliveryInfo);

        String deliveryLine = new String(new char[deliveryInfo.length()]).replace('\0', '-');
        out.println(deliveryLine);

        out.print("Customer name: ");
        String customerName = input.nextLine();
        while (customerName.isEmpty()) {
            out.println("\nInvalid input. Please enter at least one character.");
            out.print("Customer name: ");
            customerName = input.nextLine();
        }

        out.print("Collection point: ");
        String collectionPoint = input.nextLine();
        while (collectionPoint.isEmpty()) {
            out.println("\nInvalid input. Please enter at least one character.");
            out.print("Collection point: ");
            collectionPoint = input.nextLine();
        }




        // -------------------- Task 2 --------------------
        // Item One quantity and price
        out.print("\nEnter the quantities and price of " + itemOne + ": ");

        int itemOneQuantity = 0;
        double itemOnePrice = 0.0;
        boolean validInputOne = false;

        while (!validInputOne) {
            try {
                itemOneQuantity = Integer.parseInt(input.next());
                itemOnePrice = Double.parseDouble(input.next());
                validInputOne = true;
            } catch (NumberFormatException e) {
                out.println("Invalid input. Please enter valid quantities and price.");
                out.print("Enter the quantities and price of " + itemOne + ": ");
            }
        }

        // Item Two quantity and price
        out.print("\nEnter the quantities and price of " + itemTwo + ": ");

        int itemTwoQuantity = 0;
        double itemTwoPrice = 0.0;
        boolean validInputTwo = false;

        while (!validInputTwo) {
            try {
                itemTwoQuantity = Integer.parseInt(input.next());
                itemTwoPrice = Double.parseDouble(input.next());
                validInputTwo = true;
            } catch (NumberFormatException e) {
                out.println("Invalid input. Please enter valid quantities and price.");
                out.print("Enter the quantities and price of " + itemTwo + ": ");
            }
        }

        // Item Three quantity and price
        out.print("\nEnter the quantities and price of " + itemThree + ": ");

        int itemThreeQuantity = 0;
        double itemThreePrice = 0.0;
        boolean validInputThree = false;

        while (!validInputThree) {
            try {
                itemThreeQuantity = Integer.parseInt(input.next());
                itemThreePrice = Double.parseDouble(input.next());
                validInputThree = true;
            } catch (NumberFormatException e) {
                out.println("Invalid input. Please enter valid quantities and price.");
                out.print("Enter the quantities and price of " + itemThree + ": ");
            }
        }

        // Summary of items
        String summaryInfo = "\nSummary of items";
        out.println(summaryInfo);

        String summaryLine = new String(new char[summaryInfo.length()]).replace('\0', '-');
        out.println(summaryLine + "\n");

        // help me to align the table

        // Summary table Header
        out.printf("%-25s" + "%-20s" + "%-10s%n", "Item", "Quantity", "Price");

        // Dash line for Summary table
        int lineLength = 25 + 20 + 10; // Length of the formatted string
        String dashLine = new String(new char[lineLength]).replace('\0', '-');
        out.println(dashLine);

        // Summary table Body
        out.printf("1. %-25s" + "%-15d" + "$%11.2f%n", itemOne, itemOneQuantity, itemOnePrice);
        out.printf("2. %-25s" + "%-15d" + "$%11.2f%n", itemTwo, itemTwoQuantity, itemTwoPrice);
        out.printf("3. %-25s" + "%-15d" + "$%11.2f%n", itemThree, itemThreeQuantity, itemThreePrice);

        // Dash line for Summary table
        out.println(dashLine);




        // -------------------- Task 3 --------------------
        // Swap items
        String swapInfo = "\nSummary of items after the swaps";
        out.println(swapInfo);

        String swapLine = new String(new char[swapInfo.length()]).replace('\0', '-');
        out.println(swapLine);

        // Swap itemOne and itemTwo
        String tempItemOne = itemOne;
        itemOne = itemTwo;
        itemTwo = tempItemOne;

        // Swap itemOneQuantity and itemTwoQuantity
        int tempItemOneQuantity = itemOneQuantity;
        itemOneQuantity = itemTwoQuantity;
        itemTwoQuantity = tempItemOneQuantity;

        // Swap itemOnePrice and itemTwoPrice
        double tempItemOnePrice = itemOnePrice;
        itemOnePrice = itemTwoPrice;
        itemTwoPrice = tempItemOnePrice;

        // Swap items table Header
        out.printf("%-25s" + "%-20s" + "%-10s%n", "Item", "Quantity", "Price");
        out.println(dashLine);

        // Swap items table Body
        out.printf("1. %-25s" + "%-15d" + "$%11.2f%n", itemOne, itemOneQuantity, itemOnePrice);
        out.printf("2. %-25s" + "%-15d" + "$%11.2f%n", itemTwo, itemTwoQuantity, itemTwoPrice);
        out.printf("3. %-25s" + "%-15d" + "$%11.2f%n", itemThree, itemThreeQuantity, itemThreePrice);

        // Dash line for Swap items table
        out.println(dashLine);




        // -------------------- Task 4 --------------------
        // Place order
        String orderInfo = "\nPlease place your order";
        out.println(orderInfo);

        String orderLine = new String(new char[orderInfo.length()]).replace('\0', '-');
        out.println(orderLine);

        // Input validation for order itemOne
        out.print("No of " + itemOne + ": ");
        int itemOneOrderAmount = 0;
        boolean validInputOrderOne = false;

        while (!validInputOrderOne) {
            try {
                itemOneOrderAmount = Integer.parseInt(input.next());
                validInputOrderOne = true;
            } catch (NumberFormatException e) {
                out.println("Invalid input. Please enter a valid integer.");
                out.print("No of " + itemOne + ": ");
            }
        }

        // Input validation for order itemTwo
        out.print("No of " + itemTwo + ": ");
        int itemTwoOrderAmount = 0;
        boolean validInputOrderTwo = false;

        while (!validInputOrderTwo) {
            try {
                itemTwoOrderAmount = Integer.parseInt(input.next());
                validInputOrderTwo = true;
            } catch (NumberFormatException e) {
                out.println("Invalid input. Please enter a valid integer.");
                out.print("No of " + itemTwo + ": ");
            }
        }

        // Input validation for order itemTwo
        out.print("No of " + itemThree + ": ");
        int itemThreeOrderAmount = 0;
        boolean validInputOrderThree = false;

        while (!validInputOrderThree) {
            try {
                itemThreeOrderAmount = Integer.parseInt(input.next());
                validInputOrderThree = true;
            } catch (NumberFormatException e) {
                out.println("Invalid input. Please enter a valid integer.");
                out.print("No of " + itemThree + ": ");
            }
        }

        // Summary of order
        String orderSummaryInfo = "\nSummary of your order";
        out.println(orderSummaryInfo);

        String orderSummaryLine = new String(new char[orderSummaryInfo.length()]).replace('\0', '-');
        out.println(orderSummaryLine + "\n");

        // Order summary table Header
        out.printf("%-25s" + "%-20s" + "%-10s%n", "Item", "Quantity", "Cost");

        // Dash line for Order summary table
        out.println(dashLine);

        // Order summary table Body
        double itemOneCost = itemOnePrice * itemOneOrderAmount;
        out.printf("1. %-25s" + "%-15d" + "$%11.2f%n", itemOne, itemOneOrderAmount, itemOneCost);

        double itemTwoCost = itemTwoPrice * itemTwoOrderAmount;
        out.printf("2. %-25s" + "%-15d" + "$%11.2f%n", itemTwo, itemTwoOrderAmount, itemTwoCost);

        double itemThreeCost = itemThreePrice * itemThreeOrderAmount;
        out.printf("3. %-25s" + "%-15d" + "$%11.2f%n", itemThree, itemThreeOrderAmount, itemThreeCost);

        // Dash line for Order summary table in between Items and Total cost
        out.println(dashLine);

        // Total cost
        double subTotal = itemOneCost + itemTwoCost + itemThreeCost;
        out.printf("Subtotal:%-" + (lineLength - 17) + "s%8.2f%n", "", subTotal);

        double gstTotal = (subTotal / 100) * 7;
        out.printf("GST (7%%):%-" + (lineLength - 17) + "s%8.2f%n", "", gstTotal);

        double totalCost = subTotal + gstTotal;
        out.printf("Total cost:%-" + (lineLength - 19) + "s%8.2f%n", "", totalCost);

        out.println(dashLine);




        // -------------------- Task 5 --------------------
        // Notes for delivery
        String importantNoteInfo = "\nSome important notes for delivery";
        out.println(importantNoteInfo);

        String importantNoteLine = new String(new char[importantNoteInfo.length()]).replace('\0', '-');
        out.println(importantNoteLine);

        out.println("Customer name: " + customerName);
        out.println("Collection point: " + collectionPoint);
        out.println("Note that payment by cash upon delivery");
        out.println("Thank you for using our system\n");




        // -------------------- Task 6 --------------------
        // Balance report
        String balanceInfo = "\nBalance report";
        out.println(balanceInfo);

        String balanceLine = new String(new char[balanceInfo.length()]).replace('\0', '-');
        out.println(balanceLine + "\n");

        // Balance report table Header
        out.printf("%-25s" + "%-10s" + "%-10s" + "%-10s%n", "Item", "Quantity", "Sold", "Balance");
        out.println(dashLine);

        // Balance report table Body
        int itemOneBalance = itemOneQuantity - itemOneOrderAmount;
        out.printf("%-25s" + "%-10s" + "%-10s" + "%-10s%n", itemOne, itemOneQuantity, itemOneOrderAmount, itemOneBalance);

        int itemTwoBalance = itemTwoQuantity - itemTwoOrderAmount;
        out.printf("%-25s" + "%-10s" + "%-10s" + "%-10s%n", itemTwo, itemTwoQuantity, itemTwoOrderAmount, itemTwoBalance);

        int itemThreeBalance = itemThreeQuantity - itemThreeOrderAmount;
        out.printf("%-25s" + "%-10s" + "%-10s" + "%-10s%n", itemThree, itemThreeQuantity, itemThreeOrderAmount, itemThreeBalance);

        out.println(dashLine);
        input.close();
    }
}