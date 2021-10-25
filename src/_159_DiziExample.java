/**
 * diziyi her sayıdan 1 tane kalacak şekilde düzenleyen bu sayıları dizinin başında biriktiren ve geri kalan elemanları sıfırlayan program
 *
 */
public class _159_DiziExample {
    public static void main(String[] args) {
        int a[] = {17, 1, 5, 1, 24, 1, 17, 9, 24, 20, 3, 8, 17, 17};
        int i, k, size, p, flag;
        size = a.length;
        p = 1;

        for(i = 1; i <size; i = i + 1 ) {
            flag = 0;
            for(k= 0; k < i; k = k + 1)
                if (a[i] == a[k])
                    flag = 1;
            if (flag == 0) {
            a[p] = a[i];
            p = p + 1;
                }
                }
        for(i = p; i < size; i = i +1 )
            a[i] = 0;
        for(i = 0; i < size; i = i + 1)
            System.out.print(a[i] + " ");
    }
}

