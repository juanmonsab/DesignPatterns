package SistemaEnvio;

abstract class ServicioEnvio {
    protected Envio envio;

    public ServicioEnvio(Envio envio) {
        this.envio = envio;
    }

    abstract void enviarPaquete();
}
