package E2.Klassenhierarchie;
import E2.Klassenhierarchie.Form;

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
        //Das mit der Fäche gerundet ist absicht :) , sonst .tohexstring
        return String.format("Kreis : Radius: %d, Fläche: %.2f, Fläche-HEX: %X , Umfang: %.2f", this.radius, this.flaeche(), ((long) flaeche()), this.umfang());
    }
}
