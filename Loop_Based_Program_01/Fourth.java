/* WAJP to print all the numbers upto 500 which are divisible by 7 and end with 7  */
public class Fourth {
  public static void main(String[] args) {
    for(int i=7;i<=500;i+=7) {
      if(i%7==0 && (i%10)==7){
        System.out.print(i+" ");
      }
    }
    System.out.println();
  }
}
