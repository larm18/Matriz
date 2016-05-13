/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

import java.util.Random;
/**
 *
 * @author oscar
 */
public class Oscar {
    
    public static int uno(int n)
    {
        Random numero = new Random();
        int[] v = new int[n];
        float flag = n % 2;
        int resultado = 0;
        
        for(int i = 0; i < n; i++){
            v[i] = numero.nextInt(9)+1;
            System.out.println(v[i]);
        }
        
        if(flag == 0 ){
            for(int i = 0; i < n;i++){
                resultado = resultado + v[i];
            }
        }
        
        else{
            resultado = 1;
            for(int i = 0; i < n;i++){
                
                resultado = resultado * v[i];
            }
        }
        
        return resultado;
    }
    
    public static void dos(){
        Random n = new Random();
        int[] v = new int[10];
        int apro = 0;
        int der = 0;
        int rep = 0;
        
        for(int i = 0; i < 10; i++){
            v[i] = n.nextInt(9)+1;
        }
        
        for(int i =0; i<10;i++){
            if(v[i] >= 7){
               apro++; 
            }
            else if(v[i] < 7 && v[i]>=5){
                der++;
            }
            else if(v[i] < 5 ){
                rep++;
            }
        }
        
        for(int i = 0; i< 10;i++){
            System.out.println(v[i]);
        }
        System.out.println("Cantidad de Aprobados: "+apro);
        System.out.println("Cantidad que tienen derecho a extra: "+der);
        System.out.println("Cantidad de reprodabos: "+rep);
        
    }
    
}
