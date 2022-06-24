/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.amauryram.recursividad;

/**
 *
 * @author amaur
 */
public class SumaNum {
    
    
    SumaNum(){
    }
    
    public int getSuma(int limite){
        System.out.println("Suma para: "+ limite);
        if(limite <= 0){
            System.out.println("Ingresa numero Naturales (Mayor a 0)");
            return 0;
        }
        return calculaSuma(limite);
    }
    
    private int calculaSuma(int n){
        if(n<=0){
            return 0;
        }else{
            n = n + calculaSuma(n-1);
            return n;
        }
    }
            
    
    
}
