/**Klavyeden x ve y giriliyor x in y den küçük olduğu kabul ediliyor x den büyük y den küçük dizi elemanlarını ekrana yazdıran program
 *
 *
 */
public class _067_DiziExample20 {
    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int i, x, y, size;
        size = 10;
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("X değeri gir: ");
        x = kb.nextInt();
        System.out.println("Y değeri gir: ");
        y = kb.nextInt();
        for (i = 0; i < size; i = i + 1)
            if (a[i] > x)
                if (a[i] < y)
                    System.out.println(a[i] + " ");


    }
}
