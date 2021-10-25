/**
 *          klavyeden girilen sayıların aşağı değerlerini yazdıran program.
 *
 *
 */
package src;

public class _013_ForExample_Beginning {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int i, size, n;
        n = kb.nextInt();

        for (i = n; i > 0; i = i - 1)
            System.out.print(" " + i);


    }
}
