class BaseHandler implements Handler {

    private Handler siguiente;

    public Handler setSiguiente(Handler siguiente) {
        this.siguiente = siguiente;
        return siguiente;
    }

    public void manejar(String req) {
        if (siguiente != null) {
            siguiente.manejar(req);
        }
    }
}
