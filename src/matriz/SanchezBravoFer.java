/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package matriz;
import java.util.Scanner;
import java.util.Random;
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
        
        
        int[] Vector = new int[rnd];
        
        for (int i = 0; i < rnd; i++) {
            Vector[i] = Fill;
        }
        
         int suma= 0;
         int multiplica = 0;
         
        if (rnd % 2 == 0)
        {
            for (int j = 0; j < rnd; j++) {
               suma+= suma + Vector[j]; 
               System.out.println(suma);
            }
        
        }
        else{
            for (int e = 0; e < rnd; e++) {
                multiplica+= multiplica * Vector[e];
                System.out.println(multiplica);
            }
        }  
}
    public static void Ejercicio2()
    {
     
      int[] Vector = new int[10];
      Random random = new Random();
        for(int i=0;i<=9;i++)
        {
            
      }
    }
}
