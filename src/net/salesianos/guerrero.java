package net.salesianos;

public class guerrero extends personaje {

    private String arma;

    public guerrero(String nombre, int nivel, String arma) {
        super(nombre, nivel);
        this.arma = arma;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public void ataquePesado() {
        gastarEnergia(15);
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Arma: " + arma);
    }
}
