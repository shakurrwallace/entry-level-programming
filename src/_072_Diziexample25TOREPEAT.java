/** Dizinin son n adet elemanını sondan başa doğru yazdıran program
 * n = 1 girildiğinde 17 basacak 2 girildiğinde 17 5, n 4 girildiğinde de 17 5 20 21
 *
 *
 */
public class _072_Diziexample25TOREPEAT {
    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        java.util.Scanner kb = new java.util.Scanner(System.in);


        int i, n, size ;
        size = 10;

        System.out.println("N değeri giriniz: ");
        n = kb.nextInt();

        for (i = size - 1; i >= size - n; i = i - 1)
            System.out.print(a[i] + " ");

    }
}
