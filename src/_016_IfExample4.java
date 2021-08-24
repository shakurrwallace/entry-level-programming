import java.sql.SQLOutput;

public class _016_IfExample4 {
    public static void main(String[] args) {


        java.util.Scanner kb = new java.util.Scanner(System.in);
        int a, b, c;
        System.out.println("A değeri gir: ");
        a = kb.nextInt();
        System.out.println("B değeri gir: ");
        b = kb.nextInt();
        System.out.println("C değeri gir: ");
        c = kb.nextInt();

        if (a == b)
            if (b == c)
                 System.out.println("Eşkenardır. ");
            else
                System.out.println("Eşkenar değildir");
        else
            System.out.println("Eşkenar değildir ");


    }



}

