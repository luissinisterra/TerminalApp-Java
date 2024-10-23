package modelos;

import util.Lista;
import util.interfaces.ILista;

public class Empresa {
    private String nit;
    private String nombreEmpresa;
    private double canonArrendamiento;
    private int plazasEstacionamiento;
    private ILista<Bus> buses;

    public Empresa(String nit, String nombreEmpresa, double canonArrendamiento, int plazasEstacionamiento) {
        this.nit = nit;
        this.nombreEmpresa = nombreEmpresa;
        this.canonArrendamiento = canonArrendamiento;
        this.plazasEstacionamiento = plazasEstacionamiento;
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

    public double getCanonArrendamiento() {
        return canonArrendamiento;
    }

    public void setCanonArrendamiento(double canonArrendamiento) {
        this.canonArrendamiento = canonArrendamiento;
    }

    public int getPlazasEstacionamiento() {
        return plazasEstacionamiento;
    }

    public void setPlazasEstacionamiento(int plazasEstacionamiento) {
        this.plazasEstacionamiento = plazasEstacionamiento;
    }

    public ILista<Bus> getBuses() {
        return buses;
    }

    public void setBuses(ILista<Bus> buses) {
        this.buses = buses;
    }

}
