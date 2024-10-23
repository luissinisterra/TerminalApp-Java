package controladores;

import modelos.*;
import util.interfaces.ILista;

public class ControladorPrincipal {
    private Terminal terminal;
    private Caseta[][] casetas;
    private ILista<Usuario> usuarios;
    private AdministradorTerminal administradorTerminal;

    public ControladorPrincipal() {
        this.terminal = new Terminal(1, "Terminal San jose", "Armenia");
        this.administradorTerminal = this.terminal.getAdministradorTerminal();
        this.casetas = this.terminal.getCasetas();
        this.usuarios = this.terminal.getUsuarios();
        this.initCasetas();
    }

    private void initCasetas() {
        for (int i = 0; i < this.casetas.length; i++) {
            for (int j = 0; j < this.casetas[i].length; j++) {
                this.casetas[i][j] = new Caseta();
            }
        }
    }

    public Usuario iniciarSesion(String documento, String contrasena) {
        for(int i = 0; i < this.usuarios.size(); i++) {
            boolean existeDocumento = false;
            boolean existeContrasena = false;

            if(this.usuarios.get(i).getDocumento().equals(documento)) {
                existeDocumento = true;
            }

            if(this.usuarios.get(i).getContrasena().equals(contrasena)) {
                existeContrasena = true;
            }

            if(existeDocumento && existeContrasena) {
                return this.usuarios.get(i);
            }
        }
        return null;
    }

    public Cliente registro(String documento, String nombre,String contrasena) {
        Cliente usuario = new Cliente(documento, nombre, contrasena);
        this.usuarios.add(usuario);
        return usuario;
    }

    public Caseta entregarCaseta(int fila, int columna){
        return this.casetas[fila][columna];
    }

}
