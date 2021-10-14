/**
 * b nin her elemanının a dizisinde olup olmadığını ekrana yazdıran program
 *
 */
public class _136_DiziExampleLesson4 {
    public static void main(String[] args) {
        int a[] = {5, 5, 3, 7, 8, 5, 7, 7, 7, 3, 8, 9, 8, 9, 8, 8, 15, 5, 8, 4};
        int b[] = {8, 35, 50, 7, 70};
        int i, k, sizeA,sizeB, flag;

        sizeA = 20;
        sizeB = 5;

        for (k = 0; k < sizeB; k = k + 1) {
            flag = 0;
            for (i = 0; i < sizeA; i = i + 1)
                if (b[k] == a[i])
                    flag = 1;
            if (flag == 1)
                System.out.println("var");
            else
                System.out.println("yok");
        }

    }
}
