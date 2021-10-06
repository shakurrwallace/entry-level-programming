/**
 *  ödev 1 =klavyeden sürekli sayı giriliyor ve bu sayılar toplanıyor toplam 1000 i geçince son toplam ekrana yazdırılıyor ve programın çalışması sonlanıyor
 *  ödev 2 = klavyeden girilen sayıyı basamaklarına ayıran program.ex : 7235  == 5 3 2 7sırasıyla yazılacak
 */
public class _127_While {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int n, sum;
        sum = 0;
        System.out.println("N değeri giriniz: ");
        n = kb.nextInt();
        while (n <= 1000)

        System.out.println("toplam : " + sum);




    }
}
