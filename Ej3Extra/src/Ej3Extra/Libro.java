package Ej3Extra;

import java.util.Objects;

public class Libro {
    private String titulo;
    private String autor;
    private Integer nEjemplares;
    private Integer nEjemplaresPrestado;

    public Libro() {
    }

    public Libro(String titulo, String autor, Integer nEjemplares, Integer nEjemplaresPrestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.nEjemplares = nEjemplares;
        this.nEjemplaresPrestado = nEjemplaresPrestado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getnEjemplares() {
        return nEjemplares;
    }

    public void setnEjemplares(Integer nEjemplares) {
        this.nEjemplares = nEjemplares;
    }

    public Integer getnEjemplaresPrestado() {
        return nEjemplaresPrestado;
    }

    public void setnEjemplaresPrestado(Integer nEjemplaresPrestado) {
        this.nEjemplaresPrestado = nEjemplaresPrestado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.titulo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        return true;
    }
    
    public boolean prestamo(){
        if (this.nEjemplaresPrestado<this.nEjemplares) {
            this.nEjemplaresPrestado++;
            return true;
        }
        return false;
    }
    
     public boolean devolucion(){
        if (this.nEjemplaresPrestado>0) {
            this.nEjemplaresPrestado--;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return  "titulo=" + titulo + ", autor=" + autor + ", nEjemplares=" + nEjemplares + ", nEjemplaresPrestado=" + nEjemplaresPrestado ;
    }
     
}
/*Implemente un programa para una Librer??a haciendo uso de un HashSet para evitar datos
repetidos. Para ello, se debe crear una clase llamada Libro que guarde la informaci??n de
cada uno de los libros de una Biblioteca. La clase Libro debe guardar el t??tulo del libro,
autor, n??mero de ejemplares y n??mero de ejemplares prestados. Tambi??n se crear?? en
el main un HashSet de tipo Libro que guardar?? todos los libros creados.
En el main tendremos un bucle que crea un objeto Libro pidi??ndole al usuario todos sus
datos y los seteandolos en el Libro. Despues, ese Libro se guarda en el conjunto y se le
pregunta al usuario si quiere crear otro Libro o no.
La clase Librer??a contendr?? adem??s los siguientes m??todos:
??? Constructor por defecto.
??? Constructor con par??metros.
??? M??todos Setters/getters

21
??? M??todo prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo
busca en el conjunto. Si est?? en el conjunto, se llama con ese objeto Libro al m??todo.
El m??todo se incrementa de a uno, como un carrito de compras, el atributo
ejemplares prestados, del libro que ingres?? el usuario. Esto suceder?? cada vez que
se realice un pr??stamo del libro. No se podr??n prestar libros de los que no queden
ejemplares disponibles para prestar. Devuelve true si se ha podido realizar la
operaci??n y false en caso contrario.
??? M??todo devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se lo
busca en el conjunto. Si est?? en el conjunto, se llama con ese objeto al m??todo. El
m??todo decrementa de a uno, como un carrito de compras, el atributo ejemplares
prestados, del libro seleccionado por el usuario. Esto suceder?? cada vez que se
produzca la devoluci??n de un libro. No se podr??n devolver libros donde que no
tengan ejemplares prestados. Devuelve true si se ha podido realizar la operaci??n y
false en caso contrario.
??? M??todo toString para mostrar los datos de los libros.*/