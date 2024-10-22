package util;

import modelos.Usuario;

public class NodoUsuario<T> {
    public T usuario;
    public NodoUsuario siguiente;

    public NodoUsuario(T usuario) {
        this.usuario = usuario;
        this.siguiente = null;
    }
}
