package Logic;

/**
 *
 * @author David Robles
 */
public class Roles {

    private String cedula;
    private String nombre;
    private String apellido;
    private String nombreUsuario;
    private String contraseña;
    private int edad;
    private int telefono;
    private String correo;
    private int tipoRol;

    public Roles(String cedula, String nombre, String apellido,String nombreUsuario, String contraseña, int edad,int telefono,String correo, int tipoRol) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.edad = edad;
        this.telefono = telefono;
        this.correo = correo;
        this.tipoRol = tipoRol;
    }//End Roles Constructor

    Roles() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public String getCedula() {
        return cedula;
    }//End getCedula

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }//End setCedula
    
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
    
    public int getEdad() {
        return edad;
    }//End getEdad

    public void setEdad(int edad) {
        this.edad = edad;
    }//End setEdad
    
    public int getTelefono() {
        return telefono;
    }//End getTelefono

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }//End setTelefono

    public String getCorreo() {
        return correo;
    }//End getCorreo

    public void setCorreo(String correo) {
        this.correo = correo;
    }//End setCorreo


    public int getTipoRol() {
        return tipoRol;
    }//End getTipoRol

    public void setTipoRol(int tipoRol) {
        this.tipoRol = tipoRol;
    }//End setTipoRol
    
    public String toString(){
    return "CÉDULA " + cedula + "NOMBRE " + nombre + "APELLIDO " + apellido + "NOMBRE USUARIO " + nombreUsuario + "CONTRASEÑA "+ contraseña + "EDAD "+ edad + "TELÉFONO " + telefono + "CORREO " + correo + "TIPO ROL " +tipoRol;
    }
}//End Roles
