/**
 *       5 sayıyı toplayan program
 *
 *
 */
package src;

public class _020_ForExample_Sum {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int i, size, n, sum;
        size = 5;
        sum = 0;
        for (i = 1; i <= size; i = i + 1) {
            System.out.println(i + ". sayıyı giriniz: ");
            n = kb.nextInt();
            sum = sum + n;
        }
        System.out.println("5 sayının toplamı: " + sum);

    }
}
