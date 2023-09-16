package E2.KlasseRechteck;

public class WhyNumberNegativeException extends Exception{
    public WhyNumberNegativeException() {
        super("Rectangle no negative lenth or width, ze number wrong");
    }
}
