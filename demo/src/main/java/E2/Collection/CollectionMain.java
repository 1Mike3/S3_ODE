package E2.Collection;
import E2.Klassenhierarchie.*;

import E2.Klassenhierarchie.GlDreieck;
import E2.Klassenhierarchie.Kreis;
import E2.Klassenhierarchie.Quadrat;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CollectionMain {
    public static void main(String[] args) {
        List<Form> formen = new ArrayList<>();
        formen.add(new Kreis());
        formen.add(new Quadrat());
        formen.add(new GlDreieck(10));
        formen.add(new GlDreieck());
        formen.add(new Kreis(10));
        formen.add(new Quadrat(10));

        formen.sort(Comparator.comparing(Form::flaeche));

        for (Form form : formen) { 
            System.out.println(form.info());
        }

        // Oder mit Entry Zugriff:
        //Ja ich weiß ist schon vorsortiert

        System.out.println("\nMax Fläche mit Lambda: ");                //für null pointer
        formen.stream().max(Comparator.comparingDouble(Form::flaeche)).ifPresent(form -> System.out.println(form.info()));
    }
}
