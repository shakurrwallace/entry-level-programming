/**
 *      Dizideki sayıların ortalaması
 *
 *
 */
package src;

public class _023_ArrayExample_Average {
    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 7};
        int i, sum, avg, size;
        size = a.length;
        sum = 0;
        for(i = 0; i < size; i = i + 1)
            sum = sum + a[i];

        avg = sum /size;
            System.out.println("Dizideki sayıların ortalaması: " + avg);

    }
}
