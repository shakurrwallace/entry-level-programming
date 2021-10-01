/*

*
 *
  *
   *
    *


* */

public class _108_DiziExample54 {
    public static void main(String[] args) {
     java.util.Scanner kb = new java.util.Scanner(System.in);
     int i, n, k;

     System.out.println("N değeri giriniz: ");
        n = kb.nextInt();
       for(;;) {
           for (i = n; i >= 1; i = i - 1) {
               for (k = n - i; k >= 1; k = k - 1)
                   System.out.print(" ");
               System.out.println("*");
           }
           for (i = 1; i <= n; i = i + 1) {
               for (k = 1; k <= n - i; k = k + 1)
                   System.out.print(" ");
               System.out.println("*");
           }
       }
    }
}

