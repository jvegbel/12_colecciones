package ejempoInterfazGenericoOld;

import java.util.Comparator;

public class ComparaNombres implements Comparator<Socio> {

    @Override
    public int compare(Socio ob1, Socio ob2) {
        return ob1.getNombre().compareTo(ob2.getNombre());
    }

}
