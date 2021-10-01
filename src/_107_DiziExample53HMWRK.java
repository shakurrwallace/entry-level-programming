public class _107_DiziExample53HMWRK {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        int i, k , n;

        System.out.println("N değeri giriniz: ");
        n = kb.nextInt();

        for (i = n; i >= 1; i = i - 1) {
            for (k = 1; k <= n - i ; k = k + 1)
                System.out.print(" ");
            for (k = 1; k <= i; k = k + 1)
                System.out.print("*");
            System.out.println();
        }
    }
}
