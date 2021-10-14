/**
 *
 *  klavyeden girilen sayıdan diziden kaç tane olduğunu yazdıran program
 */
public class _133_DiziExampleLesson {
    public static void main(String[] args) {
        int a[] = {5, 5, 3, 7, 8, 5, 7, 7, 7, 3, 8, 9, 8, 9, 8, 8, 15, 5, 8, 4};
        int i, n, size, cnt;

        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("N değeri giriniz: ");
        n = kb.nextInt();
        cnt = 0;
        size = a.length;
        for (i = 0; i < size; i = i + 1)
        if (n == a[i])
            cnt = cnt + 1;
        System.out.println(cnt + " ");


    }
}
