/**
 *    girilen değerlerin ikizkenar olup olmadığını gösteren program.
 *
 *
 *
 */
package src;

public class _007_IFexample_Triangle {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int a, b, c;
        System.out.println("A değeri giriniz: ");
        a = kb.nextInt();

        System.out.println("B değeri giriniz: ");
        b = kb.nextInt();

        System.out.println("C değeri giriniz: ");
        c = kb.nextInt();
        if (a == b)
            if (a != c)
                System.out.println("İkizkenardır. ");
            else
                System.out.println("İkizkenar değildir.");
        else
            if (b == c)
                System.out.println("İkizkenardır");
            else
                if (a == c)
                System.out.println("İKizkenardır.");
                else
                System.out.println("İkizkenar değildir.");
    }
}
