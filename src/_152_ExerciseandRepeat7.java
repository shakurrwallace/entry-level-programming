/**
 *         bilgisayara 1 milyon defa yazı tura attırıp kaç tura kaç yazı gelmiş
 *
 *
 */
public class _152_ExerciseandRepeat7 {
    public static void main(String[] args) {
        java.util.Random generator = new java.util.Random();
        int i, n, head, tail, size, flag;
        flag = 0;
        size = 1_000_000;
        head = 0;
        tail = 0;
        for (i = 0;i < size; i = i +1) {
            n = generator.nextInt(2);
            if (n == 1)
                tail = tail + 1;
            else
                head = head + 1;
        }
        System.out.println("yazı: " + tail);
        System.out.println("tura: " + head);




    }
}
