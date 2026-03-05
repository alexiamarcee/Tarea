import java.util.ArrayList;

/**
 * Clase que gestiona las tareas.
 */
public class GestorTareas {

    private ArrayList<Tarea> tareas = new ArrayList<>();

    /**
     * Añade una tarea nueva.
     * @param descripcion descripcion de la tarea
     */
    public void añadirTarea(String descripcion) {
        Tarea tarea = new Tarea(descripcion);
        tareas.add(tarea);
    }

    public ArrayList<Tarea> getTareas() {
        return tareas;
    }
}