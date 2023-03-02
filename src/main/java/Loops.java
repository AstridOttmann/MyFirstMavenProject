public class Loops {

    public static void main(String[] args) {
        int i = 0;

        int[] numbers = new int[100];

        while (i < 100) {
            numbers[i] = i + 1;
            //System.out.println(numbers[i]);
            i++;
        }

        System.out.println(faculty(4));
        System.out.println(facultyWithWhile(3));
        ExercisesNovice.printName("Astrid");
        System.out.println(ExercisesNovice.checkNumberBiggerThanZero(-23));
        System.out.println(ExercisesNovice.squareProduct(3));
        //ExercisesNovice.personalGreeting();
        System.out.println(ExercisesIntermediate.numeralWordOfNumber(3));
        ExercisesIntermediate.numbersOneToHundred();
        ExercisesIntermediate.storeUserInputInArray();

    }

    public static int faculty(int a) {
        int result = 1;

        for (int i = 1; i <= a; i++) {
            result = result * i;
        }
        return result;
    }

    public static int facultyWithWhile(int a) {
        int i = 1;
        int result = 1;

        while (i <= a) {
            result = result * i;
            i++;
        }
        return result;
    }
}
