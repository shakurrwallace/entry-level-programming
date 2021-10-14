/**
 *
 *  klavyeden girilen sayının dizide olup olmadığını söyleyen program
 *
 */
public class _134_DiziExampleLesson2 {
    public static void main(String[] args) {
        int a[] = {5, 5, 3, 7, 8, 5, 7, 7, 7, 3, 8, 9, 8, 9, 8, 8, 15, 5, 8, 4};
        int i, n, size, flag;

        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("N değeri giriniz: ");
        n = kb.nextInt();
        size = a.length;
        flag = 0;
        for (i = 0; i < size; i = i + 1)
            if (n == a[i])
                flag = 1;
            if (flag == 1)
                System.out.println("var");
            else
                System.out.println("yok");



    }
}
