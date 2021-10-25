/***
 *  bilgisayara 360.000 defa çift zar attırıyoruz kaç defa 6 6 gelmiştir
 *
 *
 */
public class _154_GeneratorExample1 {
    public static void main(String[] args) {
    java.util.Random generator = new java.util.Random();
    int i, dice, dice2, total, cnt;

    total = 360_000;
    cnt = 0;
    for(i = 1; i <= total; i = i +1 ){
        dice = generator.nextInt(6) + 1;
        dice2 = generator.nextInt(6) + 1;
        if (dice * dice2 == 36)
            cnt = cnt + 1;
        System.out.println("6 - 6 gelme olasılığı " + cnt );


    }
    }
}
