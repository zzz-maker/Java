public class MethodTest2 {
    public static void main(String[] args) {
        System.out.println(getZhouchang(5, 4));
        System.out.println(getArea(5, 4));
        System.out.println(getArea(5, 4, 3));
    }

    static double getZhouchang(double w, double h) {
        return 2 * (w + h);
    }

    static double getArea(double w, double h) {
        return w * h;
    }

    static double getArea(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double area = p * (p - a) * (p - b) * (p - c);
        return area;
    }
}
