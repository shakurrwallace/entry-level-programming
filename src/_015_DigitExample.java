public class _015_DigitExample {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int a, b, c,d;
        System.out.println("A ya deger gir: ");
        a = kb.nextInt();
        b = a / 10;
        System.out.println("onlar basamaginin degeri : " + b);
        c = a % 10;
        System.out.println("birler basamaginin degeri: " + c);
        d = b * b + c * c;
        System.out.println("Basamaklarin karelerinin toplami: " + d);
    }
}
