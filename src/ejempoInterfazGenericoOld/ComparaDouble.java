package ejempoInterfazGenericoOld;

import java.util.Comparator;

public class ComparaDouble implements Comparator<Socio> {

    @Override
    public int compare(Socio ob1, Socio ob2) {
        return Double.compare(ob1.edad(), ob2.edad());
    }

}
