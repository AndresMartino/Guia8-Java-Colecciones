package Ej33;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class AlumnoServicios {

    private ArrayList<Alumno> alumnos;
    private Scanner read;

    public AlumnoServicios() {
        this.read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        this.alumnos = new ArrayList<>();

    }

    public void ingresarDatos() {
        ArrayList<Integer> n;
        String name,opc;
        int nota;
        do {
            n = new ArrayList<>();
            System.out.println("Ingrese nombre del alumno");
            name = read.next();
            for (int i = 0; i < 3; i++) {
                System.out.printf("Ingrese nota %d de %s \n", (i + 1), name);
                nota = read.nextInt();
                n.add(nota);
            }
            crearAlumno(name, n);
            System.out.println("Desea agreagr otro alumno? (S/N)");
            opc=read.next();
            while (!opc.equalsIgnoreCase("S") && !opc.equalsIgnoreCase("N")) {
                System.out.println("ERROR! ingrese opcion correcta (S/N)");
                opc=read.next();
            }
        } while (!opc.equalsIgnoreCase("N"));

    }

    public void crearAlumno(String nombre, ArrayList<Integer> notas) {
        Alumno alumno = new Alumno();
        alumno.setNombre(nombre);
        alumno.setNotas(notas);
        addAlumno(alumno);
    }

    public void addAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }
    
    public void ingresarNombreABuscar(){
        System.out.println("Ingrese nombre de alumno a buscar");
        String name=read.next();
        Alumno alumno1=buscarAlumno(name);
        if (alumno1!=null) {
            System.out.println("El promedio es "+obtenerNotaFinal(alumno1));
        }else{
            System.out.println("Alumno no encontrado");
        }
    }
    
    
    public Alumno buscarAlumno(String nombre){
      Alumno alumno1=null;
        for (Alumno alumno : alumnos) {
            if (nombre.equalsIgnoreCase(alumno.getNombre())) {
                alumno1=alumno;
                break;
            }
        }
        return alumno1;
    }
    public double obtenerNotaFinal(Alumno alumno){
        int acu=0;
        for (Integer nota : alumno.getNotas()) {
            acu+=nota;
        }
        return (double)acu/alumno.getNotas().size();
    }
}
