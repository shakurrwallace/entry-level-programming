public class _017_IfExample5 {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int a, b, c;
        System.out.println("A değeri gir: ");
        a = kb.nextInt();
        System.out.println("B değeri gir: ");
        b = kb.nextInt();
        System.out.println("C değeri gir: ");
        c = kb.nextInt();

        if  (a == b)
            if  (a != c)
                System.out.println("İkizkenardır. ");
            else
                System.out.println("Değildir. ");
        else
            if (a == c)
                System.out.println("İkizkenardır. ");
            else
                if (b == c)
                    System.out.println("İkizkenardır");
                else
                    System.out.println("İkizkenar değildir.");


    }
}
