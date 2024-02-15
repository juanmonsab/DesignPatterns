package GestionTareas;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GestorTareas {
    private final Stack<Comando> historialComando = new Stack<>();
    private final Stack<Comando> deshacerComando = new Stack<>();
    private final List<Tarea> tareas = new ArrayList<>();

    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
        historialComando.push(new ComandoTareaCreada(this, tarea.getDescripcion()));
    }

    public void eliminarTarea(Tarea tarea) {
        tareas.remove(tarea);
        historialComando.push(new ComandoTareaEliminada(this, tarea));
    }

    public void completarTarea(Tarea tarea) {
        tarea.completar();
        historialComando.push(new ComandoTareaCompletada(tarea));
    }

    public void deshacer() {
        if (!historialComando.isEmpty()) {
            Comando comando = historialComando.pop();
            comando.deshacer();
            deshacerComando.push(comando);
        } else {
            System.out.println("No hay acciones por deshacer.");
        }
    }

    public void rehacer() {
        if (!deshacerComando.isEmpty()) {
            Comando comando = deshacerComando.pop();
            comando.ejecutar();
            historialComando.push(comando);
        } else {
            System.out.println("No hay acciones por rehacer.");
        }
    }
}
