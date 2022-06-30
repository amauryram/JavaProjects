/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.amauryram.recursividad;

import java.util.ArrayList;

/**
 *
 * @author amaur
 */
public class Recursividad {

    public static void main(String[] args) {

        ArrayList<Integer> info = new ArrayList();
        info.add(10);
        info.add(12);
        info.add(32);
        info.add(6);
        info.add(46);
        info.add(65);
        info.add(98);
        info.add(345);
        info.add(54);
        info.add(34);
        
        int[][] m = {{1,2,3},{4,5,6},{7,8,9}};
        
        //Suma Números naturales de forma recursiva, dandole n como límite
        /*SumaNum primersuma = new SumaNum();
        System.out.println(primersuma.getSuma(50));
        */
        //
        /*Factorial resFactorial = new Factorial();
        System.out.println(resFactorial.getFactorial(7));
        */
        /*BuscaArray resBuscaArray = new BuscaArray(info);
        System.out.println("El dato se encontró en índice:" + 
                resBuscaArray.buscaDato(555));
        */
        
       /*RecorreMatriz resRecorreMat = new RecorreMatriz();
       resRecorreMat.getMatriz(m, 0, 0);
       */
       
       /*PiramideRecursiva resPiramide = new PiramideRecursiva();
       resPiramide.getPiramide(15);
       */
       
       //Calcular el valor de la posición fibonacci usando recursividad. 
       //Fibonacci resFibonacci = new Fibonacci();
       //System.out.println(resFibonacci.getFibonacci(12));
       
       //Invertir número de forma recursiva
       //InvertirNumero resInvNum = new InvertirNumero();
       //System.out.println(resInvNum.getInvertirNumero(123456789));
       
       //Invertir palabra de forma recursiva
       //InvertirPalabra resInvertir = new InvertirPalabra();
       //System.out.println(resInvertir.getPalabra("comadreja"));
        
       Potencia resPotencia = new Potencia();
       System.out.println(resPotencia.getPotencia(-1, 3));
       
    }
    
    
}
