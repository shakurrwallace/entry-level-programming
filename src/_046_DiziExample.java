/**
 *Dizi başlangıç örneği a[] = dizinin ismi, new int [] ise dizinin eleman sayısı bu örnekte dizi 10 elemanlı ve 7 yi 10 kez yazdırıyor
 *
 *
 */

public class _046_DiziExample {
    public static void main(String[] args) {
    int a[] = new int [10];
    int i;

    for (i = 0; i < 10; i = i + 1 )
        a[i] = 7;
    for (i = 0; i < 10; i = i + 1 )
        System.out.println(" " + a[i]);



    }
}
