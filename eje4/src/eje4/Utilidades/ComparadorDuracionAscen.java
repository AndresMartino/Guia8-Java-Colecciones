package eje4.Utilidades;

import eje4.Pelicula;
import java.util.Comparator;

public class ComparadorDuracionAscen implements Comparator<Pelicula>{

    @Override
    public int compare(Pelicula t, Pelicula t1) {
        return t.getDuracion().compareTo(t1.getDuracion());
    }
    
}
