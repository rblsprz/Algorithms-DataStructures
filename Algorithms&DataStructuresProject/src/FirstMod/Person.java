package FirstMod;

/**
 *
 * @author pc
 */
public class Person {
    
    private String nombre, apellido, contraseña, direccion, cedula;
    private int tipo, tel;

    public Person(String cedula, String nombre, String apellido, String contraseña, String direccion, int tipo, int tel) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.contraseña = contraseña;
        this.direccion = direccion;
        this.tipo = tipo;
        this.tel = tel;
    }

    public Person(){
    
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }  

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String toString(){
    return "Nombre: " + nombre + " Contraseña: " + contraseña + " Tipo:" + tipo + tel+ direccion+ apellido;
    }
    
}
