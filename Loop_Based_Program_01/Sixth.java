/* WAJP to take an input from user and count the factors of the numbers (number itself not included) */

import java.util.Scanner;

public class Sixth {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count = 0;
    for (int i = 1; i < n; i++) {
      if (n % i == 0) {
        count++;
      }
    }
    System.out.println("Number of factors count : " + count);
    sc.close();
  }
}
