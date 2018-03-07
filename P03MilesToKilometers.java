import java.util.Scanner;

public class P03MilesToKilometers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double mile = Double.parseDouble(console.nextLine());

        double km = mile * 1.60934;
        System.out.printf("%.2f", km);
    }
}
