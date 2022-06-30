/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.amauryram.recursividad;

/**
 *
 * @author amaur
 */
public class PiramideRecursiva {
    
    int v;
    int i,j,h;
    String cadena = "";
    
    
    PiramideRecursiva(){
        this.i=this.j=this.h=1;
    }
    
    public void getPiramide(int v){
        this.v = v;
        imprimePiramide();
        
    }
    
    
    
    private void imprimePiramide(){
        if(i<=v){
            if(j>i){
                j=1;
                i++;
                System.out.println(cadena);
                cadena = "";
                imprimePiramide();
            }else{
            cadena = cadena + "*";
            j++;
            imprimePiramide();
            }
        }
    }
}
