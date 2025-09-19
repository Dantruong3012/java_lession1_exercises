package exercises_lession1;

import java.util.Scanner;

public class exercise7 {
  private static final Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.println("Enter your name!");
    String name = sc.nextLine();
    if (name == "") {
       while (name == "") {
         System.out.print("Please Enter the information: ");
        name = sc.nextLine();
        if  (name != "") System.out.println("Hello " + name);
       }
    }else{
        System.out.println("Hello" + name);
    }
  }  
}
