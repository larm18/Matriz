/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author devilwall
 */
public class Arturo {
    
    public static void MatrizRandom() {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("De cuantas posiciones quieres el vector?");
        int n = leer.nextInt();   
        int [] vector = new int [n];
        for (int i=0;i<=n;i++)
            {
                 System.out.println("Introduce el valor de la posicio "+i);
            vector[i] = leer.nextInt();  
            }
        if (n%2==0)
        {
            int suma = vector [0];
             for (int j=1;j<=n;j++)
            {
                suma=suma+vector[j];
            }
              System.out.println("La suma de todos es: "+suma);
        }
        else
        {
           int mult = vector [0];
             for (int j=1;j<=n;j++)
            {
                mult=mult*vector[j];
            }
              System.out.println("La multiplicacion de todos es: "+mult);
        }   
        
    }
}
