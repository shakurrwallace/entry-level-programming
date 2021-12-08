/**KABARCIK SIRALAMA SORUSU *** TEKRAR ET ****
 *Kabarcık sıralaması:  dizinin başından başlar ve dizi elemanlarını sırayla seçer.
 * * Seçilen dizi elemanı kendinden sonra gelen elemandan büyükse bu iki elemanın yerleri değiştirilir.
 * * Bu işlem sonucunda dizinin en büyük elemanı dizi sonuna yerleştirildiğinden bir sonraki adımda arama sınırı bir eleman geri çekilir.
 * * Bu işlem, dizinin sonundaki elemanın karşılaştırılmasına kadar yinelenerek sürdürülür.
 * *
 *
 *
 */
public class _092_DiziExample46TOASK {
    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int i, k, p, size;
        size = a.length;
        p = 0;
        for (i = 0; i < size - 1; i = i + 1) {
            for (k = 1; k < size; k = k + 1) {
                if (a[k - 1] > a[k]) {
                    p = a[k - 1 ];
                    a[k - 1] = a[k];
                    a[k] = p;
                }
            }
        }

        for (i = 0; i < size; i = i + 1)
        System.out.print(a[i] + " ");
    }
}
