public class _014_IfElseExample3 {
    public static void main(String[] args) {
        boolean kosul1 = true;
        boolean kosul2 = false;
        boolean kosul3 = true;
        boolean kosul4 = true;


        if (kosul1) {
            if (kosul2) {
                System.out.println("Deyim A");
            } else {
                System.out.println("Deyim B");
                System.out.println("Deyim C");
            }

            if (kosul3)
                System.out.println("Deyim D");
            else
                ;

            System.out.println("Deyim E");
        } else {
            if (kosul3)
                System.out.println("Deyim F");
            System.out.println("Deyim G");

            if (kosul4)
                ;
            else {
                System.out.println("Deyim H");
                System.out.println("Deyim I");
            }

        }
    }
}

/*

1-

        boolean kosul1 = true;
        boolean kosul2 = true;
        boolean kosul3 = true;
        boolean kosul4 = false;

oldugunda sonuc ne cikar?



2-

boolean degerlerini oyle bir duzenleyinki ciktisi

B
C t f t t
D
E

3-

A
B
C    hayir
D
E

ciktisinin cikmasi mümkun mu?

4-

boolean degerlerini oyle bir duzenleyinki ciktisi

G --- f f f t

5-

boolean degerlerini oyle bir duzenleyinki ciktisi

F f
G t
H t
I f

    }
}

*/