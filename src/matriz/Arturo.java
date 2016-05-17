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
     public static void Ejer4()
        {
         Scanner leer = new Scanner(System.in);   
             System.out.println("Introduce n:");
        int n = leer.nextInt();  
                     System.out.println("Introduce m");
        int m = leer.nextInt();  
        
                int [][] matriz = new int [n+1][m+1];
                Random rnd = new Random();
                for (int i=0;i<n;i++)
                {
                    System.out.println(""); 
                    for (int j=0;j<m;j++)
                    {                
                        matriz[i][j] =(int)(rnd.nextDouble()*10); 
                        matriz [n][j]=matriz [n][j]+matriz[i][j];
                        matriz [i][m]=matriz [i][m]+matriz[i][j] ;      
                    }
                }
                 for (int i=0;i<n+1;i++)
                {
                    System.out.println("  "); 
                    for (int j=0;j<m+1;j++)
                    {                
                       System.out.print(matriz[i][j]+"  ");  
                    }
                }
             
        }    
      public static void Ejer5()
        {
         Scanner leer = new Scanner(System.in);   
             System.out.println("Introduce n:");
        int n = leer.nextInt();  
                     System.out.println("Introduce m");
        int m = leer.nextInt();  
        
                int [][] matriza = new int [n][m];
                int [][] matrizb = new int [n][m];
                int [][] matrizc = new int [n][m];
                
                Random rnd = new Random();
                for (int i=0;i<n;i++)
                {
                    System.out.println(""); 
                    for (int j=0;j<m;j++)
                    {                
                        matriza[i][j] =(int)(rnd.nextDouble()*10); 
                        matrizb[i][j] =(int)(rnd.nextDouble()*10); 
                        matrizc[i][j] = matriza[i][j]*matrizb[i][j];
                    }
                }
                 System.out.println("  ");  System.out.println("  "); 
                for (int i=0;i<n;i++)
                {
                    System.out.println("  "); 
                    for (int j=0;j<m;j++)
                    {                
                       System.out.print(matriza[i][j]+"  ");  
                    }
                }
                 System.out.println("  ");   System.out.println("  "); 
                for (int i=0;i<n;i++)
                {
                    System.out.println("  "); 
                    for (int j=0;j<m;j++)
                    {                
                       System.out.print(matrizb[i][j]+"  ");  
                    }
                }
                  System.out.println("  ");   System.out.println("  "); 
                for (int i=0;i<n;i++)
                {
                    System.out.println("  "); 
                    for (int j=0;j<m;j++)
                    {                
                       System.out.print(matrizc[i][j]+"  ");  
                    }
                }
        }
      
     public static void Ejer6()
        {
        
                int n=4;
                int m=5;
                int [] maximo = new int [3];
                int [][] matriz = new int [n][m];
                Random rnd = new Random();
                for (int i=0;i<n;i++)
                {
                    System.out.println(""); 
                    for (int j=0;j<m;j++)
                    {                
                        matriz[i][j] =(int)(rnd.nextDouble()*10); 
                        if (matriz[i][j]>maximo[0])
                        {
                            maximo[0]=matriz[i][j];
                            maximo[1]=i+1;
                            maximo[2]=j+1;
                        }
                    }
                }
                 for (int i=0;i<n;i++)
                {
                    System.out.println("  "); 
                    for (int j=0;j<m;j++)
                    {                
                       System.out.print(matriz[i][j]+"  ");  
                    }
                }
                 System.out.println("El numero mas grande es:"+ maximo[0]+" con cordenadas ("+ maximo[1]+","+maximo[2]+")"); 
        }    
             
     
               
     public static void Ejer7()
        {
        
                int n=3;
                int m=5;
                int [][] matriz = new int [n][m];
                Random rnd = new Random();
                for (int i=0;i<n;i++)
                {
                    System.out.println(""); 
                    for (int j=0;j<m;j++)
                    {                
                        matriz[i][j] =(int)(rnd.nextDouble()*10); 
                        System.out.print(matriz[i][j]+"  ");
                    }
                }
                System.out.println(""); 
                System.out.println("Por Columna"); 
                
                 for (int i=0;i<n;i++)
                {
                    for (int j=0;j<m;j++)
                    {                
                       System.out.print(matriz[i][j]+"  ");  
                    }
                }
                System.out.println(""); 
                System.out.println("Por Renglon"); 
                for (int j=0;j<m;j++)
                {
                    for (int i=0;i<n;i++)
                    {                
                       System.out.print(matriz[i][j]+"  ");  
                    }
                }
        }    
                 
          
     public static void Ejer8()
        {
        
                int n=5;
                int m=6;
                int [][] matriz = new int [n][m];
                Random rnd = new Random();
                for (int i=0;i<n;i++)
                {
                    System.out.println(""); 
                    for (int j=0;j<m;j++)
                    {                
                        matriz[i][j] =i+j; 
                        System.out.print(matriz[i][j]+"  ");
                    }
                }
               
        }    

    public static void Ejer9()
        {
         Scanner leer = new Scanner(System.in);   
             System.out.println("Introduce n:");
        int n = leer.nextInt();  
                     System.out.println("Introduce m");
        int m = leer.nextInt();  
        int [] maximo = new int [2];
                int [][] matriz = new int [n+1][m+1];
                Random rnd = new Random();
                for (int i=0;i<n;i++)
                {
                    System.out.println(""); 
                    for (int j=0;j<m;j++)
                    {                
                        matriz[i][j] =(int)(rnd.nextDouble()*10); 
                        matriz [n][j]=matriz [n][j]+matriz[i][j];
                        System.out.print(matriz[i][j]+"  ");
                          if (matriz[n][j]>maximo[0])
                        {
                            maximo[0]=matriz[n][j];
                            maximo[1]=j+1;
                        }
                        
                                
                    }
                }
            System.out.println("La columna: "+maximo[1]+" es la que suma mas con: "+maximo[0]);     
             
        }    

     
     
}
