import java.util.Scanner;

public class quadratic {
    public static void main(String[] args) {

        System.out.println("Please enter A, B, C, of a Quadratic");
        Scanner variableA = new Scanner(System.in);
        Scanner variableB = new Scanner(System.in);
        Scanner variableC = new Scanner(System.in);

        double A = variableA.nextDouble();
        double B = variableB.nextDouble();
        double C = variableC.nextDouble();

        double root1 = (-B + Math.sqrt(B * B - (4 * A * C))) / (2 * A);
        double root2 = (-B - Math.sqrt(B * B - (4 * A * C))) / (2 * A);

        System.out.println("The two roots are " + root1 + " and " + root2);

        variableA.close();
        variableB.close();
        variableC.close();

    }
}