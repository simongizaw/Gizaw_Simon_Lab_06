import java.util.Scanner;

public class Lab_06_04_MetricConverter {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            double meter = 0 ;
            double mile = 0  ;
            double feet = 0 ;
            double inch = 0 ;

            System.out.print("Enter your measurement in meters ");
            if (in.hasNextDouble())
            {
                meter = in.nextDouble();
                in.nextLine();
            } else
            {
                System.out.println("That is not a correct input");
            }

            mile = (meter/1609);
            feet = (meter * 3.281);
            inch = ( meter * 39.37);

            System.out.println("Your measurement in inches is " + inch);
            System.out.println("Your measurement in feet is " + feet);
            System.out.println("Your measurement in miles is " + mile);


    }
}
