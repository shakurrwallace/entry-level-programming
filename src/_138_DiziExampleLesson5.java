/**
 *
 * a ve b dizisinin birleşimini ekrana yazdıran program
 */
public class _138_DiziExampleLesson5 {
    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int b[] = {8, 13, 6, 12 ,4, 5, 19, 1, 14, 25};
        int i, k, size, flag;

        size = a.length;

        for (i = 0; i < size; i = i + 1)
            System.out.print(a[i] + "  ");

        for (k = 0; k < size; k = k +1) {
            flag = 0;
            for (i = 0; i < size; i = i + 1)
                if (b[k] == a[i])
                    flag = 1;
            if (flag == 0)
                System.out.print(b[k] + "  ");
        }


    }
}
