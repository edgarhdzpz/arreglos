/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciosarreglos;

/**
 *
 * @author usuario1
 */
public class Ejercicio2 {
    public static void main(String[] args) { //Crear el método main
        
//Creo un array
int[] numeros=new int[100];
//Declaro las variables necesarias
int suma=0;
double media;
//Recorro el arreglo, asigno números y sumo
for(int i=0;i<numeros.length;i++){
numeros[i]=i+1;
suma+=numeros[i];
}
//Calculo la media y muestro la suma y la meda
System.out.println("La suma es "+suma);
media=(double)suma/numeros.length;
System.out.println("La media es "+media);
}
}
