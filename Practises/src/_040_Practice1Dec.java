/* klavyeden girilen notun harf karşılığını ekrana yazdıran program
 *
 *
 *
 */
package src;
public class _040_Practice1Dec {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int n;

        System.out.println("N değeri giriniz: ");
        n = kb.nextInt();

        if (n > 80)
            System.out.println("A");
        else if (n > 60)
            System.out.println("B");
        else if (n > 40)
            System.out.println("C");
        else if (n > 20)
            System.out.println("D");
        else
            System.out.println("E");


    }
}
