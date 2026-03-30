package net.salesianos;

public class mago extends personaje {

    private String elemento;

    public mago(String nombre, int nivel, String elemento) {
        super(nombre, nivel);
        this.elemento = elemento;
    }

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    public void ataqueElemental() {
        gastarEnergia(25);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Nivel: " + getNivel());
        System.out.println("Elemento: " + elemento);
    }
}