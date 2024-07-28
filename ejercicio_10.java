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
public class ejercicio_10 {
    public static void main(String[] args) {
        //declarando los arreglos
        int longitud = Integer.parseInt(JOptionPane.showInputDialog("ingrese la longitud de los arreglos a sumar"));
        int arreglo1[] = new int [longitud];
        int arreglo2[] = new int [arreglo1.length];
        int resultadoSuma[] = new int [longitud];
        int resultadoResta[] = new int [longitud];
        int resultadoMultiplicacion[] = new int [longitud];

        // obteniendo numeros
        
        for (int i=0; i< arreglo1.length; i++){
            arreglo1[i] = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero "+i+" del arreglo 1"));
            System.out.println("numeros escojidos arreglo 1 #"+i+": "+arreglo1[i]);
        }
        for (int i=0; i< arreglo2.length; i++){
            arreglo2[i] = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero "+i+" del arreglo 2"));
            System.out.println("numeros escojidos arreglo 2 #"+i+": "+arreglo2[i]);

        }
        
        // suma
        
        for (int i=0; i< resultadoSuma.length; i++){
            resultadoSuma[i] = arreglo1[i]+arreglo2[i];
            System.out.println("resultado de la suma #"+i+" = "+resultadoSuma[i]);
        }
        
        // resta
        
        for (int i=0; i< resultadoResta.length; i++){
            resultadoResta[i] = arreglo1[i]-arreglo2[i];
            System.out.println("resultado de la resta #"+i+" = "+resultadoResta[i]);
        }
        
        // multiplicacion
        
        for (int i=0; i< resultadoMultiplicacion.length; i++){
            resultadoMultiplicacion[i] = arreglo1[i]*arreglo2[i];
            System.out.println("resultado de la multiplicacion #"+i+" = "+resultadoMultiplicacion[i]);
        }
    }
}
