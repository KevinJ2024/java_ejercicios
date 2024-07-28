/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios_1_13;

/**
 *
 * @author lukit
 */
import java.util.ArrayList;
public class ejercicio_11 {
    public static void main(String[] args) {
        // array list 1
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(3);
        numeros.add(2);
        numeros.add(7);
        System.out.println("prueba anadir numeros: "+numeros);
        numeros.set(2,4);
        System.out.println("prueba remplazar numeros: "+numeros);
        
        // array list 2
        ArrayList<String> personas = new ArrayList<String>();
        personas.add("german");
        personas.add("brayan");
        personas.add("gustavo");
        System.out.println("prueba valores String: "+personas);
        numeros.remove(2);
        System.out.println("prueba eliminar numeros: "+numeros);
        personas.clear();
        System.out.println("prueba eliminar todo el arraylist: "+personas);
        
        //array list 3
        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("ptolomeo");
        nombres.add("zapoteos");
        nombres.add("goku");
        System.out.println("nombre que se imprimira por medio de la posicion: "+nombres.get(2)); // imprimir el valor que esta en esa posicion
        System.out.println("posicion del valor solicitado: "+nombres.indexOf("ptolomeo")); // imprime la posicion del valor ingresado
        System.out.println("longitud de el arraylist: "+nombres.size());
        boolean v_f = nombres.contains("goku"); // verifica si el valor se encuentra dentro del array
        System.out.println("resultado: "+v_f);
    }   
}
