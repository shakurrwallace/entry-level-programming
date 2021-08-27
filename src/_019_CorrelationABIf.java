public class _019_CorrelationABIf {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int a, b ;

        System.out.println("A değeri giriniz: ");
        a = kb.nextInt();
        System.out.println("B değeri giriniz: ");
        b = kb.nextInt();

        if   (a > b)
            System.out.println("A > b ");
        else    
        if   (a == b)
            System.out.println("a = b ");
        else    
            System.out.println("a < b ");


    }
}
