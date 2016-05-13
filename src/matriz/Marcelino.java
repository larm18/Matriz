/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

import java.util.Random;

/**
 *
 * @author marcelino
 */
public class Marcelino {
    public void Ejercicio1()
    {
        int n = 0;
        int llenar = 0;
        int sumarPares = 0;
        
        int resultado = 0;
        Random R = new Random();
        
        n = R.nextInt(9)+1;
       
        
        int[] Vector = new int[n];
        
        for (int i = 0; i < n; i++) {
            
            llenar = R.nextInt(9)+1;
            Vector[i] = llenar;
        }
        
        if (n % 2 == 0)
        {
            System.out.println("Es par");
            for (int j = 0; j < n; j++) {
               resultado += sumarPares + Vector[j];
               
               System.out.println(Vector[j]);
               System.out.println(resultado);
            }
        
        }
        else{
            System.out.println("Es Impar");
            resultado = 1;
            for (int h = 0; h < n; h++) {
                 resultado = resultado * Vector[h];
                
                System.out.println(Vector[h]);
                System.out.println(resultado);
            }
        }

        
    }
    
    public void Ejercicio2()
    {
        int calificaciones = 0;
        int[] Vector = new int[10];
        String[] Lista = new String[10]; 
        
        Random R = new Random();
        
        for (int i = 0; i < 10; i++) {
            calificaciones = R.nextInt(100)+1;
            Vector[i] = calificaciones;
        }
        
        for (int j = 0; j < 10; j++) {
            
            if(Vector[j] >= 70)
            {
                Lista[j] = "Aprobado. ";
            }
            
            if(Vector[j] >= 50 && Vector[j] < 70)
            {
               Lista[j] = "Derecho a extraordinario. ";
            }
            
            if(Vector[j] < 50)
            {
                Lista[j] = "Reprobado. ";
            }
        }
        
        for (int h = 0; h < 10; h++) {
            System.out.print(Vector[h] + " ");
            System.out.println(Lista[h]);
            
            
        }
    }
}
