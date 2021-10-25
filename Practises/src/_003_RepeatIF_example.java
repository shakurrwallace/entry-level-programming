/** Girilen sayının 5 in katı olup olmadığını söyleyen program
 *
 *
 *
 */
package src;

public class _003_RepeatIF_example {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int a, n;
        System.out.println("N değeri giriniz : ");
        n = kb.nextInt();
        if ( n % 5 == 0)
            System.out.println("5in katıdır. ");
        else
            System.out.println("5in katı değildir.");
    }
}
