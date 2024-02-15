package GestionTareas;

public class ComandoTareaCompletada implements Comando {
    private Tarea tarea;

    public ComandoTareaCompletada(Tarea tarea) {
        this.tarea = tarea;
    }

    @Override
    public void ejecutar() {
        tarea.completar();
    }

    @Override
    public void deshacer() {
        tarea.deshacerCompletar();
    }
}
