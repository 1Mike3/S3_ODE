package E2.Klassenhierarchie;

public class KlassenhierarchieMain {

    // nur zum testen , der richtige stuff in collection
    public static void main(String[] args){
    Kreis kreis = new Kreis(10);
    System.out.println(kreis.info());
    Quadrat quadrat = new Quadrat(10);
    System.out.println(quadrat.info());
    GlDreieck glDreieck = new GlDreieck(10);
    System.out.println(glDreieck.info());
    }
}
