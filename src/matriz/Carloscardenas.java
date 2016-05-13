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
    
}
