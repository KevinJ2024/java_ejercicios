/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios_1_13;

/**
 *
 * @author lukit
 */
import javax.swing.JOptionPane;
public class ejercicio_9 {
    public static void main(String[] args) {
        // declarando variables
        int a=20;
        int b=100;
        String nombre="Kevin";
        // arreglo 1
        Integer numeros[];
        numeros = new Integer[3];
        numeros[0]=4;
        numeros[1]=b;
        numeros[2]=a;
        for (int i=0; i < numeros.length; i++){
        System.out.println("numero en la posicion "+i+": "+numeros[i]);
        }
        // arreglo 2
       String nombres[]={"chavo","kico",nombre};
       for (int i=0; i < nombres.length; i++){
        System.out.println("nombre de la posicion "+i+": "+nombres[i]);
        }
       // arreglo 3
       String animales[];
       animales = new String[3];
       
       for (int i=0; i < animales.length; i++){
        animales[i] = JOptionPane.showInputDialog("ingrese un animal");
        System.out.println("animal #"+i+": "+animales[i]);
        }
    }
}
