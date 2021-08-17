public class _002_AdditionProgramKeyboard {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int a, b, c;
        System.out.println("A degeri giriniz : ");
        a = kb.nextInt();
        System.out.println("B degeri giriniz: ");
        b = kb.nextInt();

        c = a + b;
        System.out.println("Ikisinin toplami = " + c);
    }
}
