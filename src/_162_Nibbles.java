public class _162_Nibbles {
    public static void main(String args[])
    {
        int board[][] = {{1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 9},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};

        java.util.Scanner kb = new java.util.Scanner(System.in);
        int rowH, colH, rowHT, colHT, rowE, colE;
        int i, k, row, col, flag, direction;

        row = 10;
        col = 10;

        rowH = 0;   //Bulundugumuz satır
        colH = 0;   //Bulundugumuz sütun
        rowE = 7;   //Çıkış satırı
        colE = 9;   //Çıkış sütunu


        //Matris yazdırılıyor
        for (i = 0; i < row; i = i + 1) {
            for (k = 0; k < col; k = k + 1)
                System.out.print(board[i][k] + " ");
            System.out.println();
        }

        flag = 0;
        while (flag == 0) {
            System.out.print("Yönü giriniz : ");
            direction = kb.nextInt();

            //Konum bilgisi yedekleniyor
            rowHT = rowH;
            colHT = colH;

            //Gidilecek yer hesaplanıyor
            if (direction == 1)
                rowHT = rowHT - 1;
            else if (direction == 2)
                colHT = colHT + 1;
            else if (direction == 3)
                rowHT = rowHT + 1;
            else if (direction == 4)
                colHT = colHT - 1;

            //Eğer gidilecek yer oyun alanının içinde ise
            //hareket ediliyor. Yoksa hicbir islem yapılmıyor.
            if (rowHT >= 0)
                if (rowHT < row)
                    if (colHT >= 0)
                        if (colHT < col) {
                            board[rowH][colH] = 0;
                            rowH = rowHT;
                            colH = colHT;
                            board[rowH][colH] = 1;
                        }


            System.out.println();

            //Matris yazdırılıyor
            for (i = 0; i < row; i = i + 1) {
                for (k = 0; k < col; k = k + 1)
                    System.out.print(board[i][k] + " ");
                System.out.println();
            }

            //Çıkış noktasına ulaşıldı mı?
            if (rowH == rowE)
                if (colH == colE) {
                    flag = 1;
                    System.out.println();
                    System.out.println("Gezi Bitti...");
                }
        }
    }
}


