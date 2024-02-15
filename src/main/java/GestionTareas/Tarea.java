package GestionTareas;

public class Tarea {
    private String descripcion;
    private boolean completa;

    public Tarea(String descripcion) {
        this.descripcion = descripcion;
        this.completa = false;
    }

    public void completar() {
        this.completa = true;
        System.out.println("Tarea completada: " + descripcion);
    }

    public void deshacerCompletar() {
        this.completa = false;
        System.out.println("Tarea desmarcada como completada: " + descripcion);
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isCompleta() {
        return completa;
    }

    public void setCompleta(boolean completa) {
        this.completa = completa;
    }
}
