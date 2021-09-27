/***
 *  Desen çıktısı şu şekilde olacak: *
 *                                   **
 *                                  ***
 *                                 ****
 *klavyeden girilen n ye göre desen bu çıkacak
 */
public class _097_DrawingExample53 {
    public static void main(String[] args) {
    java.util.Scanner kb = new java.util.Scanner(System.in);
    int i, k, n ;

    System.out.println("N değeri giriniz: ");
        n = kb.nextInt();
        for (i = 1; i <= n; i = i + 1) {
        for (k = 1; k <= i; k = k + 1)

            System.out.print(" " + " * ");
            System.out.println();

        }
    }
}
