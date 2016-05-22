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
    
    public static void tres(){
        Random n = new Random();
        
        int [][] m = new int[5][5];
        int resultado = 0;
        
        for(int i = 0; i < 5; i++){
            for(int j =0; j<5;j++){
                m[i][j] = n.nextInt(9)+1;
            }
        }
        
        for(int i = 0; i < 5; i++){
            for(int j =0; j<5;j++){
                System.out.println(m[i][j]+"");
            }
            System.out.println();
        }
        
        for(int i = 0; i <5; i++){
            for(int j =0; j<5; j++){
               resultado = resultado + m[i][j];
               if(resultado >= 70){
                   System.out.print("Posicion de matriz:("+i+","+j+")");
                   break;
               }
                System.out.println();
            }
        }

    }
    
//    public static void cuatro(int n, int m){
//        Random nums = new Random();
//        int [][] mat = new int[n][m];
//        int col = 0;
//        int ren = 0;
//        
//        for(int i = 0; i < n; i++){
//            for(int j = 0; j < m; j++){
//                mat[i][j] = nums.nextInt(9)+1;
//            }
//        }
//        
//        for(int i = 0; i < n; i++){ 
//            for(int j = 0; j < m; j++){
//                ren = ren + mat[i][j];
//                System.out.println("Suma renglon: "+ ren);
//            }
//        }
//        
//        for(int i = 0; i < n; i++){ 
//            for(int j = 0; j < m; j++){
//
//                System.out.println("Suma columna: "+col);
//            }
//        }
//        
//    }
    
    public static void cinco(int n, int m){
        Random num = new Random();
        
        int [][] m1 = new int[n][m];
        int [][] m2 = new int[n][m];
        int [][] res = new int[n][m];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                m1[i][j] = num.nextInt(9)+1;
                m2[i][j] = num.nextInt(9)+1;
                res[i][j] = m1[i][j] * m2[i][j];
                
                System.out.println("Resultados: "+ res[i][j]);
            }
            System.out.println();
        } 
    }
    
    public static void seis(){
        Random num = new Random();
        
        int [][] m1 = new int[8][3];
        String cor = "";
        int mayor = 0;
        
        for(int i = 0; i < 8; i++){
            for(int j=0; j < 3;j++){
                m1 [i][j] = num.nextInt(9)+1;
            }
        }
        for(int i = 0; i < 8; i++){
            for(int j=0; j < 3;j++){
                if(m1[i][j] > mayor){
                    mayor = m1[i][j];
                    cor = ("coordenadas ("+i+","+j+")");
                }
            }
        }
        System.out.println(cor);
    }
    
    public static void siete(){
        Random num = new Random();
        
        int[][] m1 = new int[3][5];
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 5; j++){
                m1[i][j] = num.nextInt(9)+1;
                System.out.println(m1[i][j]);
            }
        }
        
        for(int i =0; i <5; i++){
            for(int j = 0;j<5;j++){
                
            }
        }
    }
    
}
