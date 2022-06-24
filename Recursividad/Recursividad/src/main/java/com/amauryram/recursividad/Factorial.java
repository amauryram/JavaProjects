/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.amauryram.recursividad;

/**
 *
 * @author amaur
 */
public class Factorial {
    
    public int getFactorial(int numero){
        return calcFactorial(numero);
    }
    
    private int calcFactorial(int numero){
        int resultado;
        if(numero<=0)
            return 1;
        else{
            resultado = numero * calcFactorial(numero-1);
            return resultado;
        }
    }
}
