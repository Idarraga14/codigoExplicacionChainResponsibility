class Nivel2 extends BaseHandler {
    public void manejar(String req) {
        if (req.equals("intermedio")) {
            System.out.println("Nivel 2 lo resolvió");
        } else {
            super.manejar(req);
        }
    }
}
