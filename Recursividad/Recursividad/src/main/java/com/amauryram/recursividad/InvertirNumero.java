/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.amauryram.recursividad;

/**
 *
 * @author amaur
 */
public class InvertirNumero {
    
    public int getInvertirNumero(int n){
        return invertirNumero(n, (int)Math.log10(n));
    }
    
    private int invertirNumero(int n, int p){
        if(n == 0){
            return n%10; 
        }else{
            return (n % 10) * (int) Math.pow(10, p) + (invertirNumero(n/10, p-1));
        }
         
    }
    
}
