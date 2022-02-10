package Ej3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int c = 1, n;
        String name, nombreBuscar;
        int opc;
        ArrayList<Alumno> alumnos = new ArrayList();
         Alumno alumno=new Alumno();
        do {
            System.out.println("---MENU----");
            System.out.println("1-Ingresar nuevo");
            System.out.println("2-Mostrar Lista");
            System.out.println("3-calcular promedio");
            System.out.println("4-SALIR");
            opc=read.nextInt();
            switch (opc) {
                case 1:
                   
                    ArrayList<Integer> notas=new ArrayList();
                   
                    System.out.println("ingrese nombe del alumno");
                    name=read.next();
                    for (int i = 0; i < 3; i++) {
                        System.out.println("ingrese nota "+(i+1));
                        n=read.nextInt();
                        notas.add(n);
                    }
                     alumno=new Alumno(name,notas);
                    
                    alumnos.add(alumno);
                    break;
                case 2:
                    for (Alumno alumnos1 : alumnos) {
                        System.out.println(alumnos1.getNombre());
                        System.out.println(alumnos1.getNotas());
                    }
                    break;
                case 3:
                    System.out.println("ingrese nombre a buscar y calcular promedio");
                    nombreBuscar=read.next();
                    boolean band=false;
                    Iterator<Alumno> iterator=alumnos.iterator();
                    while (iterator.hasNext()) {
                        Alumno alumno1=iterator.next();
                        if (alumno1.getNombre().equals(nombreBuscar)) {
                            System.out.println("El promedio es "+alumno.notaFinal(alumno.getNotas()));
                            band=true;
                        }
                        
                    }
                    if (!band) {
                        System.out.println("no se encontro el nombre");
                    }
                    break;
                case 4: 
                    System.out.println("saliendo");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        } while (opc>=1 && opc<=4);

    }

}
