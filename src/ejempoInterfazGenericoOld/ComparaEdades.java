package ejempoInterfazGenericoOld;

import java.util.Comparator;

public class ComparaEdades implements Comparator<Socio> {

    @Override
    public int compare(Socio ob1, Socio ob2) {
        //return ob1.edad() - ob2.edad();
        return Integer.compare(ob1.edad(), ob2.edad());
    }

}
