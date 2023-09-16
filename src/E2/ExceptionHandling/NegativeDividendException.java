package E2.ExceptionHandling;

public class NegativeDividendException extends Exception {
    public NegativeDividendException(String message, Throwable cause) {
    super(message, cause);
    }
}
