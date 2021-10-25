/**
 *          A VE B DEĞERİ GİRİLİYOR ARALARINDAKİ SAYILARI EKRANA YAZDIRAN PROGRAM.
 *
 *
 */
package src;

public class _014_ForExample_ABCORRELATION {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int i, size, a, b;
        System.out.println("A değeri giriniz: ");
        a = kb.nextInt();

        System.out.println("B değeri giriniz: ");
        b = kb.nextInt();
        for (i = a; i > b; i = i - 1)
            System.out.print(" " + i);


    }
}
