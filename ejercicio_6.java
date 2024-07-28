/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios_1_13;

/**
 *
 * @author lukit
 */
public class ejercicio_6 {
    public static void main(String[] args) {
        // declarando variables
        int prueba1 = 0;
        int prueba2 = 5;
        int prueba3 = 0;
        //ciclo do while (1)
        do{
            System.out.println("(1) resultado prueba1: "+prueba1);
            prueba1++;
        }while(prueba1 < 4);
        //ciclo do while (2)
        do{
            System.out.println("(2) resultado prueba2: "+prueba2);
            prueba2--;
        }while(prueba2 >= 2);
        //ciclo do while (3)
        do{
            System.out.println("(3) resultado prueba3: "+prueba3);
            prueba3++;
        }while(prueba3 == 0);
    }
}
