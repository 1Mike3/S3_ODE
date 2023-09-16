package E2.CompilationProblem;

import static java.lang.System.exit;

public class CompilationProblemMain {
    public static void main(String[] args) {
        int i;
        int j;
        int base = 0;
        String[] numbers = new String[3];
        numbers[0] = "10";
        numbers[1] = "20";
        numbers[2] = "30";

        for (base = 10; base >= 2; --base) {
            try {
                for (j = 0; j <= 3; ++j) {
                    i = Integer.parseInt(numbers[j], base);
                    System.out.println(numbers[j] + " base " + base + " = " + i);
                }
            }
            catch (NumberFormatException e) {
                System.out.println("NumberFormatException: " + e.getMessage());
            } catch (RuntimeException e) {
                System.out.println("RuntimeException: " + e.getMessage());
                System.out.println("Eyyoo ... Something went wrong :) (Mystery Array Stuff)");
                exit(1);
            }
        }
    }
}
