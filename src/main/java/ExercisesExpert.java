import java.util.Arrays;

public class ExercisesExpert {
    public static String reverseString(String toReverse) {
        String reversed = new StringBuilder(toReverse).reverse().toString();
        return reversed;
    }

    public static int[] sortedArray(int[] numbers) {
        Arrays.sort(numbers);
        return numbers;
    }

    public static String[] stringWordsAsArray(String s) {
        //return new String[]{Arrays.toString(s.split(",", 0))};
        return s.split(" ", 0);
    }

    public static int calculateSquareSum(int a){
        if(a == 0) return 0;
        if (a <= 9) return a;

        return a%10 + calculateSquareSum(a/10);
    }
   /* public static char[] convertNumberToRomanNumber(int a){

    }*/
}
