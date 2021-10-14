/**
 *      diziyi 1000 defa karıştırıyoruz dizide kaçının yer değiştirildiğini bakmamız gerekiyor.
 *
 *
 */
public class _150_ExerciseandRepeat5 {
    public static void main(String[] args) {
        java.util.Random generator = new java.util.Random();
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int b[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int i, size,total, ind1, ind2, temp, cnt;
        size = a.length;
        temp= 0;
        total = 1000;

        for (i = 0; i < total; i = i + 1){
            ind1 = generator.nextInt(size);
            ind2 = generator.nextInt(size);
            temp = a[ind1];
            a[ind1] = a[ind2];
            a[ind2] = temp;
        }
        cnt = 0;
        for (i = 0; i <size; i = i + 1){
            if (a[i] != b[i])
                cnt = cnt + 1;
            System.out.println(a[i] + "  " + b[i]);
        }
        System.out.print(cnt + " adet yer değiştirmiş.");


    }
}
