package modelos;

public class Cliente extends Usuario {
    private int puntos;

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

    public void acumularPuntos(int monto) {
        puntos += monto;
    }
}


