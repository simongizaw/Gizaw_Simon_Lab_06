import java.util.Scanner;
public class Lab_06_03_RectangleInfo {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double longSide = 0 ;
        double shortSide = 0  ;
        double area = 0 ;
        double per = 0 ;
        double diagonal = 0;

        System.out.print("Enter the long side of the rectangle ");
        if (in.hasNextDouble())
        {
             longSide= in.nextDouble();
            in.nextLine();
        } else
        {
            System.out.println("That is not a correct input");
        }



        System.out.print("Enter the short side of your rectangle");
        if (in.hasNextDouble())
        {
            shortSide = in.nextDouble();
            in.nextLine();
        } else
        {
            System.out.println("That is not a correct input");
        }

       area = (longSide * shortSide);
        per = (longSide + shortSide) * 2;
        diagonal =Math.sqrt((longSide * longSide)+ (shortSide + shortSide));

        System.out.println(" Your area was " + area + " and your perimeter was " + per + " and finally the diagonal was " + diagonal);

    }
}