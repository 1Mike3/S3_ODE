package interfaceform;

public class Kreis implements Form {
    private int radius;

    public Kreis() {
        this.radius = 0;
    }

    public Kreis(int r) {
        this.radius = r;
    }

    @Override
    public double flaeche() {
        return Math.PI * radius * radius;
    }

    @Override
    public double umfang() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String info() {
        return "Kreis mit Radius: " + radius;
    }
}
