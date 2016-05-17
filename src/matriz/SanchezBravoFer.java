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
    
    public static void Ejercicio3()
    {

        int [][] matriz = new int[5][5];
        
       
       int resultado=0;
       
       for  (int x=0; x < matriz.length; x++) 
       {
         for (int y=0; y < matriz[x].length; y++)
         {
            matriz[x][y] = (int) (Math.random()*10+1);
            resultado=resultado+matriz[x][y];
            if(resultado>=70){
            System.out.println("la posicion de la matriz es:"+ matriz[x][y]);
            
            System.exit(0);
          }
      
        
         }
       }
    }   
    
    public static void Ejercicio4()
    {
    int [][] matriz = new int[5][5];
       
       int resultado=1;
       int sumf;
       int sumc;
       
       for(int x=0; x < matriz.length; x++) 
       {
         for (int y=0; y < matriz[x].length; y++)
         {
            matriz[x][y] = (int) (Math.random()*9+1);
 
          }
         for (int i = 0; i < matriz.length; i++) {  
                  sumf=0;  
                  for (int j = 0; j < matriz[i].length; j++) {  
                   sumf=sumf+matriz[i][j];  
                  }  
                  
                 System.out.println("La suma de los valores de la fila "+(i+1)+" es:      "+sumf);

                                                } 
         
          for (int i = 0; i < matriz[0].length; i++) 
          {  
                sumc=0;  
                for (int j = 0; j < matriz.length; j++)
                {  
                  sumc=sumc+matriz[j][i];  
                }  
                System.out.println("La suma de los valores de la columna "+(i+1)+" es: "+sumc);  
            }  
       
       }
    
    }
    
    public static void Ejercicio5()
    {
       int [][] matriz1 = new int[5][5];
       int [][] matriz2 = new int[5][5];
       int [][] matriz3 = new int[5][5];
       
       int resultado=1;
       int multi;
     
       
       for(int x=0; x < matriz1.length; x++) 
       {
         for (int y=0; y < matriz1[x].length; y++)
         {
            matriz1[x][y] = (int) (Math.random()*9+1);
 
          
       
       
       
         
          for(int z=0; z < matriz2.length; z++) 
       {
         for (int w=0; w < matriz2[w].length; w++)
         {
            matriz2[z][w] = (int) (Math.random()*9+1);
 
          }
       }
          
          for (int i = 0; i < matriz1[0].length; i++) 
          {  
                multi=1;  
                for (int j = 0; j < matriz1.length; j++)
                {  
                  multi=matriz1[x][y]*matriz2[i][j];  
                }  
                System.out.println(multi);  
            }  
         }
       }
           
         
         
           
   
       }
    }
    
    
