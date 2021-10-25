/**
 *          3 değişken arasındaki büyüklük küçüklük ilişkisini gösteren program.
 *
 *
 */
package src;

public class _008_IfExample_Correlation {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int a, b, c;
        b = 42;
        c = 24;
        System.out.println("A değeri giriniz: ");
        a = kb.nextInt();
        if (a > b)
            System.out.println("A b den büyüktür. ");
        else
            System.out.println("B a dan büyüktür. ");
            if (a > c)
                System.out.println("A c den büyüktür");
            else
                System.out.println("C a dan büyüktür. ");



    }
}
