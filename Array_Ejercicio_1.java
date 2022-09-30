/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciosarreglos;

/**
 *
 * @author usuario1
 */
//import javax.swing.JOptionPane;
import java.util.Scanner;
public class Array_Ejercicio_1 {
    public static void main(String[] args) { //Crear el método main
        Scanner e=new Scanner(System.in);
        int num [] = new int[15];
        for(int i=0;i<num.length;i++){
            System.out.println("Ingrese 15 números distintos");
            num[i]=e.nextInt();
        }
        for(int i=0;i<num.length;i++) {
            System.out.println("Indice: "+i+ " "+ "valor"+num[i]);
        }
    }
}