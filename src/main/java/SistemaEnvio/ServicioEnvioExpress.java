package SistemaEnvio;

class ServicioEnvioExpress extends ServicioEnvio {
    public ServicioEnvioExpress(Envio envio) {
        super(envio);
    }

    @Override
    void enviarPaquete() {
        System.out.println("Envío express:");
        envio.entregarPaquete();
    }
}
