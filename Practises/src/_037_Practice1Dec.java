/*
 *  klavyeden a ve b giriliyor a ve b arasındaki büyüklük ilişkisini yazdıran program
 *
 */
package src;
public class _037_Practice1Dec {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int a, b;

        System.out.println("A değeri giriniz: ");
        a = kb.nextInt();
        System.out.println("B değeri giriniz: ");
        b = kb.nextInt();

        if (a > b)
            System.out.println("A > B");
        else if (a < b)
            System.out.println("A < B");
        else
            System.out.println("A = B");



    }

}
