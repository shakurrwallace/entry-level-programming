public class _004_CircleArea {
    public static void main(String[] args) {
        java.util.Scanner kb =new java.util.Scanner(System.in);
        double r, pi, area;
        System.out.println("Enter radius : ");
        r = kb.nextDouble();
        pi = 3.14159;
        area = pi * r * r;
        System.out.println("Area of the circle: " + area);

    }
}
