public class _007_UseAndAssign {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int a;
        System.out.println("A ya deger giriniz: ");
        a = kb.nextInt();
        a = a * a;
        System.out.println("A nin karesi: " + a);
    }
}
