package com.academiaprogramacion.blog;

import java.util.Hashtable;
import java.util.Map;

public class HashTableEjemplo {

    public static void main(String[] args) {

        // Declaracion del map - HashTable
        Map lenguajes = new Hashtable();

        // Agregamos algunos lenguajes de programacion con el comando put
        lenguajes.put("Visual Basic. NET", 1);
        lenguajes.put("JavaScriot", 5);
        lenguajes.put("PHP", 3);
        lenguajes.put("Perl", 4);
        lenguajes.put("Ruby", 2);

        // Imprimimos la cantidad total de elmentos en el map
        System.out.println("Cantidad total de lenguajes en el map : " + lenguajes.size() + "\n");

        // Hacemos una iteracion sobre todos los lenguajes usando el metodo keySet
        for (Object key:lenguajes.keySet()){
            System.out.println(key + " - " + lenguajes.get(key));
        }

        System.out.println("\n************************\n");

        // Realizamos una busqueda del total de elementos de "C++" dentro del map
        String buscar = "PHP";
        if (lenguajes.containsKey(buscar)){
            System.out.println(lenguajes.get(buscar) + " elementos encontrados de " + buscar);
        }

        System.out.println("\n************************\n");

        // Vamos a borrar los elementos del map
        lenguajes.clear();

        // Mostramos la cantidad de elementos en el map
        System.out.println("Cantidad de elementos en el map : "  + lenguajes.size());

        // HashTable no permite elementos en null, si descomentamos las lineas siguientes, tendremos un error NullPointerException
        // lenguajes.put("Swift", null);
        // lenguajes.put(null, 7);

    }
}
