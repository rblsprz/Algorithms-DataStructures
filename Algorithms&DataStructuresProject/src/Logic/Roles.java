
package Logic;

/**
 *
 * @author David Robles
 */
public class Roles {
    
    private String nombre;
    private String apellido;
    private int edad;
    private String nombreUsuario;
    private String contraseña;
    private String correo;
    private int telefono;
    private int tipoRol;

    public Roles(String nombre, String apellido, int edad, String nombreUsuario, String contraseña, String correo, int telefono, int tipoRol) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.correo = correo;
        this.telefono = telefono;
        this.tipoRol = tipoRol;
    }//End Roles Constructor

    public String getNombre() {
        return nombre;
    }//End getNombre

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }//End setNombre

    public String getApellido() {
        return apellido;
    }//End getApellido

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }//End setApellido

    public int getEdad() {
        return edad;
    }//End getEdad

    public void setEdad(int edad) {
        this.edad = edad;
    }//End setEdad

    public String getNombreUsuario() {
        return nombreUsuario;
    }//End getNombreUsuario

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }//End setNombreUsuario

    public String getContraseña() {
        return contraseña;
    }//End getContraseña

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }//End setContraseña

    public String getCorreo() {
        return correo;
    }//End getCorreo

    public void setCorreo(String correo) {
        this.correo = correo;
    }//End setCorreo

    public int getTelefono() {
        return telefono;
    }//End getTelefono

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }//End setTelefono

    public int getTipoRol() {
        return tipoRol;
    }//End getTipoRol

    public void setTipoRol(int tipoRol) {
        this.tipoRol = tipoRol;
    }//End setTipoRol
}//End Roles
