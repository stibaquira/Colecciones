import java.util.LinkedList;
import java.util.Queue;

public class EjemploCola {

    public static void main(String[] args) {
        // Creamos una cola utilizando LinkedList
        Queue<String> cola = new LinkedList<>();

        // Añadir elementos a la cola
        cola.offer("Elemento 1");
        cola.offer("Elemento 2");
        cola.offer("Elemento 3");

        // Mostrar la cola
        System.out.println("Cola actual: " + cola);

        // Eliminar el elemento en la parte frontal de la cola
        String elementoEliminado = cola.poll();
        System.out.println("Elemento eliminado: " + elementoEliminado);
        System.out.println("Cola después de eliminar: " + cola);

        // Editar un elemento en la cola
        String elementoAEditar = "Elemento 2";
        String nuevoValor = "Elemento 2 Modificado";
        if (cola.contains(elementoAEditar)) {
            cola.remove(elementoAEditar);
            cola.offer(nuevoValor);
        }
        System.out.println("Cola después de editar: " + cola);
        
        // Recorrer la cola e imprimir sus elementos
        System.out.println("Elementos en la cola:");
        for (String elemento : cola) {
            System.out.println(elemento);
        }
    }
}
