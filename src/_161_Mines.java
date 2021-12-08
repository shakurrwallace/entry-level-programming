public class _161_Mines {
    public static void main(String[] args) {
    int pcBoard[][] = {{9, 9, 9, 9, 9, 9, 9, 9, 9, 9},
            {9, 9, 9, 9, 9, 9, 9, 9, 9, 9},
            {9, 9, 9, 9, 9, 9, 9, 9, 9, 9},
            {9, 9, 9, 9, 9, 9, 9, 9, 9, 9},
            {9, 9, 9, 9, 9, 9, 9, 9, 9, 9},
            {9, 9, 9, 9, 9, 9, 9, 9, 9, 9},
            {9, 9, 9, 9, 9, 9, 9, 9, 9, 9},
            {9, 9, 9, 9, 9, 9, 9, 9, 9, 9},
            {9, 9, 9, 9, 9, 9, 9, 9, 9, 9},
            {9, 9, 9, 9, 9, 9, 9, 9, 9, 9}};

    int plBoard[][] = {{9, 9, 9, 9, 9, 9, 9, 9, 9, 9},
            {9, 9, 9, 9, 9, 9, 9, 9, 9, 9},
            {9, 9, 9, 9, 9, 9, 9, 9, 9, 9},
            {9, 9, 9, 9, 9, 9, 9, 9, 9, 9},
            {9, 9, 9, 9, 9, 9, 9, 9, 9, 9},
            {9, 9, 9, 9, 9, 9, 9, 9, 9, 9},
            {9, 9, 9, 9, 9, 9, 9, 9, 9, 9},
            {9, 9, 9, 9, 9, 9, 9, 9, 9, 9},
            {9, 9, 9, 9, 9, 9, 9, 9, 9, 9},
            {9, 9, 9, 9, 9, 9, 9, 9, 9, 9}};

    java.util.Random generator = new java.util.Random();
    java.util.Scanner kb = new java.util.Scanner(System.in);
    int i, k, row, col, count, isGameOver, r, c;

    row = 10;
    col = 10;

    //Mayınlar yerleştiriliyor
    count = 0;
    while (count != 25) {
        r = generator.nextInt(row);
        c = generator.nextInt(col);
        if (pcBoard[r][c] != -1) {
            pcBoard[r][c] = -1;
            count = count + 1;
        }
    }

    for (i = 0; i < row; i = i + 1) {
        for (k = 0; k < col; k = k + 1) {
            if (pcBoard[i][k] != -1)
                System.out.print(" ");
            System.out.print(pcBoard[i][k] + " ");
        }
        System.out.println();
    }

    //Komşu mayınlar sayılıyor
    for (i = 0; i < row; i = i + 1)
        for (k = 0; k < col; k = k + 1)
            if (pcBoard[i][k] == 9) {
                count = 0;
                for (r = i - 1; r <= i + 1; r = r + 1)
                    for (c = k - 1; c <= k + 1; c = c + 1)
                        if (r >= 0)
                            if (r < row)
                                if (c >= 0)
                                    if (c < col)
                                        if (pcBoard[r][c] == -1)
                                            count = count + 1;

                pcBoard[i][k] = count;
            }


    //Oyun oynanıyor
    count = 0;
    isGameOver = 0;
    while (isGameOver == 0) {
        count = count + 1;
        System.out.print("Satırı giriniz : ");
        r = kb.nextInt();
        System.out.print("Sütunu giriniz : ");
        c = kb.nextInt();

        plBoard[r][c] = pcBoard[r][c];

        if (pcBoard[r][c] == -1) {
            isGameOver = 1;
            System.out.println("Mayına bastınız...");
        }
        else if (count == 75) {
            isGameOver = 1;
            System.out.println("Tebrikler...");
        }

        for (i = 0; i < row; i = i + 1) {
            for (k = 0; k < col; k = k + 1) {
                if (pcBoard[i][k] != -1)
                    System.out.print(" ");
                System.out.print(pcBoard[i][k] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (i = 0; i < row; i = i + 1) {
            for (k = 0; k < col; k = k + 1) {
                if (plBoard[i][k] != -1)
                    System.out.print(" ");
                System.out.print(plBoard[i][k] + " ");
            }
            System.out.println();
        }
    }
}
}



