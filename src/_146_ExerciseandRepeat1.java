/** 10 dan küçük 1000 adet rastgele sayı üreten ve bunları ekrana yanyana yazdıran program
 *
 *
 */
public class _146_ExerciseandRepeat1 {
    public static void main(String[] args) {
        java.util.Random  generator = new java.util.Random();
        int i, n, size;
        size = 1000;


        for (i = 1; i <= size; i = i + 1) {
            n = generator.nextInt(10);
            System.out.print(n + " ");
        }
    }
}
