/*1 ile 100 arasındaki 3ün 4 ün ve 5 in katlarını ekrana iç içe yazdıran program.
*
* */public class _041_ForExample14 {
    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 100; i = i + 1 ) {
            if (i % 3 == 0)
                System.out.print( "  " + i);
                if (i % 4 == 0)
                    System.out.print("  " + i);
                    if (i % 5 == 0)
                        System.out.print( "  " + i);
            
        }
    }
}
