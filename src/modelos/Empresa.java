package modelos;

public class Empresa {
    private String nit;
    private String nombreEmpresa;
    private double canonArrendamiento;
    private int plazasEstacionamiento;

    public Empresa(String nit, String nombreEmpresa, double canonArrendamiento, int plazasEstacionamiento) {
        this.nit = nit;
        this.nombreEmpresa = nombreEmpresa;
        this.canonArrendamiento = canonArrendamiento;
        this.plazasEstacionamiento = plazasEstacionamiento;
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
}
