/* n klavyeden girilen pozitif sayıdır 1 den n e kadar olan sayıların tek veya çift olduğunu söyleyen program,
örnek 5 girildiğinde
1 - tek
2 - çift
3 - tek
4 - çift
5 - tek
        */

public class _039_ForExample12 {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int n, i;
        System.out.println("N değeri gir: ");
        n = kb.nextInt();
        if (n % 2 == 0) {
            for (i = 0; i <= n; i = i + 2)
                System.out.println(i + " çift");
            for (i = 1; i <= n; i = i + 2)
                System.out.println(i + " tek"); }
        else {
            for (i = 1; i <= n; i = i + 2)
                System.out.println(i + " tek");
            for (i = 0; i <= n; i = i + 2)
                System.out.println(i + " çift"); }

    }
}
