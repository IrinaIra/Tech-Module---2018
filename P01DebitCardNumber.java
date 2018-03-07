import java.util.Scanner;

public class P01DebitCardNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int first = Integer.parseInt(console.nextLine());
        int second = Integer.parseInt(console.nextLine());
        int third = Integer.parseInt(console.nextLine());
        int fourth = Integer.parseInt(console.nextLine());

        System.out.printf("%04d %04d %04d %04d", first, second, third, fourth);
    }
}
