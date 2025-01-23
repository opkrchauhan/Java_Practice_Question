/* WAJP to take an input user and print only even digits of the number */

import java.util.Scanner;

public class Eleventh {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = sc.nextInt();
    System.out.print("Even digits are : ");
    while (n > 0) {
      int rem = n % 10;
      if (rem % 2 == 0) {
        System.out.print(rem + " ");
      }
      n /= 10;
    }
    sc.close();
  }
}
