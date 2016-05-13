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
 * @author lune
 */
public class Carloscardenas {
    public static void ejerciocio1(){
        
        Scanner scan = new Scanner(System.in);
        
        
        out.print("Introduzca un numero: ");
        int numero = scan.nextInt();
        int [] vector = new int [numero];
        Random rng = new Random();
        
        for (int i=0;i<=numero;i++)
            {
            vector[i] =(int)(rng.nextDouble()*10+1); 
            out.print(" "+vector[i]);
            }
        
        
        if (numero%2==0)
        {
            int sum = vector [0];
             for (int i=1;i<=numero;i++)
            {
                sum=sum+vector[i];
            }
             out.println("el numero es par, la suma de todos es: "+sum);
        }
        
        else
        {
           int mul = vector [0];
             for (int i=1;i<=numero;i++)
            {
                mul=mul*vector[i];
            }
              out.println("el numero es par, la multiplicacion de todos es: "+mul);
        } 
    
    }
    
    public static void ejerciocio2(){
        
                int [] calificacion = new int [10];
                Random rng = new Random();
                int A = 0;int R = 0;int E = 0;

                for (int i=0;i<=9;i++){
                    
                calificacion[i] =(int)(rng.nextDouble()*100); 
             
                if (calificacion[i]>=70)
                {
                    A++;
                }
                if(calificacion[i]<70 && calificacion[i]>=5)
                {
                    F++;
                }
                else
                {
                   E++; 
                }
                
                }
              System.out.println("La cantidad de alumnos que aprobaron es: "+A);    
              System.out.println("La cantidad de alumnos que tienen derecho a extra es: "+F);    
              System.out.println("La cantidad de alumnos que reprobaron es: "+E);
    }
    
}
