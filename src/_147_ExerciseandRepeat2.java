/** 10dan küçük üretilen 1000 adet rastgele sayının kaçının tek olduğu kaçının çift olduğunu ekrana yazdıran program
 *
 *
 */
public class _147_ExerciseandRepeat2 {
    public static void main(String[] args) {
        java.util.Random  generator = new java.util.Random();
        int i, n, size, cnt, cntEven;
        size = 1000;

        cnt = 0;
        cntEven =0;
        for (i = 1; i <= size; i = i + 1) {
            n = generator.nextInt(10);
            if (n % 2 != 0)
                cnt = cnt + 1;
            else
                cntEven = cntEven + 1;
        }
        System.out.println("tek sayılar adeti: " + cnt);
        System.out.println("çift sayılar adeti: " + cntEven);

    }
}
