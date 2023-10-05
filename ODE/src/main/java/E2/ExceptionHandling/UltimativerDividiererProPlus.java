package E2.ExceptionHandling;

import java.util.Scanner;

public class UltimativerDividiererProPlus {

    public static int performDivision(int dividend, int divisor)
            throws DivisionByZeroException, NegativeDividendException, DivisionException {
        if (divisor == 0) {
            throw new DivisionByZeroException("Division durch Null ist nicht erlaubt.");
        } else if (dividend < 0 || divisor < 0) {
            throw new NegativeDividendException("Der Dividend oder Divisor ist negativ.", new ArithmeticException());
        }

        try {
            return dividend / divisor;
        } catch (ArithmeticException e) {
            throw new DivisionException("Eine allgemeine DivisionException ist aufgetreten.", e);
        }
    }

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter dividend: ");
        int dividend = scan.nextInt();
        System.out.println("Enter divisor: ");
        int divisor = scan.nextInt();
        try {
            System.out.println("Division:" + String.valueOf(performDivision(dividend, divisor)));
        }
        catch (DivisionByZeroException e){
            System.out.println("DivisionByZeroException: " + e.getMessage());
        }
        catch (NegativeDividendException e){
            System.out.println("NegativeDividendException: " + e.getMessage());
        }
        catch (DivisionException e){
            System.out.println("DivisionException: " + e.getMessage());
        }
        catch (Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
        finally {
            System.out.println("\nI am allways printed :) \n -finally");
        }
    }
}
