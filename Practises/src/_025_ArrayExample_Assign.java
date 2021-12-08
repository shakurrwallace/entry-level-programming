/*
 *
 * 5 elemanlı bir dizi her bir elemanına 9 atayıp ardından dizinin bütün elemanlarını ekrana ytazdıran program
 *
 *
 *
 */
package src;

public class _025_ArrayExample_Assign {
    public static void main(String[] args) {
        int a[] = new int[5];
        int i, size;
        size = a.length;
        for(i = 0; i < size; i = i + 1)
            a[i] = 5;
        for(i = 0; i <size; i = i + 1)
            System.out.print(" " + a[i]);

    }
}
