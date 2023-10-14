import java.util.Scanner;

public class MonthDaysCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the month (full name, abbreviation, 3 letters, or number): ");
        String monthInput = scanner.nextLine().toLowerCase();
        
        System.out.print("Enter the year (e.g., 1999): ");
        int year = scanner.nextInt();
        
        if (validateYear(year) && validateMonth(monthInput)) {
            int month = getMonthFromInput(monthInput);
            int daysInMonth = getDaysInMonth(month, isLeapYear(year));
            System.out.println("Number of days in the selected month: " + daysInMonth);
        } else {
            System.out.println("Invalid input. Please enter a valid month and year.");
        }
        
        scanner.close();
    }

    public static boolean validateYear(int year) {
        return year >= 0 && year <= 9999;
    }

    public static boolean validateMonth(String monthInput) {
        String[] validMonths = {
            "january", "jan.", "jan", "1",
            "february", "feb.", "feb", "2",
            "march", "mar.", "mar", "3",
            "april", "apr.", "apr", "4",
            "may", "5",
            "june", "jun.", "jun", "6",
            "july", "jul.", "jul", "7",
            "august", "aug.", "aug", "8",
            "september", "sept.", "sept", "9",
            "october", "oct.", "oct", "10",
            "november", "nov.", "nov", "11",
            "december", "dec.", "dec", "12"
        };

        for (int i = 0; i < validMonths.length; i++) {
            if (monthInput.equals(validMonths[i])) {
                return true;
            }
        }

        return false;
    }

public static int getMonthFromInput(String monthInput) {
    String[] validMonths = {
        "january", "jan.", "jan", "1",
        "february", "feb.", "feb", "2",
        "march", "mar.", "mar", "3",
        "april", "apr.", "apr", "4",
        "may", "5",
        "june", "jun.", "jun", "6",
        "july", "jul.", "jul", "7",
        "august", "aug.", "aug", "8",
        "september", "sept.", "sept", "9",
        "october", "oct.", "oct", "10",
        "november", "nov.", "nov", "11",
        "december", "dec.", "dec", "12"
    };

    for (int i = 0; i < validMonths.length; i += 4) {
        if (monthInput.equalsIgnoreCase(validMonths[i]) ||
            monthInput.equalsIgnoreCase(validMonths[i + 1]) ||
            monthInput.equalsIgnoreCase(validMonths[i + 2]) ||
            monthInput.equals(validMonths[i + 3])) {
            return Integer.parseInt(validMonths[i + 3]);
        }
    }

    return -1;
}


    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getDaysInMonth(int month, boolean isLeapYear) {
        int[] daysInMonthCommonYear = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] daysInMonthLeapYear = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        if (month >= 1 && month <= 12) {
            return isLeapYear ? daysInMonthLeapYear[month] : daysInMonthCommonYear[month];
        } else {
            return -1;
        }
    }
}
