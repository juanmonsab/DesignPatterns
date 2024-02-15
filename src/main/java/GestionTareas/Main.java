package GestionTareas;

public class Main {
    public static void main(String[] args) {
        GestorTareas gestorTareas = new GestorTareas();

        Tarea tarea1 = new Tarea("Hacer la compra");
        Tarea tarea2 = new Tarea("Enviar correo electrónico");

        gestorTareas.agregarTarea(tarea1);
        gestorTareas.agregarTarea(tarea2);

        gestorTareas.completarTarea(tarea1);
        gestorTareas.completarTarea(tarea2);

        gestorTareas.deshacer();
        gestorTareas.rehacer();
    }
}
