package util;

public class NodoCaseta<T> {
    public T caseta;
    public NodoCaseta siguiente;

    public NodoCaseta(T caseta) {
        this.caseta = caseta;
        this.siguiente = null;
    }
}
