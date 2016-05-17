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
public class Arturo 
{
    
    public static void Ejer1()
    {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("De cuantas posiciones quieres el vector?");
        int n = leer.nextInt();  
        int [] vector = new int [n];
        for (int i=0;i<=n-1;i++)
            {
               Random rnd = new Random();
            vector[i] =(int)(rnd.nextDouble()*10+1); 
            System.out.print(" "+vector[i]);
            }
        if (n%2==0)
        {
            int suma = vector [0];
             for (int j=1;j<n;j++)
            {
                suma=suma+vector[j];
            }
              System.out.println("N es Par, la suma de todos es: "+suma);
        }
        else
        {
           int mult = vector [0];
             for (int j=1;j<n;j++)
            {
                mult=mult*vector[j];
            }
              System.out.println("N es Inpar, la multiplicacion de todos es: "+mult);
        }   
        
    }
    public static void Ejer2()
    {
                int [] cali = new int [10];
                Random rnd = new Random();
                int aprobado = 0;
                int reprobado = 0;
                int extra = 0;
                for (int i=0;i<=9;i++)
            {
                cali[i] =(int)(rnd.nextDouble()*100); 
                System.out.print(" "+cali[i]);
                if (cali[i]>=70)
                {
                    aprobado++;
                }
                else if(cali[i]<70)
                {
                    reprobado++;
                }
                else
                {
                   extra++; 
                }
            }
              System.out.println("Aprobaron "+aprobado+" alumnos.");    
              System.out.println("Reprobaron "+reprobado+" alumnos.");    
              System.out.println("Y se fueron a extra ordinaro "+extra+" alumnos.");    
                
    }
    public static void Ejer3()
        {
                int [][] matriz = new int [5][5];
                Random rnd = new Random();
                int suma = 0;
                int [] cordenada = new int [2];
                for (int i=0;i<5;i++)
                {
                    System.out.println(""); 
                    for (int j=0;j<5;j++)
                    {                
                        matriz[i][j] =(int)(rnd.nextDouble()*10); 
                        System.out.print(matriz[i][j]+" "); 
                            if (suma<=70)
                            {
                                suma=suma+matriz[i][j];
                                cordenada [0]=i+1;
                                cordenada [1]=j+1;    
                                }
                    }
                }
                System.out.println("("+cordenada[0]+","+cordenada[1]+") la suma es:"+suma); 
        }
                
}
