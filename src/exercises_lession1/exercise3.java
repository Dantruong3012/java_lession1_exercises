package exercises_lession1;
import java.util.Scanner;
public class exercise3 {
 private static final Scanner sc = new Scanner(System.in);
 public static void main(String[] args) {
    System.out.print("vui long cho biet chieu dai: ");
    double length = sc.nextDouble();
    System.out.print("vui long nhap chieu rong: ");
    double width = sc.nextDouble();
    double S = length * width;
    if (S == Math.floor(S)) {
        System.out.println((int) S);        
    }else {
        System.out.println(S);
    }
 }   
}
