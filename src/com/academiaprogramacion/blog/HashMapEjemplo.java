package com.academiaprogramacion.blog;

import com.oracle.tools.packager.mac.MacAppBundler;

import java.util.HashMap;
import java.util.Map;

public class HashMapEjemplo {

    public static void main(String[] args) {

        // Declaracion del map - HashMap
        Map lenguajes = new HashMap();

        // Agregamos algunos lenguajes de programacion con el comando put
        lenguajes.put("Java", 1);
        lenguajes.put("C#", 5);
        lenguajes.put("C++", 3);
        lenguajes.put("Phyton", 4);
        lenguajes.put("C", 2);
        // HashMap permite claves (key) o valores (values) vacios (null)
        lenguajes.put("Swift", null);
        lenguajes.put(null, 7);

        // Imprimimos la cantidad total de elmentos en el map
        System.out.println("Cantidad total de lenguajes en el map : " + lenguajes.size() + "\n");

        // Hacemos una iteracion sobre todos los lenguajes usando el metodo keySet
        for (Object key:lenguajes.keySet()){
            System.out.println(key + " - " + lenguajes.get(key));
        }

        System.out.println("\n************************\n");

        // Realizamos una busqueda del total de elementos de "C++" dentro del map
        String buscar = "C++";
        if (lenguajes.containsKey(buscar)){
            System.out.println(lenguajes.get(buscar) + " elementos encontrados de " + buscar);
        }

        System.out.println("\n************************\n");

        // Vamos a borrar los elementos del map
        lenguajes.clear();

        // Mostramos la cantidad de elementos en el map
        System.out.println("Cantidad de elementos en el map : "  + lenguajes.size());

    }
}
