package SantasLittleHelper;

public class Helpers {
    public static boolean DEBUG = true;

    public static void print(String message) {
        if (DEBUG) {
            System.out.println(message);
        }
    }
}
