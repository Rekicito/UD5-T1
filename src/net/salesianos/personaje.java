package net.salesianos;

public class personaje {

    private String nombre;
    private int nivel;
    private int energia;
    private static int totalPersonajes = 0;

    public personaje(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.energia = 100;
        totalPersonajes++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public void entrenar(int x) {
        nivel += x;
    }

    public void descansar(int x) {
        energia += x;
    }

    public void gastarEnergia(int x) {
        energia -= x;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Nivel: " + nivel);
        System.out.println("Energia: " + energia);
    }

    public static void mostrarTotalPersonajes() {
        System.out.println("Total personajes: " + totalPersonajes);
    }

}