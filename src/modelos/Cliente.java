package modelos;

import util.ListaDevolucion;

public class Cliente extends Usuario {
    private int puntos;
    private ListaDevolucion<Devolucion> devoluciones;

    public Cliente(String documento, String nombre, String contrasena) {
        super(documento, nombre, contrasena);
        this.puntos = 0;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public ListaDevolucion<Devolucion> getDevoluciones() {
        return devoluciones;
    }

    public void setDevoluciones(ListaDevolucion<Devolucion> devoluciones) {
        this.devoluciones = devoluciones;
    }

    public void acumularPuntos(int monto) {
        puntos += monto;
    }
}


