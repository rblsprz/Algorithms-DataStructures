
package Logic;

/**
 *
 * @author David Robles
 */
public class FoodPlans {
    
private String cedula, nombre, frutas, vegetalesVerdes, vegetalesRojos, vegetalesAlmidon,
        otrosVegetales, granosEnteros, otrosGranos, carnes,pescado,frijoles, avesdeCorral,
        nuecesSemillas, huevos, grasasAceites, productosLacteos;

    public FoodPlans(String cedula, String nombre, String frutas, String vegetalesVerdes, String vegetalesRojos, String vegetalesAlmidon, String otrosVegetales, String granosEnteros, String otrosGranos, String carnes, String pescado, String frijoles, String avesdeCorral, String nuecesSemillas, String huevos, String grasasAceites, String productosLacteos) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.frutas = frutas;
        this.vegetalesVerdes = vegetalesVerdes;
        this.vegetalesRojos = vegetalesRojos;
        this.vegetalesAlmidon = vegetalesAlmidon;
        this.otrosVegetales = otrosVegetales;
        this.granosEnteros = granosEnteros;
        this.otrosGranos = otrosGranos;
        this.carnes = carnes;
        this.pescado = pescado;
        this.frijoles = frijoles;
        this.avesdeCorral = avesdeCorral;
        this.nuecesSemillas = nuecesSemillas;
        this.huevos = huevos;
        this.grasasAceites = grasasAceites;
        this.productosLacteos = productosLacteos;
    }//End Constructor

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

    public String getFrutas() {
        return frutas;
    }

    public void setFrutas(String frutas) {
        this.frutas = frutas;
    }

    public String getVegetalesVerdes() {
        return vegetalesVerdes;
    }

    public void setVegetalesVerdes(String vegetalesVerdes) {
        this.vegetalesVerdes = vegetalesVerdes;
    }

    public String getVegetalesRojos() {
        return vegetalesRojos;
    }

    public void setVegetalesRojos(String vegetalesRojos) {
        this.vegetalesRojos = vegetalesRojos;
    }

    public String getVegetalesAlmidon() {
        return vegetalesAlmidon;
    }

    public void setVegetalesAlmidon(String vegetalesAlmidon) {
        this.vegetalesAlmidon = vegetalesAlmidon;
    }

    public String getOtrosVegetales() {
        return otrosVegetales;
    }

    public void setOtrosVegetales(String otrosVegetales) {
        this.otrosVegetales = otrosVegetales;
    }

    public String getGranosEnteros() {
        return granosEnteros;
    }

    public void setGranosEnteros(String granosEnteros) {
        this.granosEnteros = granosEnteros;
    }

    public String getOtrosGranos() {
        return otrosGranos;
    }

    public void setOtrosGranos(String otrosGranos) {
        this.otrosGranos = otrosGranos;
    }

    public String getCarnes() {
        return carnes;
    }

    public void setCarnes(String carnes) {
        this.carnes = carnes;
    }

    public String getPescado() {
        return pescado;
    }

    public void setPescado(String pescado) {
        this.pescado = pescado;
    }

    public String getFrijoles() {
        return frijoles;
    }

    public void setFrijoles(String frijoles) {
        this.frijoles = frijoles;
    }

    public String getAvesdeCorral() {
        return avesdeCorral;
    }

    public void setAvesdeCorral(String avesdeCorral) {
        this.avesdeCorral = avesdeCorral;
    }

    public String getNuecesSemillas() {
        return nuecesSemillas;
    }

    public void setNuecesSemillas(String nuecesSemillas) {
        this.nuecesSemillas = nuecesSemillas;
    }

    public String getHuevos() {
        return huevos;
    }

    public void setHuevos(String huevos) {
        this.huevos = huevos;
    }

    public String getGrasasAceites() {
        return grasasAceites;
    }

    public void setGrasasAceites(String grasasAceites) {
        this.grasasAceites = grasasAceites;
    }

    public String getProductosLacteos() {
        return productosLacteos;
    }

    public void setProductosLacteos(String productosLacteos) {
        this.productosLacteos = productosLacteos;
    }
}//End FoodPlans
