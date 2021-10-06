/**   while bir kontrol deyimidir, for gibi döngü deyimidir, syntaxı = while ( döngü devam koşulu)
 *                                                          döngünün gövdesi : döngünün içindeki deyim veya deyim(ler)
 *
 *
 *soru : klavyeden sürekli sayı giriliyor sıfır girilince programın çalışması sonlanıyor
 */
public class _126_WhileDefinitionExample1 {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        int n ;
        System.out.println("N değeri giriniz: ");
        n = kb.nextInt();

        while (n != 0) {
            System.out.println("N değeri giriniz: ");
            n = kb.nextInt();
        }





    }
}
