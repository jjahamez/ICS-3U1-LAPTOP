import java.util.Scanner;

public class decimal {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Plese input a decimal");
        // Use this to read an integer

        int input = (int) keyboard.nextDouble();
        keyboard.close();

        System.out.println("Your decimal rounded down is " + input);

    }

}