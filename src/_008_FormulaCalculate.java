public class _008_FormulaCalculate {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int a, b, c, result;
        System.out.println("A degeri gir: ");
        a = kb.nextInt();
        System.out.println("B degeri gir:");
        b = kb.nextInt();
        System.out.println("C degeri gir: ");
        c = kb.nextInt();
        result = (3 * a * a * a ) + (4 * b * b ) + (3 * c);
        System.out.println("Bu islemin sonucu: " + result);

    }
}
