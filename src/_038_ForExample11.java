/*
*
* n klavyeden girilen pozitif bir tam sayıdır 1den n e kadar olan sayıları toplamını ekrana yazan program
*
*
* */


public class _038_ForExample11 {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int n, i, sum ;
        System.out.println("N değeri gir: ");
        n = kb.nextInt();
        sum = 0;
        for (i = 1; i <= n; i = i + 1)
            sum = sum + i;
        System.out.println(sum);

    }
}
