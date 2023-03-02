import java.util.Arrays;
import java.util.Scanner;

public class ExercisesIntermediate {
    public static String numeralWordOfNumber(int number) {
        String[] numeralWords = new String[10];
        numeralWords[0] = "eins";
        numeralWords[1] = "zwei";
        numeralWords[2] = "drei";
        numeralWords[3] = "vier";
        numeralWords[4] = "fünf";
        numeralWords[5] = "sechs";
        numeralWords[6] = "sieben";
        numeralWords[7] = "acht";
        numeralWords[8] = "neun";
        numeralWords[9] = "zehn";
        System.out.println(Arrays.toString(numeralWords));

        return numeralWords[number - 1];
    }

    public static void numbersOneToHundred() {
        int[] numbers = new int[100];
        for (int i = 0; i < 100; i++) {
            numbers[i] = i + 1;

            if (numbers[i] % 3 == 0) {
                System.out.println("#" + numbers[i]);
            } else if (numbers[i] % 5 == 0) {
                System.out.println("$" + numbers[i]);
            } else {
                System.out.println(numbers[i]);
            }
        }
    }

   /* public static String[] storeUserInputInArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many times?");
        int initialInput = scanner.nextInt();

        String[] userInput = new String[initialInput];
        for (int i = 0; i < initialInput; i++) {
            System.out.println("Enter your message " + (i + 1) + ". word");
            userInput[i] = scanner.nextLine();
            System.out.println("Your input = " + userInput[i]);
        }
        System.out.println(Arrays.toString(userInput));
        return userInput;
    }*/
       public static String[] storeUserInputInArray() {
           String[] userInput = new String[3];
           Scanner scanner = new Scanner(System.in);
           for (int i = 0; i < 3; i++) {
               System.out.println("Gib etwas ein: ");
               String input = scanner.nextLine();
               System.out.println("Your input = " + input);
               userInput[i] = input;
           }
           System.out.println(Arrays.toString(userInput));
           return userInput;
       }


      /*  System.out.println("Gib etwas ein: ");
        String input1 = scanner.nextLine();
        System.out.println("First input = " + input1);
        userInput[0] = input1;

        System.out.println("Gib nochmal was ein: ");
        String input2 = scanner.nextLine();
        System.out.println("Second input: " + input2);
        userInput[1] = input2;

        System.out.println("Gib nochmal was ein: ");
        String input3 = scanner.nextLine();
        System.out.println("Second input: " + input3);
        userInput[2] = input3;
        System.out.println("third input:" + input3);*//*
    }*/
}



