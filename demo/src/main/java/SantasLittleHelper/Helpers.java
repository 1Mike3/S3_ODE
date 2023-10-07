package SantasLittleHelper;

public class Helpers {
    public static boolean DEBUG = false;

    public void print(String message) {
        if (DEBUG) {
            System.out.println(message);
        }
    }
}
