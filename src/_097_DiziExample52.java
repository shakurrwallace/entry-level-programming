/** klavyeden girilen n ye göre belirtilen deseni ekrana bastıran program
 *
 *  bu program : ****
 *               ***
 *               **
 *               *
 *               böyle gidiyor
 */
public class _097_DiziExample52 {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int i , k, n ;
        System.out.println("N değeri giriniz: ");
        n = kb.nextInt();

        for (i = n; i >= 1; i = i - 1) {
            for (k = n; k >= i; k = k - 1)
                System.out.print("*");
            System.out.println();
        }
        }
}
