/* WAJP to take an input from user and print all the factors of the number number itself not included */

import java.util.Scanner;

public class Fifth {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number : ");
    int n = sc.nextInt();
    System.out.print("Factors of that numbers are : ");
    for (int i = 1; i < n; i++) {
      if (n % i == 0) {
        System.out.print(i + "  ");
      }
    }
    System.out.println();
    sc.close();
  }
}
