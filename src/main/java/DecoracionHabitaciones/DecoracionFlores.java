package DecoracionHabitaciones;

class DecoracionFlores extends DecoradorHabitacion {
    public DecoracionFlores(DecoracionHabitacion habitacionDecorada) {
        super(habitacionDecorada);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", con flores frescas";
    }

    @Override
    public double costo() {
        return super.costo() + 130000;
    }
}
