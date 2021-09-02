public class _034_ForExample7 {
    public static void main(String[] args) {
        // 30 den küçük tek sayıları ekrana yazdıran program
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int i, n;
        System.out.println("N değeri giriniz: ");
        n = kb.nextInt();
        for (i = 0; i < n; i = i + 2)
            System.out.println(i);


    }
}
