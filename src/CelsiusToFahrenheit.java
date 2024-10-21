import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Температура в градусах Цельсия: ");
        int celsius = in.nextInt();
        float fahrenheit = (celsius * 9 / 5) + 32;
        System.out.printf("celsius = %d\n", celsius);
        System.out.printf("fahrenheit = %f\n", fahrenheit);
    }
}
