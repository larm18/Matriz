/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

import java.util.Random;

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
        int multiplicarImpares = 1;
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
               sumarPares += sumarPares + Vector[j]; 
            }
        
        }
        else{
            System.out.println("Es Impar");
            for (int h = 0; h < n; h++) {
                multiplicarImpares += multiplicarImpares * Vector[h];
            }
        }
        
        
        
        if (n % 2 == 0)
        {
            System.out.println(sumarPares);
        }
        else{
            System.out.println(multiplicarImpares);
        }
            
       
        
    }
}
