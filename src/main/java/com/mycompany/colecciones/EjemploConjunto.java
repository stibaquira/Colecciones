import java.util.HashSet;
import java.util.Set;

public class EjemploConjunto {

    public static void main(String[] args) {
        // Creamos un conjunto utilizando HashSet
        Set<String> conjunto = new HashSet<>();

        // Añadir elementos al conjunto
        conjunto.add("Elemento 1");
        conjunto.add("Elemento 2");
        conjunto.add("Elemento 3");

        // Mostrar el conjunto
        System.out.println("Conjunto actual: " + conjunto);

        // Eliminar un elemento del conjunto
        String elementoAEliminar = "Elemento 2";
        conjunto.remove(elementoAEliminar);
        System.out.println("Conjunto después de eliminar: " + conjunto);

        // Editar un elemento en el conjunto
        String elementoAEditar = "Elemento 1";
        String nuevoValor = "Elemento 1 Modificado";
        if (conjunto.contains(elementoAEditar)) {
            conjunto.remove(elementoAEditar);
            conjunto.add(nuevoValor);
        }
        System.out.println("Conjunto después de editar: " + conjunto);

        // Recorrer el conjunto e imprimir sus elementos
        System.out.println("Elementos en el conjunto:");
        for (String elemento : conjunto) {
            System.out.println(elemento);
        }
    }
}
