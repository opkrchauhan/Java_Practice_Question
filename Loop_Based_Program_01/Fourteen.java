/* WAJP to generate first N Fibonacci Numbers*/

import java.util.Scanner;

public class Fourteen {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number : ");
    int n = sc.nextInt();
    int a = 0, b = 1, c = 0;
    System.out.print(a + " " + b + " ");
    int i = 2;
    while (i <= n) {
      c = a + b;
      System.out.print(c + " ");
      a = b;
      b = c;
      i++;
    }
    sc.close();
  }
}
