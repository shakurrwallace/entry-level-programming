/**
 *
 *   10 dan küçük 1000 adet üretilen sayının kaç tanesi tek kaç tanesi çift
 */
public class _141_MethodLEssonExample3 {
    public static void main(String[] args) {
            java.util.Random generator = new java.util.Random();
            int n, i, size, cnt, cntEven;
            size = 1000;
            cnt = 0;
            cntEven= 0;
            for (i = 0; i < size; i = i + 1) {
                n = generator.nextInt(10);
                System.out.print(n + " ");
                if (n % 2 != 0)
                    cnt = cnt + 1;
               else
                    cntEven= cntEven + 1;
            }
        System.out.println("Tek sayılar adeti : " + cnt);
        System.out.println("Çift sayılar adeti: " + cntEven);
    }
}
