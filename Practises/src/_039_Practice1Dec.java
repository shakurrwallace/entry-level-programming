/*
 *  klavyeden girilen sayının mutlak değerini alan program
 *
 */
package src;
public class _039_Practice1Dec {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int n;

        System.out.println("N değeri giriniz: ");
        n = kb.nextInt();

        if (n < 0)
            n = n * -1;

        System.out.println("Mutlak değeri : " + n);



    }

}
