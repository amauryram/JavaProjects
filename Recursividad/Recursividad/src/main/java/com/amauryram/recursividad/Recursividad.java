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
        
        /*System.out.println("/////////////////////////////////////");
        System.out.println("//         Elige la opción         //");
        System.out.println("/////////////////////////////////////");
        System.out.println("\n");
        System.out.println("1. Suma de números naturales (1+2+3+...+n)");
        */
        //SumaNum primersuma = new SumaNum();
        //System.out.println(primersuma.getSuma(50));
        
        //Factorial resFactorial = new Factorial();
        //System.out.println(resFactorial.getFactorial(7));
        
        BuscaArray resBuscaArray = new BuscaArray(info);
        System.out.println("El dato se encontró en índice:" + resBuscaArray.buscaDato(555));
        
        
        
        
        
        
    }
}
