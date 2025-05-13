public class Main {
    public static void main(String[] args) {
        // Test Case 1: Default constructor
        Point a = new Point();
        System.out.println("Test 1: Default constructor");
        a.displayCoordinate(); // Expect (0, 0)

        // Test Case 2: Custom constructor
        Point b = new Point(4, 5);
        System.out.println("\nTest 2: Custom constructor");
        b.displayCoordinate(); // Expect (4, 5)

        // Test Case 3: getX and getY
        System.out.println("\nTest 3: Getters");
        System.out.println("X: " + b.getX()); // Expect 4.0
        System.out.println("Y: " + b.getY()); // Expect 5.0

        // Test Case 4: distance
        System.out.println("\nTest 4: Distance from a to b");
        System.out.println("Distance: " + a.distance(b)); // Expect ~6.40

        // Test Case 5: difference
        System.out.println("\nTest 5: Difference a - b");
        Point diff = a.difference(b);
        diff.displayCoordinate(); // Expect (-4, -5)

        // Test Case 6: sum
        System.out.println("\nTest 6: Sum a + b");
        Point sum = a.sum(b);
        sum.displayCoordinate(); // Expect (4, 5)

        // Test Case 7: midpoint
        System.out.println("\nTest 7: Midpoint between a and b");
        Point mid = a.midpoint(b);
        mid.displayCoordinate(); // Expect (2, 2.5)

        // Test Case 8: slope
        System.out.println("\nTest 8: Slope between a and b");
        System.out.println("Slope: " + a.slope(b)); // Expect 1.25

        // Test Case 9: yIntercept
        System.out.println("\nTest 9: Y-Intercept of line a–b");
        System.out.println("Y-Intercept: " + a.yIntercept(b)); // Expect 0.0

        // Test Case 10: linear equation
        System.out.println("\nTest 10: Linear equation formed by a and b");
        a.linearEquation(b); // Expect y = 1.25x + 0.0
    }
}
