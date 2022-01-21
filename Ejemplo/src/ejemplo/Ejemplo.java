/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

import org.apache.commons.lang3.RandomUtils;

/**
 *
 * @author reroes
 */
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a= 100;
        int b= 110; 
        String cadena = " ";
        int[] g= new int[10];
        
        for(int i=0;i<g.length;i++){
         g[i] = obtenerArreglo(a, b);
         cadena = String.format("El valor es: %d", g[i]);
         System.out.println(cadena);
        
        
        }
        
    }
    public static int obtenerArreglo(int a, int b){
        int f = 0;
        f = RandomUtils.nextInt(a,b);
            return f;
}
}
