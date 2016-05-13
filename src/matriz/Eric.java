/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author kirito205
 */
public class Eric {
    public static int numero=0;
    public Eric(){
        out.println(datos());
        out.println(calificacion());
    }
    public static int datos(){
        out.println("dame el numero");
        Scanner leer= new Scanner(in);
        int numero= leer.nextInt();
        int valor=0;
        int[] matris= new int[numero];
        for (int i = 0; i < numero; i++) {
            Random n=new Random();
            matris[i]=(int)(n.nextInt(10)+1);
        }
        if (numero%2==0) {
            valor=suma(matris,numero);
        }
        if (numero%2!=0) {
            valor=multiplicacion(matris,numero);
        }
        return valor;
    }
   public static int suma(int[] numero,int numeros){
       int valorSuma=0;
       for (int i = 0; i < numeros; i++) {
           valorSuma+=numero[i];
       }
       return valorSuma;
   }
   public static int multiplicacion(int[] numero,int numeros){
       int valorMultiplicacion=1;
       for (int i = 0; i < numeros; i++) {
           valorMultiplicacion+=valorMultiplicacion*numero[i];
       }    
       return valorMultiplicacion;
   }
   public static String calificacion(){
       int[] matris=new int[10];
       String dato2="";
       for (int i = 0; i < 10; i++) {
            Random n=new Random();
            matris[i]=(int)(n.nextInt(100)+1);
            dato2=""+matris[i];
       } 
       String dato=Calificacion(matris);
       return dato;
   }
    public static String Calificacion(int[] matris){
        int aprobados=0;
        int reprobados=0;
        int derecho=0;
        for (int i = 0; i < 10; i++) {
            if (matris[i]>=70) {
                aprobados++;
            }
            if (matris[i]>=50 && matris[i]<70){
                derecho++;
            }
            if (matris[i]<50){
                reprobados++;
            }
        }
        return "aprobaron: "+aprobados+" derecho: "+derecho+" reprobados "+reprobados;
    }
}
