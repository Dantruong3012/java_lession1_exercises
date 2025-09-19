package exercises_lession1;

import java.util.Scanner;

public class exercise5 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Please enter month");
        int choose = sc.nextInt();
        String daysInMonth;
        switch (choose) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
            daysInMonth = "31";
                break;
        case 2:
            daysInMonth = "28 or 29";
            break;
        case 4:
            case 6:
            case 9:
            case 11:
            daysInMonth = "30";
                break;
            default:
            daysInMonth = "";
        }
        if  (!daysInMonth.equals("")) System.out.printf("the month %d has %s days%n", choose, daysInMonth); 
        else System.out.print("Invalid input!");
        sc.close();
    }
}
