/**Dİzideki elemanları 1 öne kaydıran  ve ilk elemanını en sona atayan program
 *
 *
 *
 */
public class _077_DiziExample30HMWRK {
    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        java.util.Scanner kb = new java.util.Scanner(System.in);

        int i, size, temp;
        size = 10;
        temp = a[0];


        for (i = 0; i < size ; i = i + 1)
            a[size - 1 - i] = a[i];
        for (i = 0; i < size; i = i + 1)
            a[i] = a[i];
        for (i = 0 ; i < size ; i = i + 1)
            System.out.print(a[i] + " ");
    }
}
