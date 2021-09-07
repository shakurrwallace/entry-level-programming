/**
 *
 * klavyeden girilen 10 sayının toplamını yazan program
 */
public class _052_ForExample20 {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int i,n, sum;
        sum = 0;
        for (i = 1; i <= 10; i = i + 1) {
            System.out.println(i + ". sayıyı giriniz: ");
            n = kb.nextInt();
            sum = n + sum;
        }
        System.out.println("Toplam değer: " + sum);
    }
}
