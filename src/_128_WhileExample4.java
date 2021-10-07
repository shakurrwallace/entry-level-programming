/**
 *    klavyeden sürekli sayı giriliyor ve bu sayılar toplanarak gidiyor, toplam 1000 geçince son toplam ekrana yazdırılıyor ve programıon çalışması sonlanıyor
 *
 *
 */
public class _128_WhileExample4 {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int n, sum;

        sum = 0;

        while (sum <= 1000) {
            System.out.println("N değeri giriniz: ");
            n = kb.nextInt();

        sum = sum + n;
        }

        System.out.println("En son kalan toplam: " + sum);
    }
}
