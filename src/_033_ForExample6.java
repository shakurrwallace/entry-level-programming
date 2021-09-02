public class _033_ForExample6 {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int i, n;
        System.out.println("N değeri giriniz: ");
        n = kb.nextInt();

        for (i = 1; i <= n  ; i = i  + 1 )
            System.out.print("*");
    }
}
