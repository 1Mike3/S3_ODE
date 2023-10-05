package E2.Klassenhierarchie;

import E2.Klassenhierarchie.Form;

public class GlDreieck implements Form {
    private int seite;

    public GlDreieck() {
        this.seite = 0;
    }

    public GlDreieck(int s) {
        this.seite = s;
    }

    @Override
    public double flaeche() {
        return (Math.sqrt(3) / 4) * seite * seite;
    }

    @Override
    public double umfang() {
        return 3 * seite;
    }

    @Override
    public String info() {
        return String.format("GI Dreieck: Seite: %d, Fläche: %.2f, Fläche-HEX: %X , Umfang: %.2f", this.seite, this.flaeche(), ((long) flaeche()), this.umfang());
    }
}
