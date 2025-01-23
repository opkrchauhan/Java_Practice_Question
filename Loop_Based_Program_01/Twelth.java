/* WAJP to take an input from user and print the factorial of the Number*/

import java.util.Scanner;

public class Twelth {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number ");
    int n = sc.nextInt();
    int num = n;
    int factorial = 1;
    while (n > 0) {
      factorial = factorial * n;
      n--;
    }
    System.out.println("factorial of " + num + " is " + factorial);
    sc.close();
  }
}
