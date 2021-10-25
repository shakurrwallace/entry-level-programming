/**
 *    girilen sayının basamaklarını ayırıp karesini alan program.
 *
 *
 */
package src;

public class _005_RepeatIf_DigitDivision {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int a, b , c, d;
        System.out.println("A değeri giriniz: ");
        a = kb.nextInt();
        System.out.println("A değeri : " + a);
        // onlar basamağı değeri
        b = a / 10;
        // birler basamağı değeri
        c = a % 10;

        d = b * c;
        System.out.println("Basamaklarının karelerinin çarpımı: " + d);
    }
}
