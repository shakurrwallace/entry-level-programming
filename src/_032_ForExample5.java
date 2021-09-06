public class _032_ForExample5 {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int a, b, i;

        System.out.println("A değeri giriniz: ");
        a = kb.nextInt();
        System.out.println("B değeri giriniz: ");
        b = kb.nextInt();
            if ( a < b )
                for (i = a; i <= b; i = i + 1)
                System.out.println(i);
            else
                for (i = a; i >= b; i = i - 1)
                    System.out.println(i);
            // A ve B büyüklük ilişkisi her olasılığı sayan a dan b ye kadar olan sayıları ekrana yazdıran program.

    }
}
