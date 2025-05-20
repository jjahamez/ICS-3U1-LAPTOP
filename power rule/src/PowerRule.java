import java.util.Scanner;

public class PowerRule {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String deriv1 = "f'(x) =";
        String deriv2 = "f''(x) ="; // holds the first and second derivative 

        System.out.println("Please enter the coefficients of a polynomial, with the terms split by spaces");
        String coefficients = input.nextLine();
        System.out.println("Please enter the exponents of a polynomial, with the terms split by spaces");
        String exponents = input.nextLine();
        input.close();

        String[] coeff1 = coefficients.split(" ");
        String[] exp1 = exponents.split(" "); // splits the coefficients and exponents
        double[] coeff2 = new double[coeff1.length]; 
        int[] exp2 = new int[exp1.length]; // stores in the array 

        try {
            for (int i = 0; i < coeff1.length; i++) { // Loop repeats(based on the # of coefficients)
                double coefficient = Double.parseDouble(coeff1[i]) * Double.parseDouble(exp1[i]);
                int exponent = Integer.parseInt(exp1[i]) - 1; // Converts each term to int/double and applies the power rule
                if (exponent > 0) {
                    deriv1 += (coefficient > 0 && deriv1.length() > 7 ? " +" : " ") + coefficient + "x^" + exponent; // formats term >7 as it ignores the beginning
                    exp2[i] = exponent;
                    coeff2[i] = coefficient; // stores the new exponent/coefficient - 
                } else if (coefficient != 0) {
                    deriv1 += (coefficient > 0 && deriv1.length() > 7 ? " +" : " ") + coefficient;
                } // if exponent is 0(linear), it adds the coefficient term
            }
            for (int i = 0; i < coeff2.length; i++) { // Loop repeats(based on the # of exponents)
                double coefficient = coeff2[i] * exp2[i]; // Power Rule 
                int exponent = exp2[i] - 1; // Reduces exponent to 1 to apply power rule 
                if (exponent > 0) {
                    deriv2 += (coefficient > 0 && deriv2.length() > 8 ? " +" : " ") + coefficient + "x^" + exponent;
                } else if (coefficient != 0) {
                    deriv2 += (coefficient > 0 && deriv2.length() > 8 ? " +" : " ") + coefficient;
                } // same logic as above
            }
            System.out.println("Your first derivative is: " + deriv1);
            System.out.println("Your second derivative is: " + deriv2);

        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("There is an unequal amount of coefficients and exponents");
        } 
        
    }
}