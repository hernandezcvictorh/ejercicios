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
        float nota, notas = 0, acu = 0;
        String nombre, cond;
        int cont = 0, n = 0;
        Scanner leer = new Scanner(System.in);
        float[] prom = new float[5];

        for (int i = 0; i <= 1; i++) {

            System.out.println("ingrese el nombre del alumno: ");
            nombre = leer.next();
            do {
                System.out.println("desea agregar nota  (si/no)");
                cond = leer.next();
                if (cond.equals("si")) {

                    do {
                        System.out.println("ingrese la nota (valores desde el 1,0 al 7,0)");
                        nota = leer.nextFloat();
                        n++;
                        acu = acu + nota;
                        notas = (acu) / n;
                    } while (!(nota >= 1 && nota <= 7));

                }
            } while (!(cond.equals("no")));
            acu=0;
            prom[i] = notas;
            
        }
        System.out.println(prom[0]);
        System.out.println(prom[1]);
    }
    
    
}
