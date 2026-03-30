import net.salesianos.personaje;

public class App {
    public static void main(String[] args) {
        personaje p1 = new personaje("Eldrin", 1);
        p1.entrenar(5);
        p1.gastarEnergia(20);
        p1.mostrarInfo();
        personaje.mostrarTotalPersonajes();
    }
}