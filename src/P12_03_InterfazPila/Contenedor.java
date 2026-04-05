package P12_03_InterfazPila;

import java.util.Arrays;

class Contenedor<T extends Comparable<T>> implements Pila<T> {

    private T[] objetos;

    public Contenedor(T[] objetos) {
        this.objetos = objetos;
    }

    void insertarAlFinal(T nuevo) {
        objetos = Arrays.copyOf(objetos, objetos.length + 1);
        objetos[objetos.length - 1] = nuevo;
    }

//    void insertarAlPrincipio(T nuevo) {
//        objetos = Arrays.copyOf(objetos, objetos.length + 1);
//        System.arraycopy(objetos, 0, objetos, 1, objetos.length - 1);
//        objetos[0] = nuevo;
//    }
//    
    
    void insertarAlPrincipio(T nuevo) {
        objetos = Arrays.copyOf(objetos, objetos.length + 1); // Aumento dimensión de la tabla en uno
        for (int i = objetos.length - 1; i > 0; i--) {           // Muevo todos los emementos de la tabla
            objetos[i] = objetos[i - 1];                           // una posición a la derecha
        }
        objetos[0] = nuevo;                                      // Reescribo la primera posición con el valor nuevo
    }
    

   void extraerDelFinal() {
        eliminar(objetos.length);
    }

    
    
//    T extraerDelFinal() {
//        T res = null;
//        if (objetos.length > 0) {
//            res = objetos[objetos.length - 1];
//            objetos = Arrays.copyOf(objetos, objetos.length - 1);
//        }
//        return res;
//    }

    
    // Método eliminar un valor de una posición (Método adaptado de Lista)
    T eliminar(int indice) {
        T eliminado = null;
        if (indice >= 0 && indice < objetos.length) {
            eliminado = objetos[indice];
            for (int i = indice + 1; i < objetos.length; i++) {
                objetos[i - 1] = objetos[i];
            }
            objetos = Arrays.copyOf(objetos, objetos.length - 1);
        }
        return eliminado;
    }
    
    T extraerDelPrincipio() {
      return eliminar(0);
      
    }
    
    
//    T extraerDelPrincipio() {
//        T res = null;
//        if (objetos.length > 0) {
//            res = objetos[0];
//            objetos = Arrays.copyOfRange(objetos, 1, objetos.length);
//        }
//        return res;
//    }
    
    

    void ordenar() {
        Arrays.sort(objetos);
    }


    @Override
    public String toString() {
        return Arrays.deepToString(objetos);
    }

    @Override
    public void apilar(T nuevo) {
        this.insertarAlPrincipio(nuevo);
    }

    @Override
    public T desapilar() {
        return this.extraerDelPrincipio();
    }

    public T[] getObjeto() {
        return objetos;
    }
    
    
    

}
