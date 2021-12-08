/**
 * klavyeden girilen n e göre belirtilen deseni ekrana yazdıran program
 *  *                    *
 *  *                    **
 *  *                    ***
 *  *                    ****
 *
 */
package src;

public class _036_ArrayExample_Orient {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int i, k, n;
        System.out.println("N değeri giriniz: ");
        n = kb.nextInt();

        for (i =1; i <= n; i = i + 1) {
        for  (k = 1; k <= i; k = k + 1)
            System.out.print("*");
            System.out.println();
        }
    }
}
