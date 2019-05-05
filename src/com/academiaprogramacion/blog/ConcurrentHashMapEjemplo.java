package com.academiaprogramacion.blog;

import java.util.Enumeration;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapEjemplo {

    public static void main(String[] args) {

        // Declaracion del map - ConcurrentHashMap
        ConcurrentHashMap lenguajes = new ConcurrentHashMap();

        // Agregamos algunos lenguajes de programacion con el comando put
        lenguajes.put("Visual Basic", 1);
        lenguajes.put("R", 5);
        lenguajes.put("MATLAB", 3);
        lenguajes.put("Scratch", 4);
        lenguajes.put("PL/SQL", 2);

        // Imprimimos la cantidad total de elmentos en el map
        System.out.println("Cantidad total de lenguajes en el map : " + lenguajes.size() + "\n");

        // Hacemos una iteracion sobre todos los lenguajes usando el metodo keySet
        for (Object key:lenguajes.keySet()){
            System.out.println(key + " - " + lenguajes.get(key));
        }

        System.out.println("\n************************\n");

        // Realizamos una busqueda del total de elementos de "MATLAB" dentro del map
        String buscar = "MATLAB";
        if (lenguajes.containsKey(buscar)){
            System.out.println(lenguajes.get(buscar) + " elementos encontrados de " + buscar);
        }

        System.out.println("\n************************\n");

        // Utilizamos Enumeration para imprimir los valores
        Enumeration elementos = lenguajes.elements();
        while (elementos.hasMoreElements()){
            System.out.println(elementos.nextElement());
        }

        System.out.println("\n************************\n");

        // Agregar elemento en el map
        // En caso de que ya exista el elemento en el map
        Integer valor = (Integer) lenguajes.putIfAbsent("MATLAB", 15);
        if (valor != null){
            System.out.println("MATLAB ya existe en el map");
        }
        // En caso de que no exista el elemento en el map
        valor = (Integer) lenguajes.putIfAbsent("Java", 42);
        if (valor == null){
            System.out.println("Java no se ha encontrado en el map, entonces se ha agregado");
        }

        System.out.println("\n************************\n");

        // Hacemos una iteracion sobre todos los lenguajes usando el metodo keySet para ver lo que se ha agregado
        for (Object key:lenguajes.keySet()){
            System.out.println(key + " - " + lenguajes.get(key));
        }

        System.out.println("\n************************\n");

        // Vamos a borrar los elementos del map
        lenguajes.clear();

        // Mostramos la cantidad de elementos en el map
        System.out.println("Cantidad de elementos en el map : "  + lenguajes.size());

    }

}
