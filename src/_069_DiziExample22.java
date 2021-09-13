/**Dizinin ortalamasından küçük elemanları ekrana yazdıran program
 *
 *
 */
public class _069_DiziExample22 {
    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int i, size, avg, sum;
        size = 10;
        sum = 0;
        for (i = 0; i < size; i = i + 1)
            sum = sum + a[i];

        avg = sum / size;
        for (i = 0; i < size; i = i + 1)
            if ( a[i] < avg)
                System.out.println(a[i] + " ");



    }
}
