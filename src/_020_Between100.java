public class _020_Between100 {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int n;
        System.out.println("N değeri giriniz: ");
        n = kb.nextInt();
        if (n > 0)
            if (n < 100)
                System.out.println("Arasındadır. ");
            else
                System.out.println("Arasında değildir. ");
        else
            System.out.println("Arasında değildir.");

    }
}
