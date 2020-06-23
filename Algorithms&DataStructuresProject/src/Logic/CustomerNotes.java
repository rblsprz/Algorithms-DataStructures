package Logic;

/**
 *
 * @author pc
 */

public class CustomerNotes {
    
    private String cedula, nombre, notas, fecha;
    private double peso, musculo, grasa, altura, masaCorporal, agua;
    private int edad;

    public CustomerNotes(String cedula, String nombre, String notas, double peso, double musculo, double grasa, double altura, int edad, double masaCorporal,double agua,String fecha) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.notas = notas;
        this.peso = peso;
        this.musculo = musculo;
        this.grasa = grasa;
        this.altura = altura;
        this.edad = edad;
        this.fecha = fecha;
        this.masaCorporal = masaCorporal;
        this.agua = agua;
    }
    
    public CustomerNotes(){}

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

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getMusculo() {
        return musculo;
    }

    public void setMusculo(double musculo) {
        this.musculo = musculo;
    }

    public double getGrasa() {
        return grasa;
    }

    public void setGrasa(double grasa) {
        this.grasa = grasa;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getMasaCorporal() {
        return masaCorporal;
    }

    public void setMasaCorporal(double masaCorporal) {
        this.masaCorporal = masaCorporal;
    }

    public double getAgua() {
        return agua;
    }

    public void setAgua(double agua) {
        this.agua = agua;
    }
}
