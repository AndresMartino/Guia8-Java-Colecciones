package Ej4.utilidades;

import Ej4.Pelicula;
import java.util.Comparator;

public class Comparadores {
    public static Comparator<Pelicula> ordenarPorDuracionDesc=new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t1, Pelicula t2) {
            return t2.getDuracion().compareTo(t1.getDuracion());
        }
    } ;
      
 public static Comparator<Pelicula> ordenarPorDuracionAscen=new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t1, Pelicula t2) {
            return t1.getDuracion().compareTo(t2.getDuracion());
        }
    } ;
 public static Comparator<Pelicula> ordenarPorTituloAscen=new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t1, Pelicula t2) {
            return t1.getTitulo().compareTo(t2.getTitulo());
        }
    } ;
 public static Comparator<Pelicula> ordenarPorDirectorAscen=new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t1, Pelicula t2) {
            return t1.getDirector().compareTo(t2.getDirector());
        }
    } ;
 
 }


