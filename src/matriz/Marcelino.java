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
    
    public void Ejercicio3()
    {
        int[][] Matriz = new int[5][5] ;
        int llenar = 0;
        int suma = 0;
        Random R = new Random();
        
        for (int i = 0; i <= 4; i++) {
            
            for (int j = 0; j <= 4; j++) {
                llenar = R.nextInt(9)+1;
                Matriz[i][j] = llenar;
                System.out.println(suma);
                
                suma = suma + Matriz[i][j];
                if (suma >= 70)
                {
                    System.out.println("("+ i +"," + j +")" + "La suma >= a 70" );
                    System.out.println(suma);
                    System.exit(0); 
                }
            }
        }
        
        
        
        
        
    }
    
    public void Ejercicio4()
    {
        Scanner leer = new Scanner(System.in);
        int n = 0;
        int m = 0;
        int suma = 0;
        int llenar = 0;
        
        Random R = new Random();
        
        System.out.print("Dame n ");
        n = leer.nextInt();
        
        System.out.print("Dame m ");
        m = leer.nextInt();
        
        System.out.println("---- Filas ----");
        int[][] Matriz = new int[n][m] ;
        
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < m; j++) {
                llenar = R.nextInt(9)+1;
                Matriz[i][j] = llenar;
                
                suma = suma + Matriz[i][j];
                System.out.println(Matriz[i][j]);
                    
                if (j+1 == m)
                    {
                        System.out.print("Fila " + i + " ");
                        System.out.println(suma);
                        suma = 0;
                        
                    }

                }
            }
        
        System.out.println("------- Columnas ----------");
            
        
        for (int i = 0; i < m; i++) {
            
            for (int j = 0; j < n; j++) {
                
                suma = suma + Matriz[j][i];
                System.out.println(Matriz[j][i]);
                    
                if (j+1 == n)
                    {
                        System.out.print("Columna " + i + " ");
                        System.out.println(suma);
                        suma = 0;
                        
                    }

                }
            }
    }
    
    public void Ejercicio5()
    {
        Scanner leer = new Scanner(System.in);
        int n = 0;
        int m = 0;;
        int llenar = 0;
        
        Random R = new Random();
        
        System.out.print("Dame n ");
        n = leer.nextInt();
        
        System.out.print("Dame m ");
        m = leer.nextInt(); 
        
        int[][] Matriz1 = new int[n][m];
        int[][] Matriz2 = new int[n][m];
        
        int[][] MatrizTotal = new int[n][m] ;
        
        
        for (int i = 0; i < m; i++) {
            
            for (int j = 0; j < n; j++) {
                llenar = R.nextInt(9)+1;
                Matriz1[i][j] = llenar;
                
                }
            }
        
        for (int i = 0; i < m; i++) {
            
            for (int j = 0; j < n; j++) {
                llenar = R.nextInt(9)+1;
                Matriz2[i][j] = llenar;
               
                MatrizTotal[i][j] = Matriz1[i][j] * Matriz2[i][j];
                System.out.println(MatrizTotal[i][j]);
                }
            }
        
        
        
        
    }
    
    public void Ejercicio6()
    {
        int llenar = 0;
        int mayor = 0;
        int n = 4;
        int m = 5;
        
        int posicionN = 0;
        int posicionM = 0;
        
        int[][] Matriz = new int[n][m]; 
        
        Random R = new Random();
        
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < m; j++) {
                llenar = R.nextInt(9)+1;
                Matriz[i][j] = llenar;
                
               if (mayor < Matriz[i][j])
               {
                 mayor = Matriz[i][j]; 
                 posicionN = i;
                 posicionM = j; 
               }
               
               System.out.print(Matriz[i][j]);
            }       
            System.out.println();
        }
        
        System.out.println("El numero mayor es: " + mayor + " (" + posicionN + "," + posicionM + ")");
            
    }
    
    public void Ejercicio7()
    {
        
        Random R = new Random();
        int llenar = 0;
        int n = 3;
        int m = 5;
        
        int[][] Matriz = new int[n][m]; 
        
        System.out.println("----- Por Columna ------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                llenar = R.nextInt(9)+1;
                Matriz[i][j] = llenar;
               System.out.print(Matriz[i][j]);
            }
            System.out.println();
        }
        
        System.out.println("");
        System.out.println(" ---- Por Fila ---------");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                System.out.print(Matriz[j][i]);
                }
                System.out.println();
            }
            
    }
    
    public void Ejercicio8()
    {
        int n = 5;
        int m = 6;
        
        int[][] Matriz = new int[n][m]; 
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Matriz[i][j] = i+j;
                System.out.print(Matriz[i][j]);
            }
            System.out.println("");
        }
    }
    
    public void Ejercicio9()
    {
        int n = 5;
        int m = 5;
        int columnaMayor = 0;
        int suma = 0;
        int sumaFinal = 0;
        
        int [][] Matriz = new int [n][m];
         for (int i = 0; i < n; i++) {
             for (int j = 0; j < m; j++) {
               suma = suma + Matriz[i][j]; 
               
               if (j+1 == m)
                    {
                        if (sumaFinal < suma)
                        {
                            sumaFinal = suma;
                            columnaMayor = i;
                        }
                        suma = 0;
                    }
             }
        }
        System.out.println(columnaMayor);
    }
}
