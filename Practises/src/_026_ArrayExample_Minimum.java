/*
 *              Dizideki mininmum sayıları bulan program
 *
 */
package src;

public class _026_ArrayExample_Minimum {
    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int i, size, min;
        size= a.length;
        min = a[0];
        for(i = 1; i < size; i = i + 1)
            if (min > a[i])
                min = a[i];



        System.out.println("minimum sayı: " + min);


    }
}
