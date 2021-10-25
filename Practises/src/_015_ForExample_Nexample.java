/**
 *
 *  n klavyeden girilen pozitif bir sayıdır n çift ise 0 dan n e kadar ( n dahil ) olan çift sayıları, tek ise 1 den n e kadar olan( n dahil) tek sayıları ekrana yazdıran program
 *         // örneğin n = 8 girildiğinde 0 2 4 6 8 olacak, n = 9 girildiğinde 1 3 5 7 9
 *
 */
package src;

public class _015_ForExample_Nexample {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int i, n, size;
        size = 10;
        System.out.println("N değeri giriniz: ");
        n = kb.nextInt();
        if (n % 2 == 0)
            for (i = 0; i < size; i = i + 2)
                System.out.print(" " + i);
        else
            for (i = 1; i < size; i = i + 2)
                System.out.print(" " + i);
    }
}
