/** ikinci dizi yardımıyla a dizisini n defa kaydıran program
 *
 * n = 4 girildiğinde a nın ilk 4 elemanını korumaya yedeklemeye almak gerekiyor b[] dizisi = 4 8 3 1 a dizisinin sonuçta şu olacak 18 9 21 20 5 17 4 8 3 1
 *
 */
public class _084_DiziExample37 {
    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int b[] = new int[10];
        int i, size, n;
        size = 10;
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("N değeri giriniz: ");
        n = kb.nextInt();

        for (i = 0; i < n; i = i + 1)
            b[i] = a[i];

        for (i = n; i < size; i = i + 1)
            a[i - n] = a[i];

        for (i = 0; i < n; i= i + 1)
            a[size - n + i] = b[i];

        for(i = 0; i < size; i = i +1)
            System.out.print(a[i] + " ");

    }
}
