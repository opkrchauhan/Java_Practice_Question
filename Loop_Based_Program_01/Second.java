/*WAJP to print all the numbers upto 200 which is divisible by 8*/

public class Second {
  public static void main(String[] args) {
    int n = 200;
    for (int i = 1; i <= n; i = i + 1) {
      if (i % 8 == 0) {
        System.out.print(i + " ");
      }
    }
    System.out.println();
  }
}
