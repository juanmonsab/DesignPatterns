package GestionRestaurantes;

public class Main {
    public static void main(String[] args) {
        ProcesadorOrden ordenComidaProcesador = new OrdenComida();
        ProcesadorOrden ordenBebidaProcesador = new OrdenBebida();
        ProcesadorOrden ordenPostreProcesador = new OrdenPostre();

        System.out.println("Procesando orden de comida:");
        ordenComidaProcesador.procesarOrden();

        System.out.println("\nProcesando orden de bebida:");
        ordenBebidaProcesador.procesarOrden();

        System.out.println("\nProcesando orden de postre:");
        ordenPostreProcesador.procesarOrden();
    }
}