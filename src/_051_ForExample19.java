/**0 ile 100 arasında 3 ün 6 nın 9 ın katlarını ard arda yazdıran program
  *
 *
 *
 */
public class _051_ForExample19 {
    public static void main(String[] args) {
        int i;

        for (i = 0; i <= 100; i = i + 3) {
            if ( i % 3 == 0)
                System.out.println("3, 6,9 katları: " + i);
            if (i % 6 == 0)
                System.out.println("3, 6,9 katları: " + i);
            if (i % 9 == 0)
                System.out.println("3, 6,9 katları: " + i);


        }


    }
}
