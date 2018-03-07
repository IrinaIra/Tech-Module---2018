import java.util.Scanner;

public class P05CharacterStats {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String name = console.nextLine();
        int curendHealth = Integer.parseInt(console.nextLine());
        int maximumHealth = Integer.parseInt(console.nextLine());
        int currentEnergy = Integer.parseInt(console.nextLine());
        int maximumEnergy = Integer.parseInt(console.nextLine());

        System.out.printf("Name: %s%nHealth: |%s%s|%nEnergy: |%s%s|", name,
                repeat("|", curendHealth),
                repeat(".", maximumHealth - curendHealth),
                repeat("|", currentEnergy),
                repeat(".", maximumEnergy - currentEnergy));

    }
    static String repeat(String text, int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result += text;
        }
        return result;
    }
}
