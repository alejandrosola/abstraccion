package math;
import java.util.Scanner;

public class TestMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese x: ");
        int x = scanner.nextInt();
        System.out.println("Ingrese y: ");
        int y = scanner.nextInt();

        System.out.println("x a la y: " + Math.pow(x, y));
        System.out.println("Max: " + Math.max(x, y));
        System.out.println("Min: " + Math.min(x, y));
        System.out.println("Seno de x: " + Math.sin(x));
        System.out.println("Coseno de y: " + Math.cos(y));
    }
}
