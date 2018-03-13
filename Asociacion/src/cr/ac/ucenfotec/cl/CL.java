package cr.ac.ucenfotec.cl;

import java.util.ArrayList;
import cr.ac.ucenfotec.cl.Computadora;

public class CL {

    Computadora c = new Computadora();
    ArrayList<Empleado> listaEmplado;
    ArrayList<Computadora> listaComputadoras;

    public CL() {
        listaEmplado = new ArrayList<>();
        listaComputadoras = new ArrayList<>();

    }

    public void registrarEmpleado(String nombre, String cedula) {
        listaEmplado.add(new Empleado(nombre, cedula));
    }

    public void registrarComputadora(String serie, String marca) {
        listaComputadoras.add(new Computadora(serie, marca));

    }

//    public String[] getPersonas() {
//        String[] datos;
//        int i;
//        i = 0;
//        datos = new String[personas.size()];
//        for (Persona var : personas) {
//            datos[i] = var.toString();
//            i++;
//        }
//        return datos;
//    }
    public String[] getEmpleados() {
        String[] datos;
        int i = 0;
        datos = new String[listaEmplado.size()];

        for (Empleado empleado : listaEmplado) {
            datos[i] = empleado.toString();
            i++;
        }

        return datos;
    }

    public String[] getComputadora() {
        String[] datos;
        int i = 0;
        datos = new String[listaComputadoras.size()];
        for (Computadora var : listaComputadoras) {
            datos[i] = var.toString();
            i++;
        }

        return datos;

    }

    public String buscarCedula(String cedula) {
        String datos = "";

        for (Empleado var : listaEmplado) {
            if (var.getCedula().equals(cedula)) {
                datos = "1";
            } else {
                datos = "2";
            }
        }
        return datos;
    }

    public String buscarSerie(String serie) {
        String result = "";
        for (Computadora var : listaComputadoras) {
            if (var.getSerie().equals(result)) {
                result = "1";

            } else {
                result = "2";
            }

        }
        return result;
    }

    public void rComputadoras(String serie, String marca, String nombre, String cedula) {
        Empleado responsble = new Empleado(nombre, cedula);
        Computadora equipo = new Computadora(serie, marca);
    }

    public String noAsociadoCedula(String cedula) {
        String g;
        String datos = null;
        g = c.getResponsable().getCedula();

        if (cedula.equals(g)) {
            datos = "1";
        }
        return datos;
    }

}
