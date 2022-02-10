package javaapplication48;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class JavaApplication48 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        ArrayList<String> razas = new ArrayList();
        razas.add("patricia");
        razas.add("mariano");
        razas.add("andres");
        System.out.println("ingrese nombre");
        String nombre = read.next();
        System.out.println(razas);
        if (razas.contains(nombre)) {
            razas.remove(nombre);
        }
        System.out.println(razas);
    }

}
