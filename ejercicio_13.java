/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios_1_13;

/**
 *
 * @author lukit
 */
import java.util.HashMap;
import java.util.Iterator;
public class ejercicio_13 {
        public static void main(String[] args) {
            // HashMap 1
            HashMap <Integer,String> cubiertos = new HashMap<Integer,String>();
            
            cubiertos.put(1,"cuchara");
            cubiertos.put(2,"tenedor");
            cubiertos.put(3,null);
            
            System.out.println("llaves y valores: "+cubiertos);
            
            // HashMap 2
            HashMap <Integer,String> papulinces = new HashMap<Integer,String>();
            
            papulinces.put(4,"coco");
            papulinces.put(9,"kafka");
            
            if (papulinces.containsValue("kafka")){
               System.out.println("lo contiene");
            }else{
            System.out.println("no lo contiene"); 
            }
            
            // HashMap 3
            HashMap <Integer,String> tilines = new HashMap<Integer,String>();

            tilines.put(40,null);
            tilines.put(21,"mukasa");
            
            Iterator <Integer> llaves = tilines.keySet().iterator();
            
            while(llaves.hasNext()){
                Integer clave = llaves.next();
                System.out.println("llave: "+clave+" valor: "+tilines.get(clave));
            }
        }
}
