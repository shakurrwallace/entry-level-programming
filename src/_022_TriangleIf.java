public class _022_TriangleIf {
    public static void main(String[] args) {


    java.util.Scanner kb = new java.util.Scanner(System.in);
    int a, b, c;
        System.out.println("A değeri giriniz: ");

        a = kb.nextInt();
        System.out.println("B değeri giriniz: ");
        b = kb.nextInt();
        System.out.println("C değeri giriniz: ");
        c = kb.nextInt();
        if (a + b > c)
            if (a + c > b)
                if (b + c > a)
                    System.out.println("Üçgendir. ");
                else
                    System.out.println("Üçgen değildir. ");
            else
                System.out.println("Üçgen değildir. ");
        else
        System.out.println("Üçgen değildir. ");


    }
}
