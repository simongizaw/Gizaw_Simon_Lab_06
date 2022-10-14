
import java.util.Scanner;
import java.util.Random;
public class Lab_06_05_HighorLow {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random generator = new Random();

        int val = generator.nextInt(10)+1;
        int guess = 1;


        System.out.print("Guess the number between 1-10");
        if (in.hasNextInt())
        {
            guess = in.nextInt();
            in.nextLine();

            if (guess >= 1 && guess <= 10)
            {
                System.out.println("You guessed " + guess );
                if (guess > val)
                {
                    System.out.println("You guessed too high !" );
                } else if (guess < val) {
                    System.out.println("You guessed too low !" );

                } else if (guess == val) {
                    System.out.println("You guessed just right !" );

                }

            }else
            {
                System.out.println("Your guess is not between 1-10  !" );
            }
        }else
        {
            System.out.println("Incorrect Input try again" );
        }


    }
}
