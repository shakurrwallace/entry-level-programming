/** ****
 *  ****
 *  ***
 *  **
 *  *
 *  Bu deseni yazdır
 *
 *
 *
 */
public class _105_DiziExample51 {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int n;
        System.out.println("N değeri giriniz: ");
        n = kb.nextInt();

        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();

        }

    }
}
