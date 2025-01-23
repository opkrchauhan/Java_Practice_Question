/*WAJP to print all the Even numbers up to 100*/

public class First {
  public static void main(String[] args) {
    int n = 100;
    System.out.println("X--------------All Even numbers up to 100 ----------------X");
    for (int i = 1; i <= n; i++) {
      if (i % 2 == 0) {
        System.out.print(i + " ");
      }
    }
    System.out.println();

  }
}