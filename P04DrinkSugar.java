import java.text.DecimalFormat;
import java.util.Scanner;

public class P04DrinkSugar {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        double volume = Double.parseDouble(console.nextLine());
        double kcal = Double.parseDouble(console.nextLine());
        double sugar = Double.parseDouble(console.nextLine());

        double curentKcal = kcal * (volume / 100);
        double curentSugar = sugar * (volume / 100);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.printf("%sml %s:%n%skcal, %sg sugars",
                df.format(volume),
                name,
                df.format(curentKcal),
                df.format(curentSugar)
        );
    }

}
