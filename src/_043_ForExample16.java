/**N klavyeden girilen pozitif bir sayıdır 1 den n e kadar olan tek ve çift sayıların toplamlarını ayrı ayrı hesaplayan program
 *
 *
 */


public class _043_ForExample16 {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int n, i , sum, sum2;
        sum = 0;
        sum2 = 0;
        System.out.println("N değeri giriniz: ");
        n = kb.nextInt();
            for (i = 1; i <= n; i = i + 2)
                sum = sum + i;
                        System.out.println("tek sayıların toplamı: "+ " " + sum);
             for (i = 0; i <= n; i = i + 2)
                sum2 = sum2 + i;
                        System.out.println("çift sayıların toplamı: " +  sum2);



    }
}
