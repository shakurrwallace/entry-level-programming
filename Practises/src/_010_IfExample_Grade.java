/**
 *           harf notunu gösteren program.
 *
 *
 */
package src;

public class _010_IfExample_Grade {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int n;
        System.out.println("Notu giriniz: ");
        n = kb.nextInt();
        if (n > 80)
            System.out.println("Harf notu: A " );
        else
        if (n > 60)
            System.out.println("Harf Notu: B ");
        else
        if (n > 40)
            System.out.println("Harf Notu: C");
        else
        if (n > 20)
        System.out.println("Harf notu: D ");
        else
        System.out.println("Harf Notu: E");

    }
}
