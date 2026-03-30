package net.salesianos;

public class guerrero extends personaje {

    private String arma;

    public guerrero(String nombre, int nivel, String arma) {
        super(nombre, nivel);
        this.arma = arma;
    }
}