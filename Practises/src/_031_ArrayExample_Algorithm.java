/**
 *  klavyeden s ve n giriliyor dizinin s nolu elemanından başlayarak n adet elemanını kendi içinde bir öne kaydıran program
 *
 *
 */
package src;

public class _031_ArrayExample_Algorithm {
    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int i, size, n, s, temp;
        size = a.length;

        System.out.println("S değeri giriniz: ");
        s = kb.nextInt();

        System.out.println("N değeri giriniz: ");
        n = kb.nextInt();
        temp = a[s];

        for(i = s + 1; i < s + n; i = i  + 1)
            a[i - 1] = a[i];

        a[s + n - 1] = temp;
        for(i = 0; i <size; i = i + 1)
            System.out.print(" " + a[i]);




    }
}
