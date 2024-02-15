package SistemaEnvio;

public class Main {
    public static void main(String[] args) {
        Envio envioTerrestre = new EnvioTerrestre();
        Envio envioMaritimo = new EnvioMaritimo();
        Envio envioAereo = new EnvioAereo();

        ServicioEnvio envioTerrestreStandard = new ServicioEnvioStardard(envioTerrestre);
        ServicioEnvio envioMaritimoExpress = new ServicioEnvioExpress(envioMaritimo);
        ServicioEnvio envioAereoStandard = new ServicioEnvioStardard(envioAereo);

        envioTerrestreStandard.enviarPaquete();
        envioMaritimoExpress.enviarPaquete();
        envioAereoStandard.enviarPaquete();
    }
}
