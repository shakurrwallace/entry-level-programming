public class _026_IFLetterExample {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int a;
        System.out.println("Notu giriniz: ");
        a = kb.nextInt();
        if (a > 80)
            System.out.println("A");
        else
            if (a > 60)
                System.out.println("B");
            else
                if (a > 40)
                    System.out.println("C");
                else
                    if (a > 20)
                        System.out.println("D");
                    else
                        System.out.println("E");
    }
}
