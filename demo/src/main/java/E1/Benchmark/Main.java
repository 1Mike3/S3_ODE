
package E1.Benchmark;

public class Main {

    public static void main(String[] args) {
        //startzeit in Millisekunden abfragen
        long startZeit = System.currentTimeMillis();

        //1 million Punkte auf die Konsole schreiben
        int zaehler = 0;
        while (zaehler < 1000000) {
            System.out.print(".");
            zaehler++;
        }

        //endzeit in Millisekunden abfragen
        long endZeit = System.currentTimeMillis();

        //differenz berechnen und ausgeben
        long benoetigteZeit = endZeit - startZeit;
        float benoetigteSekunden = (float)benoetigteZeit / 1000;
        float benoetigteMinuten = benoetigteSekunden / 60;

        System.out.println("\n Benötigte Zeit: \n");
        System.out.println(benoetigteMinuten + " Minuten\n" );
        System.out.println(benoetigteSekunden + " Sekunden\n" );
        System.out.println(benoetigteZeit + " Millisekunden\n" );
    }
}
