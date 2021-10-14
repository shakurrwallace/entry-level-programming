/**  10 dan küçük rastgele sayılı üreten 1000 adet ve bunları ekrana yan yana yazdıran program
 *
 *
 */
public class _140_MethodLEssonExample2 {
    public static void main(String[] args) {
            java.util.Random generator = new java.util.Random();
            int n, i, size;
            size = 1000;

            for (i = 0; i < size; i = i + 1) {
                n = generator.nextInt(10);
                System.out.print(n + " ");
            }
    }
}
