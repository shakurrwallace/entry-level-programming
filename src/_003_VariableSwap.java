public class _003_VariableSwap {
    public static void main(String[] args) {
        int a, b, c;
        a = 5;
        b = 10;

        c = a;
        a = b;
        b = c;

        System.out.println("A nin degeri: " + a);
        System.out.println("B nin degeri : " + b);
    }
}
