/*                                 Dikdörtgenin alanını hesaplayan program.
 *
 *  
 */
package src;
public class _042_AreaOfRectangle {
    public static void main(String []args)
    {
        Geometry.run();
    }
}
class Geometry {
    public static void run ()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.println("A yatay kenarı giriniz");
        int a = Integer.parseInt(kb.nextLine());
        System.out.println("A dikey kenarı giriniz: ");
        int ad = Integer.parseInt(kb.nextLine());

        System.out.println("B yatay kenarı giriniz");
        int b = Integer.parseInt(kb.nextLine());
        System.out.println("B dikey kenarı giriniz: ");
        int bd = Integer.parseInt(kb.nextLine());

        Geometry.display(Geometry.calculate(a,ad,b,bd));

    }
    public static void display (int a) {
        System.out.println("Dikdörtgenin alanı: " + a);
    }
    public static int calculate (int a, int ad, int b, int bd)
    {
        return a + ad + b + bd;
    }

}


