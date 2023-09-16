package E2.Klassenhierarchie;

import E2.Klassenhierarchie.Form;

public class Quadrat implements Form {
    private int seite;

    public Quadrat() {
        this.seite = 0;
    }

    public Quadrat(int s) {
        this.seite = s;
    }

    @Override
    public double flaeche() {
        return seite * seite;
    }

    @Override
    public double umfang() {
        return 4 * seite;
    }

    @Override
    public String info() {
        return String.format("Quadrat : Seite: %d, Fläche: %.2f, Fläche-HEX: %X , Umfang: %.2f", this.seite, this.flaeche(), ((long) flaeche()), this.umfang());
    }
}
