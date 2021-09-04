/** 10 dan 90 a kadar 4 er 4er artarak giden fahrenheit içerisinden sıcaklık değerlerinin celcius değerlerini ekrana yazdıran program
 *
 *
 *
 */public class _044_ForExample17 {
    public static void main(String[] args) {
        double c, f, i;
        for (f = 10; f <= 90; f = f + 4) {
            System.out.println("Fahrenheitin değeri: " + f);
            c = 5.0 / 9 * ( f-32 );
            System.out.println("Celciusun değeri:" + c); }
    }
}
