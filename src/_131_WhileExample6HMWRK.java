/**  klavyeden girilen sayının basamaklarını ayıran program 7 2 3 5 girildiğinde ekrana sırasıyla 5 3 2 7 yazılacak
 *
 *
 */
public class _131_WhileExample6HMWRK {
    public static void main(String[] args) {
        int n, digit ;
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("N değeri giriniz: ");
        n = kb.nextInt();
        while (n != 0) {
            digit = n % 10;
            System.out.println(digit);
            n = n / 10;
        }


    }
}
