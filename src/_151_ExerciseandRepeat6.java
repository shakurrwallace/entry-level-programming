/**
 *         10dan küçük 6 farklı rastgele sayıları üreten program
 *
 *
 */
public class _151_ExerciseandRepeat6 {
    public static void main(String[] args) {
        java.util.Random generator = new java.util.Random();
        int a[] = {0, 0, 0 ,0 , 0, 0};
        int i, size, cnt, flag, n;

        cnt = 0;
        flag = 0;
        size = a.length;

        while (cnt != size) {
            n = generator.nextInt(10);
            flag = 0;

            for (i = 0; i < cnt; i = i + 1)
                if (n == a[i])
                    flag = 1;

            if (flag == 0) {
                a[cnt] = n;
                cnt = cnt + 1;
            }
        }
        for (i = 0; i <size; i = i +1)
        System.out.print(a[i] + " ");



    }
}
