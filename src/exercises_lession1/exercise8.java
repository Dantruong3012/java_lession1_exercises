package exercises_lession1;

import java.util.Scanner;

public class exercise8 {
   private static final Scanner sc = new  Scanner(System.in);
   public static void main(String[] args) {
    int VND = 26000;
    System.out.print("Enter amount of USD: ");
    int USD = sc.nextInt();
    int converted = USD * VND;
    System.out.println("Your money is " + converted);
   }
}
