import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cars(sc);
        limited(sc);
        sc.close();
    }

    public static void cars(Scanner sc) {
        String[] cars = {"Corvette", "okksuper", "d'accordstv"};
        System.out.println("Hello! Welcome, want to buy a car? Here the car avaible: ");

        for(int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        System.out.println("Want to see if we got a car? search it! We got a large selection.");
        String search = sc.nextLine();

        boolean found = false; 
        
        for(int i = 0; i < cars.length; i++) {
            if (cars[i].equalsIgnoreCase(search)) {
                found = true; 
                System.out.println("Yes! We found! Here the car you are looking for: " + search);
            }
        }
         
    
    }

    public static void limited(Scanner sc) {
        String[] limitedCars = {"Porsche", "Ferrari", "Lamborghini"};
        System.out.println("Want to access to our Limited car edition 2026? Answer this by saying Yes!");
        String answer = sc.nextLine();

        boolean isLimited = false;

            
        if (answer.equals("Yes!")) {
            for(int i = 0; i < limitedCars.length; i++) {
                System.out.println(limitedCars[i]);
            }
        }
        
    }
}
