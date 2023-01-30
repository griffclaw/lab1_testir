import java.util.Scanner;
public class Main2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) {
        System.out.print("Введите радиус: ");
        double radius = sc.nextDouble();
        double area = Math.PI * (radius * radius);
        System.out.println("Площадь круга равна: " + area +  " см.кв.");
        double circumference= Math.PI * 2*radius;
        System.out.println("Длины окружности равна: " + circumference +  " см.") ;
    }
}
