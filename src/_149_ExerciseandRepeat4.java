/**
 *      2 tane indis numarası üretilecek, 1000 kere değişecek
 *
 *
 */
public class _149_ExerciseandRepeat4 {
    public static void main(String[] args) {
        java.util.Random generator = new java.util.Random();
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int i, size,total, ind1, ind2, temp;
        size = a.length;
        temp= 0;
        total = 1000;

        for (i = 0; i < total; i = i + 1) {
            ind1 = generator.nextInt(size);
            ind2 = generator.nextInt(size);
            temp = a[ind1];
            a[ind1] = a[ind2];
            a[ind2] = temp;
        }

        for (i = 0; i < size; i = i + 1)
            System.out.print(a[i] + " ");

    }
}
