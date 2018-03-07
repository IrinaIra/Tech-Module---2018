import java.util.Scanner;

public class P02RectangleArea {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double height = Double.parseDouble(console.nextLine());
        double weight = Double.parseDouble(console.nextLine());

        double area = height * weight;
        System.out.printf("%.2f", area);
    }
}
