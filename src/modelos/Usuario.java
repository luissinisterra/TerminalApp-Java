package modelos;

public abstract class Usuario {
    protected String documento;
    protected String nombre;
    protected String contrasena;

    public Usuario(String documento, String nombre, String contrasena) {
        this.documento = documento;
        this.nombre = nombre;
        this.contrasena = contrasena;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}
