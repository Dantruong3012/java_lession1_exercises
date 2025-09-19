package exercises_lession1;

import java.util.Scanner;

public class exercise6 {
   private static final Scanner sc = new Scanner(System.in);
   public static void main(String[] args) {
    System.out.print("Enter the weight: ");
    double weight = sc.nextDouble();
    System.out.print("Enter the height: ");
    double height = sc.nextDouble();
    double bmi = weight / Math.pow(height, 2);
    System.out.printf("Your BMI %.2f\n", bmi);
    if (bmi < 18.5) {
        System.out.println("Underweight");
    }else if (bmi < 25) {
        System.out.println("normal");
    }else if (bmi < 30) {
        System.out.println("Overweight");
        
    }else{
        System.out.println("Obese");
    }
    sc.close();
   } 
}
