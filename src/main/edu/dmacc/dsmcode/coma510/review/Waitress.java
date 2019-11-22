package edu.dmacc.dsmcode.coma510.review;

import java.util.Scanner;

public class Waitress {

    private double total;

    public Waitress() {
        total = 0;
    }

    public void takeOrder(Menu menu, Scanner userInput) {
        menu.showMenu();
        orderFood(menu, userInput);
    }

    public void printTotal() {
        System.out.printf("Your total is $%.2f\n", total);
    }

    private void orderFood(Menu menu, Scanner userInput) {
        boolean done = false;
        while (!done) {
            System.out.print("What food would you like; enter 'done' when complete? ");
            String food = userInput.next();
            if (food.equals("done")) {
                done = true;
            } else if (menu.hasFood(food)) {
                total += menu.getPrice(food);
            } else {
                System.out.println("Sorry, we don't have " + food);
            }
        }
    }
}
