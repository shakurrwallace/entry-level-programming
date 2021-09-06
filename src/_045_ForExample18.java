/** 5 Sayıyı toplayan program
 *
 *
 *
 */


public class _045_ForExample18 {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        int i, n, sum;
        sum = 0;
        for ( i = 1; i <= 5; i = i + 1) {
            System.out.println(i + " .Sayıyı giriniz: ");
            n = kb.nextInt();
            sum = sum + n;
        }
        System.out.println("Toplam " + sum);



    }
    }
