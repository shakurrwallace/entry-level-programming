/** Dizinin ilk n adet elemanını dizinin sonuna atayan ve baştaki elemanları 0 layan program
 **
 ** n = 7 girildiğinde = 0 0 0 4 8 3 1 18 9 21
 *
 *
 *
 */
package src;
public class _029_ArrayExample_Algorithm {
    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int i, size, n;
        size = a.length;
        System.out.println("N Değeri giriniz: ");
        n = kb.nextInt();
        for(i = 0; i < n; i = i + 1)
            a[size -1 - i] = a[n - 1 - i];
        for (i = 0; i < size - n; i = i  + 1)
            a[i] = 0;
        for(i = 0; i < size; i = i + 1)
            System.out.print(" " + a[i]);

    }
}
