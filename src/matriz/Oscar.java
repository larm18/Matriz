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
        }
        
        if(flag == 0 ){
            for(int i = 0; i < n;i++){
                resultado = resultado + v[i];
            }
        }
        
        else{
            for(int i = 0; i < n;i++){
                resultado = resultado * v[i];
            }
        }
        
        return resultado;
    }
    
    public static void dos(){
        Random n = new Random();
        int[] v = new int[9];
        int apro = 0;
        int der = 0;
        int rep = 0;
        
        for(int i = 0; i < 9; i++){
            v[i] = n.nextInt(9)+1;
        }
        
        for(int i =0; i<9;i++){
            if(v[i] >= 70){
               apro++; 
            }
            else if(v[i] < 70 && v[i]>=50){
                der++;
            }
            else if(v[i] < 50 ){
                rep++;
            }
        }
        System.out.println("Cantidad de Aprobados: "+apro);
        System.out.println("Cantidad que tienen derecho a extra: "+der);
        System.out.println("Cantidad de reprodabos: "+rep);
        
    }
    
}
