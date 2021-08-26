public class _024_ExampleABIf {
    public static void main(String[] args) {

        java.util.Scanner kb = new java.util.Scanner(System.in);
        int a, b;
        System.out.println("A değeri giriniz: ");
        a = kb.nextInt();
        System.out.println("B değeri giriniz: ");
        b = kb.nextInt();
        if ( a > b )
            System.out.println("A B den büyüktür. ");
        else
            if (a < b)
                System.out.println("B A dan büyüktür. ");
            else
                System.out.println("A ve B birbirine eşittir. ");





    }


}
