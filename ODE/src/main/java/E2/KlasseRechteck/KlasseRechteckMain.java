package E2.KlasseRechteck;

public class KlasseRechteckMain {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        String eingabeLaenge;
        String eingabeBreite;
        System.out.print("Geben Sie die Länge an: ");
        eingabeLaenge = scan.next();
        System.out.print("Geben Sie die Breite an: ");
        eingabeBreite = scan.next();
        scan.close();
        try {

            if (Integer.parseInt(eingabeLaenge) < 0 || Integer.parseInt(eingabeBreite) < 0) {
                throw new WhyNumberNegativeException();
            }

            double breite = Double.parseDouble(eingabeLaenge);
            double laenge = Double.parseDouble(eingabeBreite);
            double umfang = (laenge + breite) * 2;
            double flaeche = laenge * breite;
            System.out.println("Umfang: " + umfang);
            System.out.println("Fläche: " + flaeche);
        }

        catch (WhyNumberNegativeException e){
            System.out.println("WhyNumberNegativeException: " + e.getMessage());
            System.exit(1);
        }

        catch(NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
            System.out.println("Numbers...");
            System.exit(1);
        }

        catch  (Exception e){
            System.out.println("Exception: " + e.getMessage());
            System.out.println("Mystery Exception goooo");
            System.exit(1);
        }



    }
}
