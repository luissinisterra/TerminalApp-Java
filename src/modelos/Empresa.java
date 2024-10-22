package modelos;

public class Empresa {
    private String nit;
    private String nombreEmpresa;
    private double canonArrendamiento;
    private int plazasEstacionamiento;

    public Empresa() {}

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
}
