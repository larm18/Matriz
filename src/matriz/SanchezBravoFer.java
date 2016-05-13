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
       Scanner read=new Scanner(System.in);
       System.out.println("Introducir un numero");
       int N=read.nextInt();
       int fill=0;
       
       Random rnd = new Random();  
       int random= (int)(rnd.nextDouble() * 10 + 1);
       int [] vector = new int [random];
       
       for(int i=0; i<random; ++i)
        {
            vector[i]=fill;
        }
     
       if(vector[random]%2==0)
       {
           
       }
       
      
       
       
    
      
       
         
    
}
}
