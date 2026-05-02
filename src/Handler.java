interface Handler {
    Handler setSiguiente(Handler siguiente);
    void manejar(String req);
}
