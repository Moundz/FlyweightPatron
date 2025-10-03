public class LetraConcreta implements FlyweightLetra {
    private final String caracter;

    public LetraConcreta(String caracter) {
        this.caracter = caracter;
    }

    @Override
    public void mostrar(ContextoLetra contexto) {
        System.out.println("Letra: " + caracter + " en posición: " + contexto.getPosicion());
    }

    public String obtenerCaracter() {
        return caracter;
    }
}
