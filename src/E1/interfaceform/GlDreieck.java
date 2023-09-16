package E1.interfaceform;

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
        return "Gleichseitiges Dreieck mit Seite: " + seite;
    }
}
