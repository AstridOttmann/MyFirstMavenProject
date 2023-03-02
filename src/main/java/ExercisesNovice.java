import java.util.Scanner;

public class ExercisesNovice {

    public static void printName(String name) {
        for (int i = 0; i < 5; i++) {
            System.out.println(name);
        }
    }

    public static boolean checkNumberBiggerThanZero(int number) {
        return number > 0;
    }

    public static int squareProduct(int x) {
        return (int) Math.pow(x, 2);
    }

    public static void personalGreeting() {
        // scanner: read input in console
        Scanner scanner = new Scanner(System.in);

        System.out.println("Gib deinen Namen ein: ");
        String input1 = scanner.nextLine();
        System.out.println("Hello " + input1 + ". Welcome!");

        System.out.println("Gib deine Message ein: ");
        String input2 = scanner.nextLine();

        System.out.println("Your name: " + input1 + ", your message: " + input2);
    }
}
