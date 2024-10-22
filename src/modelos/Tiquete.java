package modelos;

public class Tiquete {
    private Viaje viaje;
    private Cliente cliente;
    private boolean reservado;

    public Tiquete(Viaje viaje, Cliente cliente, boolean reservado) {
        this.viaje = viaje;
        this.cliente = cliente;
        this.reservado = reservado;
    }

    public Viaje getViaje() {
        return viaje;
    }

    public void setViaje(Viaje viaje) {
        this.viaje = viaje;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public boolean isReservado() {
        return reservado;
    }

    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }
}

