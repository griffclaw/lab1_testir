import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Дмитренко Алина");
        System.out.println (difference(23,56));
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите первое число ");
        int value1 = scn.nextInt();
        System.out.print("Введите второе число ");
        int value2 = scn.nextInt();
        System.out.print("Введите третье число ");
        int value3 = scn.nextInt();
        System.out.println("Сумма чисел = "+sum(value1,value2,value3));

        //Расчет площади круга и длины его окружности
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите радиус: ");
        double radius = sc.nextDouble();
        double area = Math.PI * (radius * radius);
        System.out.println("Площадь круга равна: " + area +  " см.кв.");
        double circumference= Math.PI * 2*radius;
        System.out.println("Длины окружности равна: " + circumference +  " см.");
    }
    public static int difference(int a, int b) {
        return a-b;
    }

    public static int sum(int value1, int value2, int value3) {
        int all = value1 + value2 +value3;
        return all;
    }

}
