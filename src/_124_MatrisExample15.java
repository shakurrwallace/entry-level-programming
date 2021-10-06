/**
 * 1 0 0 0 0
 * 2 3 0 0 0
 * 4 5 6 0 0
 * 7 8 9 10 0
 * 11 12 13 14 15
 * çıktısı böyle çıkacak
 *
 */
public class _124_MatrisExample15 {
    public static void main(String[] args) {
    int m[][] = new int[5][5];
        int i, k , row, col, count;

        row = 5;
        col = 5;
        count = 0;
        for (i = 0; i < row; i = i + 1)
            for (k = 0; k <= i; k = k + 1) {
                count = count + 1;
                m[i][k] = count ;
        }
        for (i = 0; i < row; i = i + 1) {
            for (k = 0; k < col; k = k + 1)
                System.out.print(m[i][k] + " ");
            System.out.println();
        }
    }
}
