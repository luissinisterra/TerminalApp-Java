package modelos;

public abstract class Usuario extends Persona {
    protected String documento;
    protected String contrasena;
    protected double sueldo;

    public Usuario(String documento, String nombre, String apellido, int edad, String genero, String telefono, String correo, String contrasena, double sueldo) {
        super(documento, nombre, apellido, edad, genero, telefono);
        this.documento = documento;
        this.contrasena = contrasena;
        this.sueldo = sueldo;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

}
