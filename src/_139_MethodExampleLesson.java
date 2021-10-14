/**   10 dan küçük rastgele sayı yazdıran program
 *
 *
 */
public class _139_MethodExampleLesson {
    public static void main(String[] args) {
        java.util.Random generator = new java.util.Random();
        int n;

        n = generator.nextInt(10);

        System.out.println(n);
    }
}
