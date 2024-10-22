package servicios;

import modelos.Empresa;
import util.ListaEmpresa;

public class ServicioEmpresa {

    private ListaEmpresa<Empresa> empresas;

    public ServicioEmpresa() {
        this.empresas = new ListaEmpresa<>();
    }

    public String agregarEmpresa(String nit, String nombreEmpresa, double canonArrendamiento, int plazasEstacionamiento) {
        this.empresas.add(new Empresa(nit, nombreEmpresa, canonArrendamiento, plazasEstacionamiento));
        return "Empresa agregada con exito";
    }

    public String eliminarEmpresa(String nit) {
        for (int i = 0; i < this.empresas.size(); i++) {
            if (this.empresas.get(i).getNit().equals(nit)) {
                this.empresas.remove(i);
                return "Empresa eliminada con exito";
            }
        }
        return "Empresa no encontrada";
    }

    public String editarEmpresa(String nit, String nombreEmpresa, double canonArrendamiento, int plazasEstacionamiento) {
        for (int i = 0; i < this.empresas.size(); i++) {
            if (this.empresas.get(i).getNit().equals(nit)) {
                this.empresas.get(i).setNombreEmpresa(nombreEmpresa);
                this.empresas.get(i).setCanonArrendamiento(canonArrendamiento);
                this.empresas.get(i).setPlazasEstacionamiento(plazasEstacionamiento);
                return "Empresa actualizada con exito";
            }
        }
        return "Empresa no encontrada";
    }

    public Empresa buscarEmpresa(String nit) {
        for (int i = 0; i < this.empresas.size(); i++) {
            if (this.empresas.get(i).getNit().equals(nit)) {
                return this.empresas.get(i);
            }
        }
        return null;
    }

}
