/** matrisleri iki boyutlu bir dizi olarak düşünebiliriz tablo, bir yapı olarak düşünebiliriz  syntaxı şöyledir : int m [] [] = new int [4] [3];
 *                                                                                                                matrisin adı         satır / sütun sayısı
 *                                                                                                                                      row / column
 *
 *
 *
 *
 */
public class _110_MatrisExample1 {
    public static void main(String[] args) {
        int m[] [] = new int [4] [3];
        int i , k, row, col;
        row = 4;
        col = 3;

        for (i = 0; i < row; i = i + 1)
            for (k = 0; k < col; k = k + 1)
                m[i][k] = 7;

        for (i = 0; i < row; i = i + 1) {
            for (k = 0; k < col; k = k + 1)
                System.out.print(m[i][k] + " ");
            System.out.println();
        }
    }
}
