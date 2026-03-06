
import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Float pie = 3.14f;
        Scanner sc = new Scanner(System.in);
        System.out.print("Radius: ");
        Float num = sc.nextFloat();
        double area = pie * num * num;
        double peri = 2 * pie * num;
        System.out.println("Area of circle : " + area);
        System.out.println("Perimeter of circle : " + peri);
        sc.close();

    }
}
