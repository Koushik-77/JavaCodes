import java.util.Scanner;
public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c;
        double r1, r2;
        System.out.println("Enter the equation");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        double discriminant = b * b - 4 * a * c;
        System.out.println("Discriminant value is: " + discriminant);
        if (discriminant < 0) {
            System.out.println("No Real Roots");
        } else {
            double sqrtDiscriminant = Math.sqrt(discriminant);
            r1 = (-b + sqrtDiscriminant) / (2 * a);
            r2 = (-b - sqrtDiscriminant) / (2 * a);
            System.out.println("Roots of the given equation: " + r1 + " " + r2);
        }
    }
}
