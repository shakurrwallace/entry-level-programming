/**
 *      Yapılmadı ** hocanın çözümüyle aradaki farkı sor
 *  dizide kaç adet elemanın yeri değiştiğini gösteren program if(a[i]< 10) ifadesi ne işe yarıyor ?? *
 */
public class _143_MethodLEssonExample5 {
    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int b[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        java.util.Random generator = new java.util.Random();
            int  i, size, ind1, ind2, total, temp, count;
            size = 10;
            total = 1000;
            for ( i = 1; i <= total; i = i +1) {
                ind1= generator.nextInt(size);
                ind2= generator.nextInt(size);
                temp = a[ind1];
                a[ind1] = a[ind2];
                a[ind2] = temp;
            }
        count = 0;
            for (i = 0; i < size; i = i + 1)
            if (a[i] != b[i])
                count = count + 1;
        System.out.println(count + " adet elemanın yeri değişmiş. ");
    }
}
