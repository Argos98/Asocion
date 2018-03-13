package ucenfotec.gestor;

import ucenfotec.cl.CL;
import ucenfotec.cl.Cliente;

public class Gestor {

    private final CL logica = new CL();

    public void registrar(String nombre, String cedula, String apellido) {
        logica.registrar(nombre, cedula, apellido);
    }

    public String[] getClientes() {
        return logica.getClientes();

    }

    public int generaNumoerCuenta() {
        return logica.generaNumoerCuenta();
    }

    public void registrarCuenta(double saldo, String fecha) {
        logica.registrarCuenta(saldo, fecha);
    }

    public String[] getCuentas() {
        return logica.getCuentas();
    }

    public int buscarCliente(String cedula) {
        return logica.buscarCliente(cedula);
    }

    public Cliente imprimirPos(int post) {
        return logica.imprimirPos(post);
    }
    
    public void registrarCuentas(String nombre, String cedula, String apellido,
            double saldo, String fecha){
        logica.registrarCuentaConCLiente(nombre, cedula, apellido, saldo, fecha);
    }

}
