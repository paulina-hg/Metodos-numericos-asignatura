public class ErrorPrecisiónPuntoFlotante {

    public static void main(String[] args) {
        int resultado = 1;

        for (int i = 1; i <= 5; i++) {
            resultado = resultado * 10;
        }

        System.out.println(resultado);
        System.out.println(2.55 * resultado);
    }
}