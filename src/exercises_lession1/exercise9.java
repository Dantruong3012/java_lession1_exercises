package exercises_lession1;

import java.util.Scanner;

public class exercise9 {
    private static final String[] units = {
        "zero","one","two","three","four","five",
        "six","seven","eight","nine","ten","eleven",
        "twelve","thirteen","fourteen","fifteen",
        "sixteen","seventeen","eighteen","nineteen"
    };

    private static final String[] tens = {
        "", "", "twenty","thirty","forty",
        "fifty","sixty","seventy","eighty","ninety"
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        // Đọc số nguyên 0–999
        while (true) {
            System.out.print("Enter a non-negative integer (0–999): ");

            if (!sc.hasNextInt()) {
                System.out.println("Please enter a valid integer.");
                sc.next();
                continue;
            }
                number = sc.nextInt();
            if (number < 0 || number > 999) {
                System.out.println("Number must be between 0 and 999.");
                continue;
            }
            break;
        }

        System.out.println(toWords(number));
        sc.close();
    }

    private static String toWords(int n) {
        if (n < 20) {
            return units[n];
        }
        if (n < 100) {
            int t = n / 10;
            int u = n % 10;
            return (u == 0) ? tens[t] : tens[t] + " " + units[u];
        }
        // n from 100 to 999
        int h = n / 100;
        int rest = n % 100;
        String result = units[h] + " hundred";
        if (rest != 0) {
            result += " and " + toWords(rest);
        }
        return result;
    }
}
