/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciosarreglos;

/**
 *
 * @author usuario1
 */
public class Array_Ejercicio_3 {
    public static void main(String[] args){
       int suma = 0;
       int[] x = new int[100];
       for (int i = 0; i < x.length; i++) {
           x[i] = i+1;
           System.out.println(x[i]);
           suma += i+1;
       }
        System.out.println("La suma da" + " "+ suma);
   }
   }