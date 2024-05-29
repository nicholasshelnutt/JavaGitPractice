import java.util.Scanner;

public class Demo 
{
    public static void main(String[] args) 
    {
        // Initalize a scanner
        Scanner scan = new Scanner(System.in);

        // Ask for user input
        System.out.println("Do you want a car or truck? Type 'Car' or 'Truck': ");
        String userChoice = scan.next();

        // Declare variable of type vehicle
        Vehicle vehicle;

        if (userChoice.equals("Car"))
        {
            vehicle = new Car();
        }
        else if (userChoice.equals("Truck"))
        {
            vehicle = new Truck();
        }
        else
        {
            System.out.println("Invalid input. Please choose 'Car' or 'Truck'.");
            scan.close();
            return;
        }

        vehicle.vehicleType();
    }
}
