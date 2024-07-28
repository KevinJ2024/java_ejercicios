/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios_1_13;

/**
 *
 * @author lukit
 */
public class ejercicio_2 {
    public static void main(String[] args) {
        byte numero1 = 20;
        short numero2= 4000;
        
        
        // casting automatico correcto (1)
        numero2=numero1;
        
        //casting manual sin perdida de datos (2)
        short numero3=100;
        numero1=(byte)numero3;
        
        //casting manual con perdida de datos (3)
        double numero4= 5.120;
        numero1=(byte)numero4;
    }
}
