package Ej8;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        ArrayList<String> razas = new ArrayList<>();
        String opc1, raza;

        do {
            System.out.println("------MENU-------");
            System.out.println("1-Ingresar Raza");
            System.out.println("2-Mostrar razas");
            System.out.println("S-Salir");
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
                case "S":
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }

        } while (!opc1.equals("S"));

    }
}

/*Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String.
El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si
decide salir, se mostrará todos los perros guardados en el ArrayList.*/
