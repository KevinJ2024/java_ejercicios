package com.mycompany.ejercicios_1_13;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lukit
 */
import java.util.Hashtable;
import java.util.Enumeration;
import javax.swing.JOptionPane;

public class ejercicio_12 {
        public static void main(String[] args) {
            // Hashtable 1
            Hashtable <Integer,String> personas = new Hashtable <Integer,String>();
            
            personas.put(001,"pepe");
            personas.put(002,"tilin");
            personas.put(003,"sech");   
            
            System.out.println("impresion de llaves y valores: "+personas);
            
            System.out.println("objeto solicitado mediante la clave asignada: "+personas.get(002));
            
            System.out.println("longitud del hashtable: "+personas.size());
            
            personas.remove(002);
            
            System.out.println("hashtabla despues de eliminar un objeto por su clave: "+personas);
            
            // Hashtable 2
            int cantidad = Integer.parseInt(JOptionPane.showInputDialog("ingrese la logintud del hashtable para el ejemplo 2"));
            Hashtable<Integer,String> objetos = new Hashtable <Integer,String>();
            
            for (int i=0; i < cantidad; i++) {
                Integer clave = Integer.parseInt(JOptionPane.showInputDialog("ingrese la clave"));
                String nombre = JOptionPane.showInputDialog("ingrese el nombre a asignar");
                objetos.put(clave, nombre);
                System.out.println(objetos.get(clave));
            }    
            
            // Hashtable 3
            
            Hashtable<Integer,String> verduras = new Hashtable <Integer,String>();
            
            verduras.put(4,"cebolla");
            verduras.put(2,"guisantes");
            verduras.put(7,"zanahoria");
            
            Enumeration <String> valores = verduras.elements();
            Enumeration <Integer> claves = verduras.keys();
            
            while(valores.hasMoreElements()){
                System.out.println("llave del objeto: "+claves.nextElement()+" valores string: "+valores.nextElement());
            }
        }
}
