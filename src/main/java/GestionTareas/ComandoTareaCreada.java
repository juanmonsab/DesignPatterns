package GestionTareas;

public class ComandoTareaCreada implements Comando {
    private Tarea tarea;
    private GestorTareas gestorTareas;

    public ComandoTareaCreada(GestorTareas gestorTareas, String descripcion) {
        this.gestorTareas = gestorTareas;
        this.tarea = new Tarea(descripcion);
    }

    @Override
    public void ejecutar() {
        gestorTareas.agregarTarea(tarea);
    }

    @Override
    public void deshacer() {
        gestorTareas.eliminarTarea(tarea);
    }
}
