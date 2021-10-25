/**
 * klavyeden girilen sayıyı dizide sıralı olarak yerine yerleştiren program
 *  klavyeden 1 tane sayı girilecek onu da sıralı olarak yerine yerleştiriceksiniz 0 her halükarda silinecek
 *  örneğin  12 girildi 1 5 12 12 15 19 28
 *
 */
public class _160_DiziExample {
    public static void main(String[] args) {
        int a[] = {1, 5, 12, 15, 19, 28, 35, 46, 60, 0};
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int i, k, size, p, n;
        size = a.length;
        System.out.println("N değeri giriniz: ");
        n = kb.nextInt();

        for(i = 0; i < size; i = i + 1 );
            n = a[size -1];
        for(i  = 0; i< size; i = i +1 )
            System.out.print(a[i] + " ");





    }
}

