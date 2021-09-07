/** 5 elemanlı a[] dizisine 2 den başlayan 0 ları atayan program
 *
 *
 *
 */

public class _047_DiziExample2 {
    public static void main(String[] args) {
        int a[] = new int[5];
        int i;

        for (i = 0; i < 5; i= i + 1)
            a[i] = (i + 1) * 2;
        for (i = 0; i < 5; i= i + 1)
            System.out.println(a[i]);


    }
}
