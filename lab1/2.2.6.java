import java.util.Scanner;

public class EquationSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the type of equation to solve:");
        System.out.println("1. First-degree equation with one variable");
        System.out.println("2. System of first-degree equations with two variables");
        System.out.println("3. Second-degree equation with one variable");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                solveFirstDegreeEquation(scanner);
                break;
            case 2:
                solveLinearSystem(scanner);
                break;
            case 3:
                solveQuadraticEquation(scanner);
                break;
            default:
                System.out.println("Invalid choice. Please choose 1, 2, or 3.");
        }

        scanner.close();
    }

    public static void solveFirstDegreeEquation(Scanner scanner) {
        System.out.print("Enter the coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the coefficient b: ");
        double b = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Infinite solutions (0x = 0)");
            } else {
                System.out.println("No solution (0x = b, where b ≠ 0)");
            }
        } else {
            double x = -b / a;
            System.out.println("One real root: x = " + x);
        }
    }

    public static void solveLinearSystem(Scanner scanner) {
        System.out.print("Enter a11: ");
        double a11 = scanner.nextDouble();
        System.out.print("Enter a12: ");
        double a12 = scanner.nextDouble();
        System.out.print("Enter b1: ");
        double b1 = scanner.nextDouble();
        System.out.print("Enter a21: ");
        double a21 = scanner.nextDouble();
        System.out.print("Enter a22: ");
        double a22 = scanner.nextDouble();
        System.out.print("Enter b2: ");
        double b2 = scanner.nextDouble();

        double D = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        if (D == 0) {
            if (D1 == 0 && D2 == 0) {
                System.out.println("Infinite solutions");
            } else {
                System.out.println("No solution");
            }
        } else {
            double x1 = D1 / D;
            double x2 = D2 / D;
            System.out.println("Solution: x1 = " + x1 + ", x2 = " + x2);
        }
    }

    public static void solveQuadraticEquation(Scanner scanner) {
        System.out.print("Enter the coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the coefficient c: ");
        double c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Infinite solutions (0x^2 + 0x + 0 = 0)");
                } else {
                    System.out.println("No solution (0x^2 + 0x + c = 0, where c ≠ 0)");
                }
            } else {
                double x = -c / b;
                System.out.println("One real root: x = " + x);
            }
        } else {
            if (discriminant > 0) {
                double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("Two real roots: x1 = " + x1 + ", x2 = " + x2);
            } else if (discriminant == 0) {
                double x = -b / (2 * a);
                System.out.println("Double root: x = " + x);
            } else {
                System.out.println("No real root");
            }
        }
    }
}
