/**
 *  Dizinin son n adet elemanını dizinin başına atayan ve sondaki elemanları 0 layan program n = 7 girildiğinde sonuç 1 18 9 21 20 5 17 0 0 0
 *
 *
 */
package src;

public class _030_ArrayExample_Algorithm {
    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int i, size, n;
        size = a.length;
        System.out.println("N değeri giriniz: ");
        n = kb.nextInt();
        for(i = 0; i < n; i = i + 1)
            a[i] = a[size - n + i];
        for(i =n; i < size; i = i + 1)
            a[i] = 0;
        for(i = 0; i < size; i = i + 1)
            System.out.print(" " + a[i]);


    }
}
