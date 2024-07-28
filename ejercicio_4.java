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
public class ejercicio_4 {
    public static void main(String[] args) {
        // declarando variables
        int numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero entero del 1 al 3"));
        String texto = JOptionPane.showInputDialog("ingrese a, b o c");
        String v_f = JOptionPane.showInputDialog("ingrese true o false");
        //usando switch case (1)
        switch(numero){
            case 1: JOptionPane.showMessageDialog(null, "ingresaste el numero 1");
                break;
            case 2: JOptionPane.showMessageDialog(null, "ingresaste el numero 2");
                break;
            case 3: JOptionPane.showMessageDialog(null, "ingresaste el numero 3");
                break;
            default: JOptionPane.showMessageDialog(null,"numero invalido");
        }
        //usando switch case (2)
        switch(texto){
        case "a": JOptionPane.showMessageDialog(null, "ingresaste la letra a");
            break;
        case "b": JOptionPane.showMessageDialog(null, "ingresaste la letra b");
            break;
        case "c": JOptionPane.showMessageDialog(null, "ingresaste la letra c");
            break;
        default: JOptionPane.showMessageDialog(null,"letra no valida");
        }
        //usando switch case (3)
        switch (v_f){
            case "true": JOptionPane.showMessageDialog(null,"respuesta verdadera");; 
                break;
            case "false":JOptionPane.showMessageDialog(null,"respuesta falsa");;
                break;
            default: JOptionPane.showMessageDialog(null,"opcion no valida");;
        }
    }
}
