/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.amauryram.recursividad;

/**
 *
 * @author amaur
 */
public class Potencia {
    
    public int getPotencia(int b, int p){
        return calcPotencia(b, p);
    }
    
    private int calcPotencia(int b, int p){
        if (p==1)
            return b;
        else
            return b*calcPotencia(b,p-1);
    }
}
