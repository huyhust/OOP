import java.util.Scanner;

public class TrianglePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height (n) of the triangle: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            displayTriangle(n);
        }
        
        scanner.close();
    }

    public static void displayTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            // Print spaces before the stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            // Print the stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            
            System.out.println(); // Move to the next line
        }
    }
}
