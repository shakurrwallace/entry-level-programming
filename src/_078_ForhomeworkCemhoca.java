/** 2009 sayısından 40 bulan program
 *
 *
 */
public class _078_ForhomeworkCemhoca {
    public static void main(String[] args) {
        int i, n, n2, sum, sum2, size, bahceli;
        size = 10;
        n = 2009;
        n = n  % size;
        n2= 2009;
        System.out.println("Birler basamağı değeri: " + n);
        n2 = n2 / 1000;
        System.out.println("Binler basamağı değeri: " + n2);
        sum = n + n2;
        System.out.println("2 ile 9 u toplarsan: " + sum );
        sum2 = n2 * size + n;
        System.out.println("Yan yana yazarsan: " + sum2);
        bahceli = sum + sum2;
        System.out.println(bahceli + " yaparrrr");





    }
}
