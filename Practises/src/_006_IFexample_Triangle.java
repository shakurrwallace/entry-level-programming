/**    girilen sayılardan eşkenar üçgen oluşup oluşmadığını gösteren program.
 *
 *
 */
package src;

public class _006_IFexample_Triangle {
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
            if (a == c)
                System.out.println("Eşkenar üçgendir. ");
            else
                System.out.println("Eşkenar üçgen değildir. ");
            else
            System.out.println("EŞkenar üçgen değildir.");
    }
}
