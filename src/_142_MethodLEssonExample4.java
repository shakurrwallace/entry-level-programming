/**
 *    tekrar et**
 *   2 tane indis numarası üretilecek ve bu sayılar 1000 kere yer değişecek
 */
public class _142_MethodLEssonExample4 {
    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        java.util.Random generator = new java.util.Random();

        int i, size, ind1, ind2, total, temp;

        size = 10;
        total = 1000;

        for ( i = 1; i <= total; i = i +1) {
            ind1= generator.nextInt(size);
            ind2= generator.nextInt(size);
            temp = a[ind1];
            a[ind1] = a[ind2];
            a[ind2] = temp;
        }

        for (i = 0; i <size; i = i + 1)
            System.out.print(a[i] + " ");
    }
}
