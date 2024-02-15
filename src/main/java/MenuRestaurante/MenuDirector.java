package MenuRestaurante;

class MenuDirector {
    public void constructor(MenuConstructor constructor) {
        constructor.construirEntrada();
        constructor.construirPlatoPrincipal();
        constructor.construirPostre();
        constructor.construirBebida();
    }
}
