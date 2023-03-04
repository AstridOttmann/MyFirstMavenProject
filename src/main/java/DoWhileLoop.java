public class DoWhileLoop {


    public static void loopWithDoOnce(String[] args) {
        // wird 1x ausgeführt und dann geprüft, ob Bedingung stimmt
        int i = 0;
        do {
            System.out.println("Hallo");
            i--;
        } while (i > 0);

    }
}
