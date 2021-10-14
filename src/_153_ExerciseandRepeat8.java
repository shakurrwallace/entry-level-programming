/**  dizideki ilk tekten sonraki çift basamaklıları 2 ile çarpan program
 *
 *
 */
public class _153_ExerciseandRepeat8 {
    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int i, size, flag;

        size = a.length;
        flag = 0;
        for (i = 0; i < size; i = i + 1) {
            if (a[i] % 2 == 1)
                flag = 1;
            if (flag == 1)
                if (a[i] >= 10)
                    a[i] = (a[i] * 2);
            System.out.print(a[i] + " ");

        }





    }
}
