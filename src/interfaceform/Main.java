package interfaceform;

public class Main {
    public static void main(String[] args) {
        Form[] formen = {
                new Kreis(5),
                new Kreis(10),
                new Quadrat(4),
                new Quadrat(8),
                new GlDreieck(6),
                new GlDreieck(12)
        };

        for (Form form : formen) {
            System.out.println(form.info());
            System.out.println("Fläche: " + form.flaeche());
            System.out.println("Umfang: " + form.umfang());
        }
    }
}
