/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

import java.util.Scanner;
/**
 *
 * @author luis
 */
public class Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ejercicios Matriz");
        
        System.out.println("Eric :");
        System.out.println("Ejercicio 1 y 2:");
        Eric e1 = new Eric();
        leer.next();
        
        System.out.println("Fernando :");
        System.out.println("Ejercicio 1:");
        System.out.println("Ejercicio 2:");
        
        System.out.println("Arturo :");
        System.out.println("Ejercicio 1:");
        Arturo a1 = new Arturo();
        a1.VectorRandom();
        System.out.println("Ejercicio 2:");
        a1.AlumnosCalificaciones();
        leer.next();
        
        System.out.println("Carlos :");
        System.out.println("Ejercicio 1:");
        System.out.println("Ejercicio 2:");
        
        System.out.println("Marcelino :");
        System.out.println("Ejercicio 1: ");
        Marcelino m1 = new Marcelino();
        m1.Ejercicio1();
        System.out.println("Ejercicio 2:");
        m1.Ejercicio2();
        leer.next();
        
        System.out.println("Oscar :");
        System.out.println("Ejercicio 1:");
        System.out.println("Ingresa un numero Entero N");
        int n = leer.nextInt();
        Oscar o1 = new Oscar();
        int res = o1.uno(n);
        System.out.println(res);
        System.out.println("Ejercicio 2:");
        o1.dos();
    }
    
}
