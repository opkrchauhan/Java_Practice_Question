/* WAJP to check whether enter number is prime or not*/

import java.util.Scanner;

public class Seventh {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int n = sc.nextInt();
    if (n < 2) {
      System.out.println("Not a prime number");
    }
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        System.out.println("Not a prime number");
        break;
      } else {
        System.out.println("Prime number");
        break;
      }
    }
    sc.close();
  }
}
