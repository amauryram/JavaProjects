/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.amauryram.recursividad;

import java.util.ArrayList;

/**
 *
 * @author amaur
 */
public class BuscaArray {

    ArrayList<Integer> arreglo = new ArrayList();
    int tamanio = 0;
    
    BuscaArray(ArrayList<Integer> Datos){
        this.arreglo = Datos;
        this.tamanio = Datos.size()-1;
    }
    
    public void imprimeArreglo(){
        System.out.println(arreglo);
    }
    
    public int buscaDato(int Dato){
        return BuscaElemento(tamanio, Dato)+1;
    }
    
    private int BuscaElemento(int tamanio, int Dato){
        System.out.println("tamanio: "+ tamanio + " \nDato: " + Dato);
        System.out.println("Dato a buscar: " + arreglo.get(tamanio));
        if( Dato == arreglo.get(tamanio))
            return tamanio;
        else if(tamanio <= 1)
            return -1;
        else return tamanio = BuscaElemento(tamanio-1,Dato);
    }
    
}
