import java.util.Scanner;

public class NewtonsMethod {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        repeat: while (true) {
            System.out.println("Please enter a decimal/number as a root guess ");
            double x = input.nextDouble();
            double newGuess = 0.0;
            System.out.println("Initial Guess: " + x);

            while (true) {
                double function = 6 * Math.pow(x, 4) - 13 * Math.pow(x, 3) - 18 * x * x + 7 * x + 6;
                double derivative = 24 * Math.pow(x, 3) - 39 * x * x - 36 * x + 7;
                newGuess = x - function / derivative; // calculates the next guess
                if (Math.abs(x - newGuess) > 0.00000000001) {
                    System.out.println(newGuess);
                    x = newGuess;
                } else {
                    System.out.println("The root is " + newGuess);
                    System.out.println("Do you want to try again?(y/n)");
                    if (input.next().charAt(0) == 'n') {
                        input.close();
                        break repeat;
                    } else {
                        continue repeat;
                    }
                }
            }
        }
    }
}