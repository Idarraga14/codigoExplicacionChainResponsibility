class Nivel1 extends BaseHandler {
    public void manejar(String req) {
        if (req.equals("básico")) {
            System.out.println("Nivel 1 lo resolvió");
        } else {
            super.manejar(req);
        }
    }
}
