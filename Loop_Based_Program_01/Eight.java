/* WAJP to take an input from user and count the digits of the number entered */

import java.util.Scanner;

public class Eight {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    int count = 0;
    while (n > 0) {
      count++;
      n /= 10;
    }
    System.out.println("Number of digits count is : " + count);
    sc.close();
  }
}
