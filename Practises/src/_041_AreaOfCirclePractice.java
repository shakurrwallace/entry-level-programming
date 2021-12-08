/*
 *  Çember alanını hesaplayan program
 *
 */
package src;

public class _041_AreaOfCirclePractice {
    public static void main(String []args)
    {
        Math.run();
    }
}
class Math {
    public static void run ()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.println("r değeri giriniz: ");
        double r = Integer.parseInt(kb.nextLine());

        double pi = 3.14;

        Util.display(NumberUtil.Calculate(pi, r));
    }
}
class Util
{
    public static void display(double area)
    {
        System.out.println("Dairenin alanı: " + area);
    }
}
class NumberUtil {
    public static double Calculate(double pi, double r)
    {
        return pi * r * r;
    }
}

