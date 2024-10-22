package modelos;

class Vehiculo {
    private String placa;
    private int cantidadPuestos;
    private String empresaTransporte;

    public Vehiculo(String placa, int cantidadPuestos) {
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

    public String getEmpresaTransporte() {
        return empresaTransporte;
    }

    public void setEmpresaTransporte(String empresaTransporte) {
        this.empresaTransporte = empresaTransporte;
    }

}
