package set;

import java.io.*;
import java.util.*;


public class P12_24_SocioComparadores {

    public static void main(String[] args) {
        Set<Socio> socios = new TreeSet<>();
        try ( ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("socios.dat"))) {
            socios = (TreeSet<Socio>) in.readObject();
        } catch (IOException ex) {
            System.out.println("Lista de socios vacía");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
        int opcion;
        do {
            System.out.println("1.Alta");
            System.out.println("2.Baja");
            System.out.println("3.Modificación");
            System.out.println("4.Listado por nombre");
            System.out.println("5.Listado por antigüedad");
            System.out.println("6.Salir");
            System.out.print("\nIntroducir opción: ");
            opcion = new Scanner(System.in).nextInt();
            switch (opcion) {
                case 1 -> {
                    if (!alta(socios)) {
                        System.out.println("El socio ya existe");
                    }
                    System.out.println(socios);
                    
                }
                case 2 -> {
                    System.out.print("dni socio: ");
                    String dni = new Scanner(System.in).next();
                    if (socios.remove(new Socio(dni))) {
                        System.out.println("El socio con dni " + dni + " ha sido eliminado");
                    } else {
                        System.out.println("No existe ningún socio con dni:" + dni);
                    }
                    
                }
                case 3 -> {
                    System.out.print("dni: ");
                    String dni = new Scanner(System.in).next();
                    socios.remove(new Socio(dni));
                    alta(socios);
                }
                case 4 -> {
//                    Comparator<Socio> comparaNombres=new Comparator<>() {
//                        @Override
//                        public int compare(Socio o1, Socio o2) {
//                            return o1.nombre.compareTo(o2.nombre);
//                        }
//                    };
                    Comparator<Socio> comparaNombres = (Socio s1, Socio s2) -> s1.nombre.compareTo(s2.nombre);   
                    Set<Socio> sociosPorNombre = new TreeSet<>(comparaNombres);
                    sociosPorNombre.addAll(socios);
                    System.out.println(sociosPorNombre);
                }
                case 5 -> {
//                    Comparator<Socio> c = new Comparator<>() {
//                        @Override
//                        public int compare(Socio o1, Socio o2) {
//                            return o2.alta - o1.alta;
//                        }
//                    };
                    Comparator<Socio> comparaAntiguedad = (Socio s1, Socio s2) -> Integer.compare(s1.alta, s2.alta);   
                    Set<Socio> sociosPorAntiguedad = new TreeSet<>(comparaAntiguedad);
                    sociosPorAntiguedad.addAll(socios);
                    System.out.println(sociosPorAntiguedad);
                }
            }
        } while (opcion != 6);
        try ( ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("socios.dat"))) {
            out.writeObject(socios);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    static boolean alta(Set<Socio> socios) {
        System.out.print("dni: ");
        String dni = new Scanner(System.in).next();
        System.out.print("nombre: ");
        String nombre = new Scanner(System.in).next();
        System.out.print("fecha de alta (YYYYMMDD): ");
        int alta = new Scanner(System.in).nextInt();
        Socio nuevo = new Socio(dni, nombre, alta);
        return socios.add(nuevo);
    }

}
