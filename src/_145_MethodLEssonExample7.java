/** 1 milyon defa yazı tura attıran program
 *
 *
 *
 */

public class _145_MethodLEssonExample7 {
    public static void main(String[] args) {
        java.util.Random generator = new java.util.Random();
        int n, i, size, cntHeads, cntTails;
        size = 100000;
        cntHeads = 0;
        cntTails = 0;
        for (i = 1; i < size; i = i + 1) {
            n = generator.nextInt(2);
            if ( n == 1)
                cntHeads = cntHeads + 1;
            else
                cntTails = cntTails + 1;
        }
        System.out.println("Yazı : " + cntHeads);
        System.out.println("Tura  : " + cntTails);


    }
}
