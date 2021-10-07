/**   klavyeden bir sayı okunuyor klavyeden okunan sayının 10dan bölümünden kalan 0 olmadıkça dönecek
 *
 *
 */
public class _129_WhileExample5 {
    public static void main(String[] args) {
    int n, sum;
    java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("N değeri giriniz: ");
        n = kb.nextInt();
    while (n != 0) {
        System.out.println();
        n = n / 10;
        }
        System.out.println("bölümünden kalan " + n);
    }
}
