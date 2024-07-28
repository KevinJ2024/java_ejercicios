/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios_1_13;

/**
 *
 * @author lukit
 */
public class ejercicio_3 {
    public static void main(String[] args) {
        // definimos variables
        int x=300;
        int y=20;
        // estructura de control if (1)
        if (x > y){
            System.out.println("resultado del if: x es mayor que y");// resultado en consola
        }
        // estructura de control else (2)
        if (x < y){
            System.out.println("resultado del if con else (true): x es menor que y ");
        }else{
            System.out.println("resultado del if con else (false): x es mayor que y"); // resultado en consola
        }
        // estructura de control anidada (3)
        if(x > y){
            int z = y+280;
            if(z == x){
                System.out.println("resultado del if anidado (true): z es igual a x");
            }else{
                System.out.println("resultado del if anidado (false): z no es igual a x");
            }
        }else {
            System.out.println("x es menor que y");
        }
    }
}
