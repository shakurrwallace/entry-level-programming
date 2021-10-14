/**
 *         Dİzideki ilk tekten sonraki tek basamaklıları 3 ile çarpan program
 *
 *
 */
public class _132_WhileDiziExampleLesson {
    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int i, size, flag;

        size = 10;
        flag = 0;

        for (i = 0; i < size; i = i + 1 ) {
            if (a[i] % 2 != 0)
                flag = 1;
            if (flag == 1)
                if (a[i] < 10)
                    System.out.println(a[i] * 3 + " ");
        }




    }
}
