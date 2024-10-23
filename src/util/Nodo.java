package util;

public class Nodo<T> {
    public T dato;
    public Nodo siguiente;

    public Nodo(T dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}

