package Ej1Extra;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        ArrayList<Integer> numeros=new ArrayList();
        int num;
        do {
            System.out.println("ingrese numero en la lista");
            num=read.nextInt();
            if (num!=-99) {
                numeros.add(num);
            }
        } while (num!=-99);
        
        System.out.println("La lista cargada es: ");
        for (Integer numero : numeros) {
            System.out.print(numero+" ");
        }
    }
    
}
/*Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado y
los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
programa mostrará por pantalla el número de valores que se han leído, su suma y su
media (promedio).*/