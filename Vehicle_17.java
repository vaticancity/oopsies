/*
 * 17.	A Company manufactures Vehicles, which could be a Helicopter, a Car, or a Train depending on the customer’s demand. 
 * Each Vehicle instance has a method called move, which prints on the console the nature of movement of the vehicle. 
 * For example, the Helicopter Flies in Air, the Car Drives on Road and the Train Runs on Track. 
 * Write a program that accepts input from the user on the kind of vehicle the user wants to order, 
 * and the system should print out nature of movement. Implement all Java coding best practices to implement this program.
*/
import java.util.Scanner;

abstract class Vehicle {
    public abstract void move();
}

class Helicopter extends Vehicle {
    @Override
    public void move() {
        System.out.println("The Helicopter flies in the air.");
    }
}

class Car extends Vehicle {
    @Override
    public void move() {
        System.out.println("The Car drives on the road.");
    }
}

class Train extends Vehicle {
    @Override
    public void move() {
        System.out.println("The Train runs on the track.");
    }
}

public class Vehicle_17 {
    public static Vehicle getVehicle(String type) {
        switch (type.toLowerCase()) {
            case "helicopter":
                return new Helicopter();
            case "car":
                return new Car();
            case "train":
                return new Train();
            default:
                return null;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the type of vehicle you want to order (Helicopter, Car, Train):");
        String vehicleType = scanner.nextLine();
        Vehicle vehicle = Vehicle_17.getVehicle(vehicleType);

        if (vehicle != null) {
             vehicle.move();
         } else {
             System.out.println("Invalid vehicle type entered.");
         }
         scanner.close();

        
     /*
         Vehicle v=null;
        
        if(vehicleType.toLowerCase().equals("helicopter")) {
            v=new Helicopter();
        }
        else if(vehicleType.toLowerCase().equals("car")) {
            v=new Car();
        }
        else if(vehicleType.toLowerCase().equals("train")) {
            v= new Train();
        }
        else {
            System.out.println("Wrong Choice!!");
            System.exit(0);
        }
        
        v.move();
         */
        
    }
}
