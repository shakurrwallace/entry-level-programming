/**
 *
 *
 *   klavyeden 0 girilinceye kadar çalışan program
 */
public class _130_WhileExample3 {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int i, n, sum;
        System.out.println("N değeri giriniz: ");
        n = kb.nextInt();
        while (n != 0) {
            System.out.println("N değeri giriniz: ");
            n = kb.nextInt();
        }

    }
}
