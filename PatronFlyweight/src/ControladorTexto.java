public class ControladorTexto {
    public static void main(String[] args) {
        String palabra = "banana";

        for (int i = 0; i < palabra.length(); i++) {
            String letra = String.valueOf(palabra.charAt(i));
            FlyweightLetra fly = FabricaLetra.obtenerFlyweight(letra);
            fly.mostrar(new ContextoLetra(i));
        }
    }
}
