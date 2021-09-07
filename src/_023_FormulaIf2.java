public class _023_FormulaIf2 {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int x, y, z;
        System.out.println("X değeri giriniz: ");
        x = kb.nextInt();
        if (x <= 0) {
            y = x * x + 2 * x;
            z = x * x * x;
        } else
            if (x < 100) {
                y = -x * 50;
                z = x * x - 2 * x;
            } else {
                y = x * x * x - 2 * x + 1;
                z = 10;
            }

        System.out.println("Y nin değeri: " + y);
        System.out.println("Z nin değeri: " + z);
    }
}
