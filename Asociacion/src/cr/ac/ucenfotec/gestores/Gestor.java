package cr.ac.ucenfotec.gestores;

import cr.ac.ucenfotec.cl.CL;

public class Gestor {

    private final CL logica;

    public Gestor() {
        logica = new CL();
    }

    public void registrarEmpleado(String nombre, String cedula) {
        logica.registrarEmpleado(nombre, cedula);

    }

    public String[] getEmpleado() {
        return logica.getEmpleados();
    }

    public void registrarComputadora(String serie, String marca) {
        logica.registrarComputadora(serie, marca);

    }

    public void resgiratarEquipo(String serie, String marca, String nombre, String cedula) {
        logica.rComputadoras(serie, marca, nombre, cedula);
    }

    public String[] getComputadora() {
        return logica.getComputadora();
    }

    public String busquedaCedula(String cedula) {
        return logica.buscarCedula(cedula);
    }

    public String busquedaSerie(String serie) {
        return logica.buscarSerie(serie);
    }
    
    public String busquedaResponableCedula(String cedula){
        return logica.noAsociadoCedula(cedula);
    }
}
