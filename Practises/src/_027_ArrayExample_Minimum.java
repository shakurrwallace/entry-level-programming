/**
 *              Klavyeden girilen küçük sayının dizi elemanlarını ekrana yazdıran program
 *
 *
 */
package src;

public class _027_ArrayExample_Minimum {
    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int i, n, size;
        size = a.length;
        System.out.println("N değeri giriniz: ");
        n = kb.nextInt();
        for ( i = 0; i < size; i = i + 1)
            if (n > a[i])
                System.out.println(" küçük değerler : " + a[i]);



    }
}
