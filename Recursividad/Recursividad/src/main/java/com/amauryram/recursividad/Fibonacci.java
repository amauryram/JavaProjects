/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.amauryram.recursividad;

/**
 *
 * @author amaur
 */
public class Fibonacci {
    
    int resultado;
    
    Fibonacci(){
        this.resultado = 0;
    }
    
    public int getFibonacci(int i){
        this.resultado = 0;
        return calcFibonacci(i);
    }

    private int calcFibonacci(int i) {
        if (i == 1)
            return 1;
        else if(i==0){
            return 0;
        }
        else{
            return resultado = calcFibonacci(i-1) + calcFibonacci(i-2);
        }
    }
    
}
