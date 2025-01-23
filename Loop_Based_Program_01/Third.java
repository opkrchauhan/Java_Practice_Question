/*WAJP to print all the numbers upto 200 which are divisible by 7 and end with 7 */
public class Third {
  public static void main(String[] args) {
    int n = 200;
    for (int i = 1; i <= n; i++) {
      if (i % 7 == 0 && (i % 10) == 7) {
        System.out.print(i + " ");
      }
    }
    System.out.println();
  }
}
