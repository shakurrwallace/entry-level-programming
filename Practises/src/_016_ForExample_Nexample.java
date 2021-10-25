/**  n klavyeden girilen pozitif bir tam sayıdır 1den n e kadar olan sayıları toplamını ekrana yazan program
 *
 *
 */
package src;

public class _016_ForExample_Nexample {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int i, n, size, sum;
        size = 10;
        sum = 0;
        System.out.println("N değeri giriniz: ");
        n = kb.nextInt();
        for(i = 0; i <= n; i = i + 1)
            sum = sum + i;
        System.out.println(sum);
    }
}
