package exercise3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ratp {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        ArrayList<Bus> bus = new ArrayList<>();
        Random r = new Random();
        int userChoice;
        do {
            printMenu();
            System.out.println("What do you want to do ? enter the right number");
            userChoice = scan.nextInt();
            if (userChoice == 1){
                bus.add(new Bus(r.nextInt(999) + 1, "Lyon", "Paris", 80, r.nextInt(81), 1, r.nextInt(15)+25, 1));
            } else if (userChoice == 2){
                System.out.println("Number of passengers to add : ");
                userChoice = scan.nextInt();
                bus.get(bus.size()).addTravellers(userChoice);
                userChoice = 2;
            } else if (userChoice == 3){
                System.out.println("Number of passengers to remove : ");
                userChoice = scan.nextInt();
                bus.get(bus.size()).removeTravellers(userChoice);
                userChoice = 3;
            } else if (userChoice == 4){
                bus.get(bus.size()).travel();
            }
        } while (userChoice != 0);

        System.out.println("End. ");
    }

    public static void printMenu(){
        System.out.println("----------------- MENU --------------------");
        System.out.println("To create a bus enter :      1");
        System.out.println("To add travellers enter :    2");
        System.out.println("To remove travellers enter : 3");
        System.out.println("To travel enter :            4");
        System.out.println("To leave enter :             0");
        System.out.println("-------------------------------------------");
    }

}
