public class _018_IfExample6 {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int x, y, z;
        System.out.println("X değeri giriniz: ");
        x = kb.nextInt();
        if (x <= 0) {
            y = x * x + 2 * x;
            z = 3 * x; }
        else {
            y = x;
            z = x * x + 10; }
        System.out.println("Y nin değeri: "+ y);
        System.out.println("Z nin değeri: "+ z);

    }
}
