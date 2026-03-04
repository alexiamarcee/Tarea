/**
 * Clase que representa una tarea con una descripcion y un estado de completado.
 */
public class Tarea {
    private String descripcion;
    private boolean completada;
    /**
     * Constructor de la clase Tarea.
     * Por defecto, la tarea se crea como no completada.
     * @param descripcion La descripción de la tarea.
     */
    public Tarea(String descripcion) {
        this.descripcion = descripcion;
        this.completada = false; // Por defecto la tarea no está completada
    }

    /**
     * Obtiene la descripción de la tarea.
     * @return La descripción de la tarea.
     */
    public String getDescripcion() {
        return descripcion;
    }
    /**
     * Cambia la descripción de la tarea.
     * @param descripcion La nueva descripción de la tarea.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    /**
     * Verifica si la tarea está completada.
     * @return true si la tarea está completada, false en caso contrario.
     */
    public boolean isCompletada() {
        return completada;
    }
    /**
     * Marca la tarea como completada.
     */
    public void marcarComoCompletada() {
        this.completada = true;
    }
    /**
     * Metodo toString para mostrar la tarea en formato legible.
     * Muestra un "[X]" si la tarea está completada o "[ ]" si no lo está, seguido de la descripción.
     * @return Una representación en cadena de la tarea.
     */
    @Override
    public String toString() {
        return (completada ? "[X] " : "[ ] ") + descripcion;
    }
}