package exercises_lession1;

import java.util.Scanner;

public class exercise4 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("vui long nhap so a: ");
        double numberA = sc.nextDouble();
        System.out.print("vui long nhap so b: ");
        double numberB = sc.nextDouble();
        System.out.print("vui long nhap so c: ");
        double numberC = sc.nextDouble();
        if (numberA != 0){
            double answer = (numberC - numberB) / numberA;
            if (answer == Math.floor(answer)){
                  System.out.printf("Equation pass with x = %d!\n", answer);
            }else
            System.out.printf("Equation pass with x = %.2f!\n", answer);
        }else
            if (numberB == numberC) {
            System.out.println("The solution is all X !");
        }else{
            System.out.println("No solution! ");
        }
        sc.close();
    }
}
