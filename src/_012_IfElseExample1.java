public class _012_IfElseExample1 {
    public static void main(String[] args) {
                java.util.Scanner kb = new java.util.Scanner(System.in);
        int a ;
        System.out.println("A degeri giriniz : ");
        a = kb.nextInt();
        if (a % 5 == 0)
            System.out.println("5 in katidir ");
        else
            System.out.println("5 in kati degildir");
    }
}
