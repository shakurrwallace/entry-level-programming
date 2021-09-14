/** s nolu elemandan başlayarak n kadar n adet kadar geri basan program
 * s 5 girildiğinde n 4 girildiğinde
 * 9 18 1 3 basacak
 */
public class _074_DiziExample27 {
    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        java.util.Scanner kb = new java.util.Scanner(System.in);

        int i, n, s, size ;
        size = 10;

        System.out.println("S değeri giriniz: ");
        s = kb.nextInt();
        System.out.println("N değeri giriniz: ");
        n = kb.nextInt();

        for (i = s; i > s - n; i = i - 1)
            System.out.println(a[i]);


    }
}
