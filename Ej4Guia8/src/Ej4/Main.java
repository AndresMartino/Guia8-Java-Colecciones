package Ej4;

import Ej4.utilidades.Comparadores;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        ArrayList<Pelicula> peliculas = new ArrayList();
        String nDirector, nTitulo, opc;
        int horas, minutos;
        LocalTime duracion;
        do {
            System.out.println("ingrese titulo de la pelicula");
            nTitulo = read.next();
            System.out.println("ingrese director pelicula");
            nDirector = read.next();
            System.out.println("ingrese duracion en formato (horas:minutos)");
            System.out.println("ingrese horas");
            horas = read.nextInt();
            while (horas < 0 || horas > 23) {
                System.out.println("ERROR!  ingrese duracion correcta");
                horas = read.nextInt();
            }
            System.out.println("ingrese minutos");
            minutos = read.nextInt();
            while (minutos < 0 || minutos > 60) {
                System.out.println("ERROR!  ingrese duracion correcta");
                minutos = read.nextInt();
            }
            duracion = LocalTime.of(horas, minutos);
            Pelicula pelicula = new Pelicula(nTitulo, nDirector, duracion);
            peliculas.add(pelicula);
            System.out.println("Desea agregar otra pelicula?(S/N)");
            opc = read.next().toUpperCase();
            while (!opc.equals("S") && !opc.equals("N")) {
                System.out.println("ingrese oopcion valida");
                System.out.println("Desea agregar otra pelicula?(S/N)");
                opc = read.next().toUpperCase();
            }
        } while (!opc.equals("N"));
         LocalTime d = LocalTime.of(1, 00);
         System.out.println("");
        System.out.println("----La lista de peliculas----");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
        System.out.printf("\n\n");
        System.out.println("-----peliculaes con duracion menor a una hora----");
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getDuracion().isBefore(d)) {
                System.out.println(pelicula);
            }
        }
         System.out.printf("\n\n");
        System.out.println("-----peliculas ordenadas por duracion de manera descendente-----");
        Collections.sort(peliculas, Comparadores.ordenarPorDuracionDesc);
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
         System.out.printf("\n\n");
        System.out.println("-----peliculas ordenadas por duracion de manera ascendente-----");
        Collections.sort(peliculas, Comparadores.ordenarPorDuracionAscen);
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
         System.out.printf("\n\n");
        System.out.println("-----peliculas ordenadas por titulo alfabeticamente-----");
        Collections.sort(peliculas, Comparadores.ordenarPorTituloAscen);
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
          System.out.printf("\n\n");
        System.out.println("-----peliculas ordenadas por director alfabeticamente-----");
        Collections.sort(peliculas, Comparadores.ordenarPorDirectorAscen);
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
    }

}
