public class _075_DiziExample28v2 {
    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};

        int n, size;

        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.print("n :");
        n = kb.nextInt();

        size = a.length;

        for (int i = n - 1; i >= 0; i--)
            a[i + size - n] = a[i];

        for (int i = 0; i < size - n; i++) {
            a[i] = 0;
        }

        for (int i = 0; i < size; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }
}
