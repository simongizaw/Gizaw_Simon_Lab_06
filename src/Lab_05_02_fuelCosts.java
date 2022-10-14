import java.util.Scanner;
public class Lab_05_02_fuelCosts {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double gallon = 0 ;
        double mpg = 0  ;
        double pricePg = 0 ;
        double hun ;
        double distance;

        System.out.print("How many gallons of gas is in your tank ?");
        if (in.hasNextDouble())
        {
            gallon = in.nextDouble();
            in.nextLine();
        } else
        {
            System.out.println("That is not a correct input");
        }



        System.out.print("How many miles per gallon does your car get ?");
        if (in.hasNextDouble())
        {
            mpg = in.nextDouble();
            in.nextLine();
        } else
        {
            System.out.println("That is not a correct input");
        }

        System.out.print("How much do you pay for 1 gallon of gas ? ");
        if (in.hasNextDouble())
        {
            pricePg = in.nextDouble();
            in.nextLine();
        } else
        {
            System.out.println("That is not a correct input");
        }

        hun = (100/mpg) * pricePg;
        distance = gallon * mpg;
        System.out.println("The cost per 100 miles is $" + hun + " and You can drive " + distance + " more miles until you need to get gas !");


    }
}
