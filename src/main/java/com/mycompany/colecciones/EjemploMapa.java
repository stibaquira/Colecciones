import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjemploMapa {

    public void map() {
        // Creamos un mapa utilizando HashMap
        Map<String, String> mapa = new HashMap<>();

        // Añadir elementos al mapa
        mapa.put("clave1", "valor1");
        mapa.put("clave2", "valor2");
        mapa.put("clave3", "valor3");

        // Mostrar el mapa
        System.out.println("Mapa actual: " + mapa);

        // Eliminar un elemento del mapa
        String claveAEliminar = "clave2";
        mapa.remove(claveAEliminar);
        System.out.println("Mapa después de eliminar: " + mapa);

        // Editar un elemento en el mapa
        String claveAEditar = "clave1";
        String nuevoValor = "valor1 Modificado";
        if (mapa.containsKey(claveAEditar)) {
            mapa.put(claveAEditar, nuevoValor);
        }
        System.out.println("Mapa después de editar: " + mapa);

        // Recorrer el mapa para obtener todas las claves y sus valores
        Set<String> claves = mapa.keySet();
        System.out.println("Claves en el mapa:");
        for (String clave : claves) {
            String valor = mapa.get(clave);
            System.out.println(clave + " -> " + valor);
        }
    }
}
