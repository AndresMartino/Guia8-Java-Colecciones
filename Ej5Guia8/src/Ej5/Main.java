package Ej5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        HashSet<String> paises = new HashSet();
        ArrayList<String> lista;
        int opc;
        String pais, borrar;
        do {
            System.out.printf("\n\n----menu----\n");
            System.out.println("1-Ingrese pais");
            System.out.println("2-Mostrar paises");
            System.out.println("3-Eliminar un pais");
            System.out.printf("4-Salir\n\n");
            opc = read.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("ingrese pais a la lista");
                    pais = read.next();
                    paises.add(pais);
                    break;
                case 2:
                    System.out.println("Mostrando paises");
                    for (String p : paises) {
                        System.out.println(p);
                    }
                    break;
                case 3:
                    System.out.println("Ingresar pais a eliminar");
                    borrar = read.next();
                    boolean band = false;
                    Iterator<String> iterator = paises.iterator();
                    while (iterator.hasNext()) {
                        if (iterator.next().equals(borrar)) {
                            iterator.remove();
                            band = true;
                        }
                    }
                    if (band) {
                        System.out.println("Pais eliminado");
                    } else {
                        System.out.println("Pais no encontrado");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo......");
                    break;
                default:
                    System.out.println("Ingrese opcion valida");
            }
        } while (opc != 4);
        System.out.printf("\n\nPaises ordenados alfabeticamente\n");
        lista=new ArrayList(paises);
        Collections.sort(lista);
        for (String p : lista) {
            System.out.println(p);
        }
    }

}
/*Se requiere un programa que lea y guarde pa??ses, y para evitar que se ingresen
repetidos usaremos un conjunto. El programa pedir?? un pa??s en un bucle, se
guardar?? el pa??s en el conjunto y despu??s se le preguntar?? al usuario si quiere
guardar otro pa??s o si quiere salir, si decide salir, se mostrar?? todos los pa??ses
guardados en el conjunto.
Despu??s deberemos mostrar el conjunto ordenado alfab??ticamente para esto
recordar como se ordena un conjunto.
Y por ultimo, al usuario se le pedir?? un pa??s y se recorrer?? el conjunto con un Iterator,
se buscar?? el pa??s en el conjunto y si est?? en el conjunto se eliminar?? el pa??s que
ingres?? el usuario y se mostrar?? el conjunto. Si el pa??s no se encuentra en el conjunto
se le informar?? al usuario.*/
