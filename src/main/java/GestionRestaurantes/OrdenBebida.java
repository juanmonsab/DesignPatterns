package GestionRestaurantes;

class OrdenBebida extends ProcesadorOrden {
    @Override
    void tomarOrden() {
        System.out.println("Tomando pedido de bebida.");
    }

    @Override
    void verificarDispinibilidad() {
        System.out.println("Verificando disponibilidad de bebidas.");
    }

    @Override
    void calcularPrecio() {
        System.out.println("Calculando precio de bebida.");
    }

    @Override
    void preparar() {
        System.out.println("Preparando bebida.");
    }

    @Override
    void entregar() {
        System.out.println("Entregando bebida.");
    }
}
