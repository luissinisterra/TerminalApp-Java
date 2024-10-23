package modelos;

import util.Lista;
import util.interfaces.ILista;

public class Terminal {
    private int id;
    private String nombre;
    private String ubicacion;
    private ILista<Usuario> usuarios;
    private AdministradorTerminal administradorTerminal;
    private Caseta[][] casetas;

    public Terminal (int id, String nombre, String ubicacion) {
        this.id = id;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.usuarios = new Lista<>();
        this.administradorTerminal = new AdministradorTerminal("1111669729", "Luis Sinisterra", "123");
        this.usuarios.add(this.administradorTerminal);
        this.casetas = new Caseta[4][5];
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public ILista<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ILista<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public AdministradorTerminal getAdministradorTerminal() {
        return administradorTerminal;
    }

    public void setAdministradorTerminal(AdministradorTerminal administrador) {
        this.administradorTerminal = administrador;
    }

    public Caseta[][] getCasetas() {
        return casetas;
    }

    public void setCasetas(Caseta[][] casetas) {
        this.casetas = casetas;
    }
}
