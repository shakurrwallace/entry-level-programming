/**
 *
 *
 */
public class _098_DrawingExample54 {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int i, k, n;

        System.out.println("N değeri giriniz: ");
        n = kb.nextInt();
        for (i = 1; i <= n; i = i + 1) {
            for (k = 1; k <= n; k = k + 1)
                System.out.println(" ");
            for (k = 0; k <= i; k = k + 1)
                System.out.print("*");
            System.out.println();
        }
    }
}
