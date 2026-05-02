public class Main {
    public static void main(String[] args) {
        Handler cadena = new Nivel1();

        cadena
                .setSiguiente(new Nivel2())
                .setSiguiente(new BaseHandler());

        cadena.manejar("intermedio");
    }
}
