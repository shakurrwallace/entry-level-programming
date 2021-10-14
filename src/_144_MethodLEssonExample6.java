/** 10dan küçük 6 farklı rastgele sayı üreten program
 * 6 elemanlı bir dizi olacak 6.elemanı üretirken diğer 5 taneden farklı mı diye bakmamız gerekiyor bunu flag yöntemi ile yapabiliriz 6.sayıyı üretiyoruz 5 tanenin içinde var mı ?
 * var mı yok mu yöntemini flag sayesinde yapıcaz durum değişkeninin durumuna göre var mı yok mu diyeceğiz.
while döngüsü 6 farklı sayı üretilene kadar, tekrar tekrar yapılacak işler: sayı üretilecek, daha önce üretilmiş mi diye bakılacak,
 üretilmediyse diziye atanacak ve sayaç 1 arttırılacak.
 size adet şu aralıkta farklı sayı üretiyor = teldeki foto
***** bu soruyu sor***
 */

public class _144_MethodLEssonExample6 {
    public static void main(String[] args) {
        int a[] = new int[6];
        java.util.Random generator = new java.util.Random();
        int i, size, n, count, flag;
        size = a.length;

        count = 0;
        while ( count != size) {
            n = generator.nextInt(10);
            flag = 0;

        }



    }
}
