/**  girilen sayıların tek veya çift olduğunu gösteren program
 *
 *
 */
package src;

public class _004_RepeatIF_Example {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int a, b , c;
        System.out.println("A değeri giriniz: ");
        a = kb.nextInt();

        System.out.println("B değeri giriniz: ");
        b = kb.nextInt();

        System.out.println("C değeri giriniz: ");
        c = kb.nextInt();
        if ( a % 2 == 0)
            System.out.println("A çift sayıdır.");
        else
            System.out.println("A tek sayıdır.");

        if (b % 2 == 0)
            System.out.println("B çift sayıdır.");
        else
            System.out.println("B tek sayıdır.");

        if ( c % 2 == 0)
            System.out.println("C çift sayıdır.");
        else
            System.out.println("C tek sayıdır.");


    }
}
