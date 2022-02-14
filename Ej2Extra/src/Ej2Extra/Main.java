package Ej2Extra;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        ArrayList<CantanteFamoso> listaDeCantantes = new ArrayList();
        String nom, disco;
        int opc;
        boolean band;
        for (int i = 0; i < 3; i++) {
            System.out.println("ingrese nombre del cantante numero " + (i + 1));
            nom = read.next();
            System.out.println("ingrese disco con mas ventas");
            disco = read.next();
            CantanteFamoso cantante = new CantanteFamoso(nom, disco);
            listaDeCantantes.add(cantante);
        }
        do {
            System.out.println("-----MENU-----");
            System.out.println("1-Agregar Cantante");
            System.out.println("2-Mostrar cantantes");
            System.out.println("3-Eliminar cantante");
            System.out.println("4-Salir");
            opc = read.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("ingrese nombre de cantante");
                    nom = read.next();
                    System.out.println("ingrese disco con mas ventas");
                    disco = read.next();
                    CantanteFamoso cantante = new CantanteFamoso(nom, disco);
                    listaDeCantantes.add(cantante);
                    break;
                case 2:
                    System.out.println("Mostrando cantantes");
                    for (CantanteFamoso Cantante : listaDeCantantes) {
                        System.out.println(Cantante);
                    }
                    break;
                case 3:
                    Iterator<CantanteFamoso> iterator=listaDeCantantes.iterator();
                    System.out.println("Ingrese nombre de cantante a eliminar");
                    nom=read.next();
                    band=false;
                    while (iterator.hasNext()) {
                        CantanteFamoso c=iterator.next();
                        if (c.getNombre().equals(nom)) {
                            iterator.remove();
                            band=true;
                        }
                    }
                    if (band) {
                        System.out.println("Cantante eliminado con exito!");
                    }else{
                        System.out.println("Cantante no encontrado");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opcion incorrecta!");
            }
        } while (opc!=4);
        System.out.println("Lista final");
        for (CantanteFamoso listaDeCantante : listaDeCantantes) {
            System.out.println(listaDeCantante);
        }
    }

}
