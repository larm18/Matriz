/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package matriz;
import java.util.Scanner;
import java.util.Random;
import static java.lang.System.out;
/**
 *
 * @author fernando
 */
public class SanchezBravoFer {
    
    public static void Ejercicio1()
    {
        int rnd = 0;
        int Fill= 0;
    
        Random random = new Random();
        
        rnd = random.nextInt(10)+1;
        Fill= random.nextInt(10)+1;
        
        
        int[] array = new int[rnd];
        
        for (int i = 0; i < rnd; i++) {
            array[i] = Fill;
        }
        
         int suma= 0;
         int multiplica = 0;
         
        if (rnd % 2 == 0)
        {
            for (int j = 0; j < rnd; j++) {
               suma+= suma + array[j]; 
               out.println(suma);
            }
        
        }
        else{
            for (int e = 0; e < rnd; e++) {
                multiplica+= multiplica * array[e];
                out.println(multiplica);
            }
        }  
}
    public static void Ejercicio2()
    {       
        Random random2 = new Random();
        int notas = 0;
        int[] array2 = new int[10];
        String[] Al = new String[10];        
        for (int i = 0; i < 10; i++) {
            notas = random2.nextInt(100)+1;
            array2[i] = notas;
        }
        
        for (int j = 0; j < 10; j++) {
            
            if(array2[j] >= 50 && array2[j] < 70)
            {
               Al[j] = "Derecho a examen extraordinario. ";
            }
            
            else if(array2[j] < 50)
            {
                Al[j] = "Reprobado";
            }
            
            else if(array2[j] >= 70)
            {
                Al[j] = "Aprobado";
            }
        }
        
        for (int e = 0; e < 10; e++) {
            out.print(array2[e] + " ");
            out.println(Al[e]);  
        }
    }
    }
