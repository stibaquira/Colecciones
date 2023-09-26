//Autor: Nestor Bolivar
//Ejemplo sobre colecciones
package com.mycompany.colecciones;

import java.util.*;

public class Colecciones {

  public static void main(String[] args) {
    
    // ArrayLists
    // - Acceso indexado (acceder elemento por índice)
    // - Tamaño dinámico
    // - Permite duplicados
    // - Implementación con array redimensionable 
    List<String> arrayList = new ArrayList<>();
    arrayList.add("uno");
    arrayList.add("dos");
    arrayList.add("tres");
    arrayList.add("cuatro");
    
    
    
    System.out.println("ArrayList: " + arrayList);
    
    // Accediendo a elementos específicos 
    String elemento1 = arrayList.get(0); 
    String elemento4 = arrayList.get(3);
    System.out.println("Primer elemento: " + elemento1);
    System.out.println("Ultimo elemento: " + elemento4);
    
    // Remover elementos
    String elementoRemovido = arrayList.remove(1);
    System.out.println("Elemento removido: " + elementoRemovido);
    
    // Recorrer la lista
    for(String elemento : arrayList) {
      System.out.println(elemento);
    }
    
    
    // LinkedLists
    
    // 
    // - Acceso secuencial (head y tail) 
    // - Tamaño dinámico
    // - Permite duplicados
    // - Implementación con nodos enlazados (doblemente enlazada)
    LinkedList<Integer> linkedList = new LinkedList<>();
    linkedList.add(1);
    linkedList.add(2);
    linkedList.add(3);

    System.out.println("LinkedList: " + linkedList);
    
    // Acceder al head y tail
    int head = linkedList.getFirst();
    int tail = linkedList.getLast();
    
    System.out.println("Head: " + head); 
    System.out.println("Tail: " + tail);
    
    // Recorrer la lista
    
    for(Integer elemento : linkedList) {
      System.out.println(elemento);
    }
    //Implementacion iterator
    
    Iterator <Integer> iterador = linkedList.iterator();
    
    while(iterador.hasNext()){
        System.out.println("valor: "+ iterador.next());
        
    }
    

    // HASHSET 
    // - No tiene índices  
    // - No permite duplicados 
    // - Implementación con hash table
    // - Búsquedas y operaciones rápidas
    Set<Integer> hashSet = new HashSet<>();
    hashSet.add(1);
    hashSet.add(2);
    hashSet.add(2); // no se permite duplicados
    
    System.out.println("HashSet: " + hashSet);
    
    // Verificar pertenencia 
    if(hashSet.contains(1)) {
      System.out.println("1 está en el HashSet");
    }
    
    
    // HASHMAP
    // - Estructura clave-valor
    // - No permite claves duplicadas
    // - Búsquedas rápidas por clave 
    // - Implementación con hash table
    Map<String, String> hashMap = new HashMap<>();
    hashMap.put("clave1", "valor1");
    hashMap.put("clave2", "valor2");
    hashMap.put("clave3", "valor3");
    
    System.out.println("HashMap: " + hashMap);  
    
    // Acceder a valores
    String valor2 = hashMap.get("clave2"); 
    System.out.println("Valor clave2: " + valor2);
    
    // Recorrer el mapa
    for(Map.Entry<String, String> entrada : hashMap.entrySet()) {
      String clave = entrada.getKey();
      String valor = entrada.getValue();
      
      System.out.println(clave + ":" + valor);
    }
  }

}