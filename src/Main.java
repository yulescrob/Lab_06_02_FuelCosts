import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double gasInTank=0;
        double fuelEfficiency=0;
        double gasPrice=0;
        double costPer100Mi;
        double distanceWithGasTank=0;
        String trash;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of gallons of gas in the tank: ");
        if(in.hasNextDouble()){
            gasInTank = in.nextDouble();
            in.nextLine();
        }
        else {
            trash = in.nextLine();
            System.out.println("Must enter a valid number for the number of gallons of gas in the tank " + trash);
        //error message if wrong input
        }

        System.out.print("Enter the fuel efficiency in miles per gallon: ");
        if(in.hasNextDouble()){
            fuelEfficiency = in.nextDouble();
            in.nextLine();
        }
        else {
            trash = in.nextLine();
            System.out.println("Must enter a valid number for the fuel efficiency " + trash);
            //error message if wrong input
        }

        System.out.print("Enter the price of gas per gallon: ");
        if(in.hasNextDouble()){
            gasPrice = in.nextDouble();
            in.nextLine();
        }
        else {
            trash = in.nextLine();
            System.out.println("Must enter a valid number for the price of gas per gallon " + trash);
            //error message if wrong input
        }

        //process calculations
        costPer100Mi = 100 * gasPrice / fuelEfficiency;
        distanceWithGasTank = fuelEfficiency * gasInTank;

        //output
        System.out.println("The cost of gas per 100 miles is: " +costPer100Mi);
        System.out.println("With the gas in the tank the car go for " + distanceWithGasTank + " miles.");




    }
}