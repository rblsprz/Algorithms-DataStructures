package Logic;

/**
 *
 * @author pc
 */
public class Hist {
    
    private String fecha, hora, accion , persona;

    public Hist(String fecha, String hora, String accion, String persona) {
        this.fecha = fecha;
        this.hora = hora;
        this.accion = accion;
        this.persona = persona;
    }
    
    public Hist () {}

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }
}
