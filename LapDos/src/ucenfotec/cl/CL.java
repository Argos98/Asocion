package ucenfotec.cl;

import java.util.*;

public class CL {

    public ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
    protected ArrayList<Cuenta> listaCuentas = new ArrayList<Cuenta>();

   

    int numCuenta = 0;

    public CL() {

    }

    public void registrar(String nombre, String cedula, String apellido) {
        listaClientes.add(new Cliente(nombre, cedula, apellido));
    }
//     public String[] getComputadora() {
//        String[] datos;
//        int i = 0;
//        datos = new String[listaComputadoras.size()];
//        for (Computadora var : listaComputadoras) {
//            datos[i] = var.toString();
//            i++;
//        }
//
//        return datos;
//
//    }

    public String[] getClientes() {
        String[] datos;
        int i = 0;
        datos = new String[listaClientes.size()];

        for (Cliente var : listaClientes) {
            datos[i] = var.toString();
            i++;
        }

        return datos;

    }

    public int buscarCliente(String cedula) {
        int post = 0;

        for (int cont = 0; cont < listaClientes.size(); cont++) {
            Cliente lista[] = new Cliente[listaClientes.size()];
            listaClientes.toArray(lista);
            if (lista[cont].cedula.equals(cedula)) {
                post = cont;
            } else {
            }
        }
        imprimirPos(post);
        return post;
    }

    public int generaNumoerCuenta() {

        int info;

        numCuenta += 7 * 3 + 15;
        info = numCuenta;

        return info;
    }

    public void registrarCuenta(double saldo, String fecha) {
        listaCuentas.add(new Cuenta(saldo, numCuenta, fecha));
    }

    public String[] getCuentas() {
        String[] datos;
        int i = 0;

        datos = new String[listaCuentas.size()];
        for (Cuenta var : listaCuentas) {
            datos[i] = var.toString();
            i++;
        }

        return datos;
    }

   
    public Cliente imprimirPos(int post) {
        return listaClientes.get(post);
    }

//     public void rComputadoras(String serie, String marca, String nombre, String cedula) {
//        Empleado responsble = new Empleado(nombre, cedula);
//        Computadora equipo = new Computadora(serie, marca);
//    }
    public void registrarCuentaConCLiente(String nombre, String cedula, String apellido,
            double saldo, String fecha) {
        Cliente duennio = new Cliente(nombre, cedula, apellido);
        Cuenta cuenta = new Cuenta(saldo, numCuenta, fecha);
        listaCuentas.add(new Cuenta(numCuenta, saldo, fecha, duennio));
      

    }
}
