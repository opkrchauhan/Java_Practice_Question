/* WAJP to take an input from user and count the digits which are greater than or equals to the 5 */

import java.util.*;

public class Tenth {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = sc.nextInt();
    int count = 0;
    while (n > 0) {
      if ((n % 10) >= 5) {
        count++;
      }
      n /= 10;
    }
    System.out.println("Number of count is " + count);
    sc.close();
  }
}
