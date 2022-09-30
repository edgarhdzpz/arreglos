/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciosarreglos;

/**
 *
 * @author usuario1
 */
import java.util.Scanner;
public class Array_Ejercicio_2 {
   public static void main(String [] args){

    //Pedimos por consola el tamaño deseado del array
    Scanner n = new Scanner(System.in);
    System.out.println("Introduce la longitud del array ");
    int tamaño = n.nextInt();

    int array_primos[] = new int[tamaño]; // Creamos el array con el tamaño

    int cantidadPrimos = 0, numero = 0;
    
        while(cantidadPrimos < array_primos.length){

        numero = (int) (Math.random()*100 + 1);

        if(esPrimo(numero) == true){

            array_primos[cantidadPrimos] = numero;
            System.out.println(array_primos[cantidadPrimos]);
            cantidadPrimos++; //Aumentamos el contador para poder rellenar la siguiente posición del array
        }

    }
        for (int x = 0; x < array_primos.length; x++) {
			if (array_primos[x] > cantidadPrimos) {
				cantidadPrimos = array_primos[x];
			}
		}
		System.out.println("El mayor es: " + cantidadPrimos);
    
}

public static boolean esPrimo(int num){ //Función que determina si es primo

        int contador = 2;
        boolean primo = true;

        while(contador < num){

            if(num % contador == 0){
    
                primo = false;
                break;

            }else{

                contador++;
            }
           }
            
        return primo;

}
}