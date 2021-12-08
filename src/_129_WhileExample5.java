/**   klavyeden bir sayı okunuyor klavyeden okunan sayının 10dan bölümünden kalan 0 olmadıkça dönecek
 *
 *
 */
public class _129_WhileExample5 {
    public static void main(String[] args) {
    int n, sum;
    java.util.Scanner kb = new java.util.Scanner(System.in);
    sum = 0;
        System.out.println("N değeri giriniz: ");
        n = kb.nextInt();
    while (sum == 0) {
        System.out.println("N değeri giriniz: ");
        n = kb.nextInt();
        }
        System.out.println("bölümünden kalan " + n);
    }
}
