package DecoracionHabitaciones;

class DecoracionChocolate extends DecoradorHabitacion {
    public DecoracionChocolate(DecoracionHabitacion habitacionDecorada) {
        super(habitacionDecorada);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", con chocolate gourmet";
    }

    @Override
    public double costo() {
        return super.costo() + 75000;
    }
}
