/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.amauryram.recursividad;

/**
 *
 * @author amaur
 */
public class InvertirPalabra {
    
    public String getPalabra(String cadena){
        return invertirPalabra(cadena, cadena.length()-1);
    }
    
    private String invertirPalabra(String cadena,int tam){
        if (tam == 0){
            return cadena;
        }else{
            return cadena.substring(tam).concat(invertirPalabra(cadena.substring(0,tam),tam-1));
        }
    }
}
