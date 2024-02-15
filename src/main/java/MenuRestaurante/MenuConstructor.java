package MenuRestaurante;

import java.util.List;

interface MenuConstructor {
    void construirEntrada();

    void construirPlatoPrincipal();

    void construirPostre();

    void construirBebida();

    List<MenuItem> getMenu();
}
