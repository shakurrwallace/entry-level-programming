/**
 *
 *        1 2 3
 *        1 2 3
 *        1 2 3
 *        1 2 3             satır satır erişilecek, cnt kullanılacak.
 *
 */
public class _113_MatrisExample4 {
    public static void main(String[] args) {
        int m[][] = new int [4][3];
        int i , k, row, col, cnt ;
        row = 4;
        col = 3;

         for ( i = 0; i < row; i = i +1) {
             cnt = 0;
             for (k = 0; k < col; k = k + 1) {
                 cnt = cnt + 1;
                 m[i][k] = cnt;
             }
         }
        for (i = 0; i < row; i = i + 1) {
            for (k = 0; k < col; k = k + 1)
                System.out.print(m[i][k] + " ");
            System.out.println();
        }

    }
}
