package app;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Програма для конвертації фаренгейтів в цельсії, цельсіїв в фаренгейти");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Конвертація фаренгейтів в цельсії");
        System.out.println(" Введіть температуру в фарангейтах: ");
        double fa = scanner.nextDouble();
        double ce;
        ce = (fa -32 ) / 1.8;
        System.out.println(ce);

        System.out.println("Конвертація цельсіїв в фаренгейти");
        System.out.println("Введіть температуру в цельсіях:" );
        ce = scanner.nextDouble();
        fa= ce* 1.8 +32;
        System.out.println(fa);
        }
}