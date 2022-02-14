package Ej3Extra;

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
/*Implemente un programa para una Librería haciendo uso de un HashSet para evitar datos
repetidos. Para ello, se debe crear una clase llamada Libro que guarde la información de
cada uno de los libros de una Biblioteca. La clase Libro debe guardar el título del libro,
autor, número de ejemplares y número de ejemplares prestados. También se creará en
el main un HashSet de tipo Libro que guardará todos los libros creados.
En el main tendremos un bucle que crea un objeto Libro pidiéndole al usuario todos sus
datos y los seteandolos en el Libro. Despues, ese Libro se guarda en el conjunto y se le
pregunta al usuario si quiere crear otro Libro o no.
La clase Librería contendrá además los siguientes métodos:
• Constructor por defecto.
• Constructor con parámetros.
• Métodos Setters/getters

21
• Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo
busca en el conjunto. Si está en el conjunto, se llama con ese objeto Libro al método.
El método se incrementa de a uno, como un carrito de compras, el atributo
ejemplares prestados, del libro que ingresó el usuario. Esto sucederá cada vez que
se realice un préstamo del libro. No se podrán prestar libros de los que no queden
ejemplares disponibles para prestar. Devuelve true si se ha podido realizar la
operación y false en caso contrario.
• Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se lo
busca en el conjunto. Si está en el conjunto, se llama con ese objeto al método. El
método decrementa de a uno, como un carrito de compras, el atributo ejemplares
prestados, del libro seleccionado por el usuario. Esto sucederá cada vez que se
produzca la devolución de un libro. No se podrán devolver libros donde que no
tengan ejemplares prestados. Devuelve true si se ha podido realizar la operación y
false en caso contrario.
• Método toString para mostrar los datos de los libros.*/