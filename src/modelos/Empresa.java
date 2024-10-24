package modelos;

import util.Lista;
import util.interfaces.ILista;

public class Empresa {
    private String nit;
    private String nombreEmpresa;
    private ILista<Bus> buses;

    public Empresa(String nit, String nombreEmpresa) {
        this.nit = nit;
        this.nombreEmpresa = nombreEmpresa;
        this.buses = new Lista<>();
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public ILista<Bus> getBuses() {
        return buses;
    }

    public void setBuses(ILista<Bus> buses) {
        this.buses = buses;
    }

}
