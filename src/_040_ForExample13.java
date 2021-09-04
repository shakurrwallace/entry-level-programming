/* Klavyeden a ve b giriliyor, a b den küçük a ile b nin arasındaki 5in katlarını ekrana iç içe yazdıran program.
*
*not: a ya 4 değeri verilince işlemi sor!!
* */public class _040_ForExample13 {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int a, b, i;
        System.out.println("A değeri giriniz: ");
        a = kb.nextInt();
        System.out.println("B değeri giriniz: ");
        b = kb.nextInt();
        for (i = a + (5 - a % 5); i < b; i = i + 5)
        System.out.println(i);
    }
}
