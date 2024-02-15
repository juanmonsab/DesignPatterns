package MenuRestaurante;

import java.util.ArrayList;
import java.util.List;

class ConstructorMenuRestaurante implements MenuConstructor {
    private List<MenuItem> menu = new ArrayList<>();

    @Override
    public void construirEntrada() {
        menu.add(new MenuItem("Entrada", "Entrada del día", 7000));
    }

    @Override
    public void construirPlatoPrincipal() {
        menu.add(new MenuItem("Plato principal", "Plato principal del día", 15000));
    }

    @Override
    public void construirPostre() {
        menu.add(new MenuItem("Postre", "Postre del día", 4000));
    }

    @Override
    public void construirBebida() {
        menu.add(new MenuItem("Bebida", "Bebida del día", 2500));
    }

    @Override
    public List<MenuItem> getMenu() {
        return menu;
    }
}
