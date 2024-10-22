package util;

import util.interfaces.ILista;

public class ListaUsuario<S> implements ILista<S> {

    private NodoUsuario<S> primero;
    private int size;

    @Override
    public void add(S dato) {
        NodoUsuario<S> nuevo = new NodoUsuario(dato);
        if (this.primero == null) {
            this.primero = nuevo;
        } else {
            NodoUsuario<S> aux = this.primero;
            while (aux.siguiente != null) {
                aux = aux.siguiente;
            }
            aux.siguiente = nuevo;
        }
        this.size++;
    }

    @Override
    public S get(int index) {
        if (index < 0 || index >= this.size) {
            throw new ArrayIndexOutOfBoundsException();
        }

        if (index == 0) {
            return this.primero.usuario;
        } else {
            NodoUsuario<S> aux = this.primero;
            int contador = 0;
            while (contador < index) {
                aux = aux.siguiente;
                contador++;
            }
            return aux.usuario;
        }
    }

    @Override
    public void remove(int index){
        if(index < 0 || index >= this.size){
            throw new ArrayIndexOutOfBoundsException();
        }

        if (index == 0){
            this.primero = this.primero.siguiente;
        } else {
            NodoUsuario<S> aux = this.primero;
            int contador = 0;
            while (contador < index - 1){
                aux = aux.siguiente;
                contador++;
            }
            aux.siguiente = aux.siguiente.siguiente;
        }
        this.size--;
    }


    @Override
    public boolean isEmpty(){
        if (this.primero == null){
            return true;
        }
        return false;
    }

    @Override
    public int size(){
        return this.size;
    }

}
