/**
 *  ** klavyeden girilen n ye göre belirtilen deseni ekrana bastıran program
 *  *
 *  *  bu program : ****
 *  *               ***
 *  *               **
 *  *               *
 *  *               böyle gidiyor
 *
 *
 */
package src;
public class _035_ArrayExample_Orient {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int i, k, size, n;
        size = 5;
        System.out.println("N değeri giriniz : ");
        n = kb.nextInt();
        for(i = n; i >= 1; i = i - 1) {
            for (k = i; k >= 1; k = k - 1)
                System.out.print("*");
            System.out.println();
        }

    }
}
