package Logic;

/**
 *
 * @author pc
 */
public class Plans {
    
    private String desayuno, almuerzo, cena, meriendas, cedula, fecha;

    public Plans(String cedula, String fecha ,String desayuno, String almuerzo, String cena, String meriendas) {
        this.desayuno = desayuno;
        this.almuerzo = almuerzo;
        this.cena = cena;
        this.meriendas = meriendas;
        this.cedula = cedula;
        this.fecha = fecha;
    }
    
   public Plans(){}

    public String getDesayuno() {
        return desayuno;
    }

    public void setDesayuno(String desayuno) {
        this.desayuno = desayuno;
    }

    public String getAlmuerzo() {
        return almuerzo;
    }

    public void setAlmuerzo(String almuerzo) {
        this.almuerzo = almuerzo;
    }

    public String getCena() {
        return cena;
    }

    public void setCena(String cena) {
        this.cena = cena;
    }

    public String getMeriendas() {
        return meriendas;
    }

    public void setMeriendas(String meriendas) {
        this.meriendas = meriendas;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
