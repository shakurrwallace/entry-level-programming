/**
 *      Klavyeden x ve y giriliyor x in y den küçük olduğu kabul ediliyor x den büyük y den küçük dizi elemanlarını ekrana yazdıran program
 *
 */
package src;

public class _028_ArrayExample_XY {
    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int i, x, y, size;
        size = a.length;
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("X değeri giriniz: ");
        x = kb.nextInt();
        System.out.println("Y değeri giriniz: ");
        y = kb.nextInt();
        for(i = 0; i < size; i = i + 1)
            if (x < a[i])
                if ( y > a[i])
                    System.out.println(" " + a[i]);

    }
}
