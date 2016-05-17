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
        Matris();
        nm();
        doblematris();
        matrisrandom();
        imprencionmatris();
        matris8();
        matrisgrande();
    }
    public static String datos(){
        out.println("dame el numero");
        Scanner leer= new Scanner(in);
        int numero= leer.nextInt();
        int valor=0;
        String numerosos="";
        int[] matris= new int[numero];
        for (int i = 0; i < numero; i++) {
            Random n=new Random();
            matris[i]=(int)(n.nextInt(10)+1);
            numerosos+=" "+matris[i];
        }
        if (numero%2==0) {
            valor=suma(matris,numero);
        }
        if (numero%2!=0) {
            valor=multiplicacion(matris,numero);
        }
        return ""+valor+" los numeros: "+numerosos;
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
           valorMultiplicacion=valorMultiplicacion*numero[i];
       }    
       return valorMultiplicacion;
   }
   public static String calificacion(){
       int[] matris=new int[10];
       String dato2="";
       for (int i = 0; i < 10; i++) {
            Random n=new Random();
            matris[i]=(int)(n.nextInt(100)+1);
            dato2+=" las calificaciones: "+matris[i];
       } 
       String dato=Calificacion(matris);
       return dato + " "+dato2;
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
    public static void Matris(){
        int[][] matris=new int[5][5];
        int numero8=0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                Random n=new Random();
                matris[i][j]=(int)(n.nextInt(10)+1);
                out.print(matris[i][j]+",");
            }
            out.println();
        }
        String posicion="";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                 numero8+=matris[i][j];
                if (numero8>=70) {
                    
                    posicion=numero8+" pisicion "+i+" "+j;
                    break;
                }
            }
        }
        out.println( posicion);
    }
    public static void nm(){
        out.println("dame el numero");
        Scanner leer= new Scanner(in);
        int n= leer.nextInt();
        out.println("dame el numero");
        int m= leer.nextInt();
        int[][] matris2=new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Random z=new Random();
                matris2[i][j]=(int)(z.nextInt(10)+1);
                out.print(matris2[i][j]+",");
            }
            out.println();
        }
        int numero5=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {   
                numero5+=matris2[i][j];
            }
            out.print("renglon "+numero5);
            out.println();
            numero5=0;
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {   
                numero5+=matris2[j][i];
            }
            out.print("columna "+numero5);
            out.println();
            numero5=0;
        }
    }
    public static void doblematris(){
        out.println("dame el numero");
        Scanner leer= new Scanner(in);
        int n= leer.nextInt();
        out.println("dame el numero");
        int m= leer.nextInt();
        int[][] matris1=new int[n][m];
        int[][] matris2=new int[n][m];
        int[][] matris3=new int[n][m];
        out.println("primera matris");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Random z=new Random();
                matris2[i][j]=(int)(z.nextInt(10)+1);
                out.print(matris2[i][j]+",");
            }
            out.println();
        }
        out.println("segunda matris");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Random z=new Random();
                matris1[i][j]=(int)(z.nextInt(10)+1);
                out.print(matris1[i][j]+",");
            }
            out.println();
        }
        out.println("matris multiplicada");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matris3[i][j]=matris1[i][j]*matris2[i][j];
                out.print(matris3[i][j]+",");
            }
            out.println();
        }
    }
    public static void matrisrandom(){
        int[][] matris=new int[4][5];
        out.println("matris random");
        int numero=0;
        String posicion="";
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                Random z=new Random();
                matris[i][j]=(int)(z.nextInt(10)+1);
                numero=matris[i][j];
                out.print(matris[i][j]+",");
            }
            out.println();
        }
        numero=matris[0][0];
        posicion=""+0+" "+0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                if (numero<matris[i][j]) {
                    numero=matris[i][j];
                    posicion=""+i+" "+j;
                }
            }
        }
        out.println(posicion);
    }
    public static void  imprencionmatris(){
        int[][] matris=new int[3][5];
        out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                Random z=new Random();
                matris[i][j]=(int)(z.nextInt(10)+1);
                out.print(matris[i][j]+",");
            }
            out.println();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5 ;j++) {   
               out.print("F: "+matris[i][j]+",");
            }
        }
        out.println();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {   
               out.print("C: "+matris[j][i]+",");
            }
        }
    }
    public static void matris8(){
    int[][] matris=new int[5][6];
        out.println();
        out.println();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                matris[i][j]=i+j;
                out.print(matris[i][j]+",");
            }
            out.println();
        }
    }
    public static void matrisgrande(){
        out.println("dame el numero");
        Scanner leer= new Scanner(in);
        int n= leer.nextInt();
        out.println("dame el numero");
        int m= leer.nextInt();
        int[][] matris=new int[n][m];
        out.println("primera matris");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Random z=new Random();
                matris[i][j]=(int)(z.nextInt(10)+1);
                out.print(matris[i][j]+",");
            }
            out.println();
        }
        int[]numero=new int[n];
        int numero2=0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                numero[i]+=matris[j][i];
                if (numero[numero2]<numero[i]) {
                    numero2=i;   
                }
            }
        }
        out.println(numero2+" valor columna: "+numero[numero2]);
    }
}
