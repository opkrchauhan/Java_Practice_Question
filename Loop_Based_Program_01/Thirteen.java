/* WAJP to take a and b from user and print a to power b*/

import java.util.Scanner;

public class Thirteen {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number a : ");
    int a = sc.nextInt();
    System.out.print("Enter number b : ");
    int b = sc.nextInt();
    int res = 1;
    while (b > 0) {
      res = res * a;
      b--;
    }
    System.out.println("a to power b is " + res);
    sc.close();
  }
}
