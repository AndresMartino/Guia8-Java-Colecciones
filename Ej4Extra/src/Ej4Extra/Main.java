package Ej4Extra;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        HashMap<Integer, String> ciudades = new HashMap();
        int codigo, opc;
        String nombreCiudad;
        boolean band;
        for (int i = 0; i < 2; i++) {
            System.out.println("ingrese nombre de la ciudad");
            nombreCiudad = read.next();
            System.out.println("Ingrese el codigo postal de " + nombreCiudad);
            codigo = read.nextInt();
            ciudades.put(codigo, nombreCiudad);
        }

        do {
            System.out.println("---menu---");
            System.out.println("1-Buscar ciudad por su codigo postal");
            System.out.println("2-Mostrar ciudades");
            System.out.println("3-Agregar ciudad");
            System.out.println("4-Eliminar ciudad");
            System.out.println("5-Salir");
            opc = read.nextInt();
            switch (opc) {
                case 1:
                    band = false;
                    System.out.println("Ingrese codigo postal a buscar");
                    codigo = read.nextInt();
                    for (Map.Entry<Integer, String> entry : ciudades.entrySet()) {
                        if (entry.getKey() == codigo) {
                            System.out.println("Codigo postal: " + entry.getKey() + " Ciudad: " + entry.getValue());
                            band = true;
                        }

                    }
                    if (band) {
                        System.out.println("ciudad encontrada");
                    } else {
                        System.out.println("Ciudad no encontrada");
                    }
                    break;
                case 2:
                    System.out.println("Mostrando ciudades y sus codigos");
                    for (Map.Entry<Integer, String> entry : ciudades.entrySet()) {
                        System.out.println("Codigo postal: " + entry.getKey() + " Ciudad: " + entry.getValue());
                    }
                    break;
                case 3:
                    System.out.println("ingrese nombre de la ciudad");
                    nombreCiudad = read.next();
                    System.out.println("Ingrese el codigo postal de " + nombreCiudad);
                    codigo = read.nextInt();
                    ciudades.put(codigo, nombreCiudad);
                    break;
                case 4:
                    band = false;
                    System.out.println("Ingrese codigo postal para eliminar ciudad");
                    codigo = read.nextInt();
                    Iterator<Entry<Integer, String>> iterator = ciudades.entrySet().iterator();
                    while (iterator.hasNext()) {
                        Entry<Integer, String> entry = iterator.next();
                        if (entry.getKey().equals(codigo)) {
                            iterator.remove();
                            band = true;
                        }
                    }
                    if (!band) {
                        System.out.println("Ciudad no encontrada");
                    } else {
                        System.out.println("Ciudad eliminada con exito!");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo!");
                    break;
                default:
                    System.out.println("Ingrese opcion correcta");
            }
        } while (opc != 5);

        System.out.println("Mostrando ciudades y sus codigos");
        for (Map.Entry<Integer, String> entry : ciudades.entrySet()) {
            System.out.println("Codigo postal: " + entry.getKey() + " Ciudad: " + entry.getValue());
        }
    }

}
/*Almacena en un HashMap los códigos postales de 10 ciudades a elección de esta
página: https://mapanet.eu/index.htm. Nota: Poner el código postal sin la letra, solo el
numero.
• Pedirle al usuario que ingrese 10 códigos postales y sus ciudades.
• Muestra por pantalla los datos introducidos
• Pide un código postal y muestra la ciudad asociada si existe sino avisa al usuario.
• Muestra por pantalla los datos
• Agregar una ciudad con su código postal correspondiente más al HashMap.
• Elimina 3 ciudades existentes dentro del HashMap, que pida el usuario.
• Muestra por pantalla los datos*/

 /*codigos de muestra
1-El Alcazar =3390
2-Los teales=3340
3-Cataratas del iguazu =3370
3-Libertad=3374
4-Obera=3360
5-Puerto esperanza=3378*/
