package controladores;

import modelos.Empresa;
import servicios.ServicioEmpresa;

public class ControladorEmpresa {

    private ServicioEmpresa servicioEmpresa;

    public ControladorEmpresa() {
        this.servicioEmpresa = new ServicioEmpresa();
    }

    public String agregarEmpresa(String nit, String nombreEmpresa, double canonArrendamiento, int plazasEstacionamiento) {
        return this.servicioEmpresa.agregarEmpresa(nit, nombreEmpresa, canonArrendamiento, plazasEstacionamiento);
    }

    public String eliminarEmpresa(String nit) {
        return this.servicioEmpresa.eliminarEmpresa(nit);
    }

    public String editarEmpresa(String nit, String nombreEmpresa, double canonArrendamiento, int plazasEstacionamiento) {
        return this.servicioEmpresa.editarEmpresa(nit, nombreEmpresa, canonArrendamiento, plazasEstacionamiento);
    }

    public Empresa buscarEmpresa(String nit) {
        return this.servicioEmpresa.buscarEmpresa(nit);
    }

}
