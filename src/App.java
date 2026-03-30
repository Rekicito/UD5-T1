import net.salesianos.guerrero;
import net.salesianos.mago;
import net.salesianos.personaje;

public class App {
    public static void main(String[] args) {
        personaje p1 = new personaje("Eldrin", 3);
        p1.entrenar(5);
        p1.gastarEnergia(30);
        p1.mostrarInfo();
        personaje.mostrarTotalPersonajes();

        guerrero g1 = new guerrero("Thorak", 5, "Espada");
        g1.ataquePesado();
        g1.descansar(10);
        g1.mostrarInfo();
        personaje.mostrarTotalPersonajes();

        mago m1 = new mago("Lyra", 4, "Fuego");
        m1.ataqueElemental();
        m1.entrenar(2);
        m1.mostrarInfo();
        personaje.mostrarTotalPersonajes();

        personaje[] reino = new personaje[3];

        reino[0] = p1;
        reino[1] = g1;
        reino[2] = m1;

        for (int i = 0; i < reino.length; i++) {
            reino[i].mostrarInfo();
        }
    }

}