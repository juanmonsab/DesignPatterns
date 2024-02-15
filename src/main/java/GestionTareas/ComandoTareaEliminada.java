package GestionTareas;

public class ComandoTareaEliminada implements Comando {
    private final Tarea tarea;
    private final GestorTareas gestorTareas;

    public ComandoTareaEliminada(GestorTareas gestorTareas, Tarea tarea) {
        this.gestorTareas = gestorTareas;
        this.tarea = tarea;
    }

    @Override
    public void ejecutar() {
        gestorTareas.eliminarTarea(tarea);
    }

    @Override
    public void deshacer() {
        gestorTareas.agregarTarea(tarea);
    }
}
