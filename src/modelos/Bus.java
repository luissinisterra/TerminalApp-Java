package modelos;

public class Bus {
    private String placa;
    private int cantidadPuestos;

    public Bus(String placa, int cantidadPuestos) {
        this.placa = placa;
        this.cantidadPuestos = cantidadPuestos;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getCantidadPuestos() {
        return cantidadPuestos;
    }

    public void setCantidadPuestos(int cantidadPuestos) {
        this.cantidadPuestos = cantidadPuestos;
    }

}
