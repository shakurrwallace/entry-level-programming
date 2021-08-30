public class _031_ForExample4 {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int a, b, i;
        System.out.println("A değeri giriniz: ");
        a = kb.nextInt();
        System.out.println("B değeri giriniz: ");
        b = kb.nextInt();
        for (i = b ; i < a; i = i + 1 )
            System.out.println(i);


        // a < b farzediliyor ve buna göre girilen sayıların aralarındaki sayıları ekrana yazdıran program.
    }
}
