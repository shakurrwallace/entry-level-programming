/**
 *
 * klavyeden girilen 10 sayının toplamını yazan program
 */
public class _052_ForExample20 {
    public static void main(String[] args) {
       java.util.Scanner kb = new java.util.Scanner(System.in);
       int i, size, n, sum;
       size = 10;
       sum = 0;
       for(i = 1; i <= size; i = i + 1) {
           System.out.println(i +". sayıyı giriniz: ");
           n = kb.nextInt();
           sum = sum + n;
       }
        System.out.println("toplam: " + sum);
    }
}
