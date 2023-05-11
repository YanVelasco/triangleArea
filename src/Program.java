import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner entry = new Scanner(System.in);
        Triangle triangle = new Triangle();
        System.out.println("Enter rectangle whidth and height:");
        triangle.width = entry.nextDouble();
        triangle.height = entry.nextDouble();
        System.out.println(triangle);

        entry.close();
    }
}
