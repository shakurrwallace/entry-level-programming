/**
 *
 *   N klavyeden girilen pozitif bir sayıdır 1 den n e kadar olan tek ve çift sayıların toplamlarını ayrı ayrı hesaplayan program
 *
 */
package src;

public class _019_ForExample_OddEven {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int i , n, sum, sumEven;
        sum = 0;
        sumEven = 0;
        System.out.println("N değeri giriniz: ");
        n = kb.nextInt();
        for ( i = 0; i < n; i = i + 1)
            if (i % 2 == 0)
                sumEven = sumEven + i;
            else
                sum = sum + i;

        System.out.println("Teklerin toplamı: " + sum);
        System.out.println("Çiftlerin toplamı: " + sumEven);

    }
}
