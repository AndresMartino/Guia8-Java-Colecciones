package Ej2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        ArrayList<String> razas = new ArrayList();
        String opc1, raza,razaEliminar;
        boolean band;

        do {
            System.out.println("------MENU-------");
            System.out.println("1-Ingresar Raza");
            System.out.println("2-Mostrar razas");
            System.out.println("3-Eliminar una raza de la lista");
            System.out.println("S-Salir");
            band=false;
            opc1 = read.next().toUpperCase();
            switch (opc1) {
                case "1":
                    System.out.println("Ingrese una raza :");
                    raza = read.next();
                    razas.add(raza);
                    break;
                case "2":
                    System.out.println("Mostrando razas");
                    for (String Raza : razas) {
                        System.out.println(Raza);
                    }
                    break;
                case "3":
                    System.out.println("Ingrese raza a eliminar");
                    razaEliminar=read.next();
                    Iterator<String> iterator = razas.iterator();
                    while(iterator.hasNext()){
                        String perro=iterator.next();
                        if (perro.equals(razaEliminar)) {
                            iterator.remove();
                            band=true;
                        }
                    }
                    
                    if (!band) {
                        System.out.println("El perro no esta en la lista");
                    }
                    break;
                case "S":
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }

        } while (!opc1.equals("S"));

    }
}
/*Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.
Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y
se mostrará la lista ordenada.*/