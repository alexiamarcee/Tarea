import java.util.ArrayList;

/**
 * Clase que gestiona una lista de tareas.
 * Permite añadir tareas y mostrarlas por consola.
 *
 */
public class GestorTareas {
    private ArrayList<Tarea> tareas;
    /**
     * Muestra por consola todas las tareas almacenadas.
     * Indica el número de tarea, su descripción y si está completada o pendiente.
     * Si no hay tareas, muestra un mensaje informativo.
     */
    public void mostrarTareas() {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas registradas.");
            return;
        }

        System.out.println("\n--- LISTA DE TAREAS ---");
        for (int i = 0; i < tareas.size(); i++) {
            Tarea t = tareas.get(i);
            String estado = t.isCompletada() ? "Completada" : "Pendiente";
            System.out.println((i + 1) + ". " + t.getDescripcion() + " [" + estado + "]");
        }
        System.out.println("-----------------------\n");
    }
}