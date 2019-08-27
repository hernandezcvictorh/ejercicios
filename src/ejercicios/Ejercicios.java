/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author zeuss
 */
public class Ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float notas;
        String nombre, cond;
        int cont = 0;
        Scanner leer = new Scanner(System.in);
        int[] prom = new int[5];

        do {
            System.out.println("ingrese el nombre del alumno: ");
            nombre = leer.next();
            do {
                System.out.println("desea agregar nota  (si/no)");
                cond = leer.next();
                if (cond.equals("si")) {
                    do {
                        System.out.println("ingrese la nota (valores desde el 1,0 al 7,0)");
                        notas = leer.nextFloat();
                    } while (!(notas >= 1 && notas <= 7));
                }
            } while (!(cond.equals("no")));
            cont++;
        } while (!(cont == 5));

    }
    
    
}
