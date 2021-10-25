/**
 *          1 den 100 arasındaki 3 4 5 in katlarını ekrana yazdıran program
 *
 *
 */
package src;

public class _018_ForExample_345 {
    public static void main(String[] args) {
        int i, size;
        size = 100;
        for (i = 1; i < size; i = i + 1)
            if ( i % 3 == 0)
                System.out.print(" " + i);
            if (i % 4 == 0)
                System.out.print(" " + i);
            if (i % 5 == 0)
                System.out.print(" " + i);



    }
}
