package Ej3Extra;


import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        HashSet<Libro> libros=new HashSet();
       // Libro libro=new Libro();
        String titulo,autor,opc;
        int ejemplares,ejemplaresPrestados,opc1;
        
        do {
            System.out.println("ingrese titulo del libro");
            titulo=read.next();
            System.out.println("ingrese autor del libro");
            autor=read.next();
            System.out.println("ingrese cantidad de ejemplares");
            ejemplares=read.nextInt();
            System.out.println("ingrese cantidad de ejemplares prestados");
            ejemplaresPrestados=read.nextInt();
            while (ejemplaresPrestados>ejemplares) {
                System.out.println("Ejemplares prestados no puede ser mayor que la cantidad de ejemplares");
                ejemplaresPrestados=read.nextInt();
            }
            Libro libro=new Libro(titulo,autor,ejemplares,ejemplaresPrestados);
            /*libro.setTitulo(titulo);
            libro.setAutor(autor);
            libro.setnEjemplares(ejemplares);
            libro.setnEjemplaresPrestado(ejemplaresPrestados);*/
            libros.add(libro);
            System.out.println("\n\n Desea ingresar otro libro? (S/N)");
            opc=read.next();
            while (!opc.equalsIgnoreCase("s") && !opc.equalsIgnoreCase("n") ) {
                System.out.println("Ingrese una opcion valida! desea ingresar otro libro?(S/N)");
                opc=read.next();
            }
        } while (!opc.equalsIgnoreCase("n"));
        do {
            System.out.println("\n\n -----MENU-----");
            System.out.println("1-Prestar libro");
            System.out.println("2-Devolver libro");
            System.out.println("3-Mostrar Libros");
            System.out.println("4-Salir");
            opc1=read.nextInt();
            switch (opc1) {
                case 1:
                    System.out.println("ingrese titulo del libro a prestar");
                    titulo=read.next();
                    for (Libro libro1 : libros) {
                        if (titulo.equals(libro1.getTitulo())) {
                            if(libro1.prestamo()){
                                System.out.println("Libro prestado con exito");
                            }else{
                                System.out.println("no quedan libros disponibles");
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.println("ingrese titulo del libro a devolver");
                    titulo=read.next();
                    for (Libro libro1 : libros) {
                        if (titulo.equals(libro1.getTitulo())) {
                            if(libro1.devolucion()){
                                System.out.println("Libro devuelto con exito");
                            }else{
                                System.out.println("No se pudo devolver el libro");
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Mostrando libros");
                    for (Libro libro1 : libros) {
                        System.out.println(libro1);
                    }
                    break;
                case 4:
                    System.out.println("SALIENDO!");
                    break;
                default:
                    System.out.println("ingrese ocpion correcta!");
            }
        } while (opc1!=4);
        
    }
    
}
