package com.academiaprogramacion.blog;

import java.util.TreeMap;

public class TreeMapEjemplo {

    public static void main(String[] args) {

        // Declaracion del map - TreeMap
        TreeMap lenguajes = new TreeMap();


        // Agregamos algunos lenguajes de programacion con el comando put
        lenguajes.put("Java", 1);
        lenguajes.put("C#", 5);
        lenguajes.put("C++", 3);
        lenguajes.put("Phyton", 4);
        lenguajes.put("C", 2);

        // Imprimimos la cantidad total de elmentos en el map
        System.out.println("Cantidad total de lenguajes en el map : " + lenguajes.size() + "\n");

        // Hacemos una iteracion sobre todos los lenguajes usando el metodo keySet
        for (Object key:lenguajes.keySet()){
            System.out.println(key + " - " + lenguajes.get(key));
        }

        System.out.println("\n************************\n");

        System.out.println("Primer lenguaje de programacion en orden alfabetico : " + lenguajes.firstKey());
        System.out.println("Ultimo lenguaje de programacion en orden alfabetico : " + lenguajes.lastKey());

        System.out.println("\n************************\n");

        // Vamos a borrar los elementos del map
        lenguajes.clear();

        // Mostramos la cantidad de elementos en el map
        System.out.println("Cantidad de elementos en el map : "  + lenguajes.size());
    }
}
