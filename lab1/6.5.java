import java.util.Scanner;
import java.util.Arrays;

public class ArraySortingAndStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = inputArray("array", n, scanner);
        Arrays.sort(arr);

        System.out.println("Sorted Array:");
        displayArray(arr);

        int sum = calculateSum(arr);
        double average = calculateAverage(arr);

        System.out.println("Sum of Array Elements: " + sum);
        System.out.println("Average of Array Elements: " + average);

        scanner.close();
    }

    public static int[] inputArray(String name, int n, Scanner scanner) {
        int[] arr = new int[n];
        System.out.println("Enter elements for " + name + ":");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static void displayArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static double calculateAverage(int[] arr) {
        int sum = calculateSum(arr);
        return (double) sum / arr.length;
    }
}
