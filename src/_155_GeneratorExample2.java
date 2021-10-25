/*** 1 milyon defa 1 ile 90 arasında(1 ve 90 ) dahil 3 farklı sayı üretilecek, bu 3 sayının toplamı 101 veya 101den küçükse sayaç 1 arttırılacak
 * en sonda sayaç 1 milyona bölünerek yaklaşık kazanma olasılığı bulunacak.
 *
 *  tombala oyunu
 *
 * yapılmadı
 */
public class _155_GeneratorExample2 {
    public static void main(String[] args) {
       java.util.Random generator = new java.util.Random();
        int a[] = new int[3];
        int i , size, k, n, count, flag;
        double win, total, ratio;
        size = 3;

        win = 0;
        total = 1_000_000;
        for(i = 1; i <= total; i = i + 1) {
            count = 0;
            while (count != size) {
                n = generator.nextInt(90) + 1;
                flag = 0;
                for (k = 0; k < count; k = k + 1)
                    if (n == a[k])
                        flag = 1;
                if (flag == 0) {
                    a[count] = n;
                    count = count + 1;
                }
            }
            if (a[0] + a[1] + a[2] <= 101)
                win = win + 1;
        }
        ratio = win / total * 100;
        System.out.println("Kazanma oranı % " + ratio);

    }
}
