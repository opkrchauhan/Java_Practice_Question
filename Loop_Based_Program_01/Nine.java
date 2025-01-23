/* WAJP to take an input from the user and count the even digits of the number entered */

import java.util.Scanner;

public class Nine {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    int count = 0;
    while (n > 0) {
      if ((n % 10) % 2 == 0) {
        count++;
      }
      n /= 10;
    }
    System.out.println("Number of count even digits : " + count);
    sc.close();
  }
}