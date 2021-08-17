public class _013_IfElseExample2 {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int a ;
        System.out.println("A degeri giriniz: ");
        a = kb.nextInt();

        if (a % 2 == 0)
            System.out.println("A cift sayidir");
        else
            System.out.println("A tek sayidir");
    }
}
