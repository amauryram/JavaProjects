/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.amauryram.recursividad;

/**
 *
 * @author amaur
 */
public class RecorreMatriz {
    
    
    public void getMatriz(int[][] m, int i, int j){
        imprimeMat(m, i, j);
    }
    
    private void imprimeMat(int[][] m, int i, int j){
        
         //Muestro el numero (sin salto de linea)
        System.out.print(m[i][j] + " ");
 
        //
        if (i != m.length - 1 || j != m[i].length - 1) {
 
            //Indico si llego al final de la fila
            if (j == m[i].length - 1) {
                //Paso a la siguiente fila
                i++;
                //Reinicio la j
                j = 0;
                //Salto de linea (solo formato)
                System.out.println("");
            } else {
                //Paso a la siguiente columna
                j++;
            }

            //Volvemos a llamar la función recursivamente
            imprimeMat(m, i, j);
 
        }
    
    } 
    
    
}
