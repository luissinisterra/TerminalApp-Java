package modelos;

import util.interfaces.ILista;

public class Caseta {
    private AdministradorFlota administradorFlota;
    private Empresa empresa;
    private ILista<Bus> buses;

    public Caseta() {}

    public Caseta(Empresa empresa, AdministradorFlota administradorFlota) {
        this.administradorFlota = administradorFlota;
        this.empresa = empresa;
    }

    public AdministradorFlota getAdministradorFlota() {
        return administradorFlota;
    }

    public void setAdministradorFlota(AdministradorFlota administradorFlota) {
        this.administradorFlota = administradorFlota;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public ILista<Bus> getBuses() {
        return buses;
    }

    public void setBuses(ILista<Bus> buses) {
        this.buses = buses;
    }

}

