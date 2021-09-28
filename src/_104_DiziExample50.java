/**  klavyeden girilen n e göre belirtilen deseni ekrana yazdıran program
 *                    *
 *                    **
 *                    ***
 *                    ****
 *
 *
 */
public class _104_DiziExample50 {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int i, k, n, size;
        System.out.println("N değeri giriniz: ");
        n = kb.nextInt();

        for (i = 1; i <= n; i = i + 1) {
            for (k = 1; k <= i; k = k + 1)
                System.out.print("*");
            System.out.println();
        }
    }
}
