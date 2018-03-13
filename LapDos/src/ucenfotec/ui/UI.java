package ucenfotec.ui;
//las librerias que se importan

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import ucenfotec.gestor.Gestor;

public class UI {
//declaracin de variable de lectura 

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Scanner sc = new Scanner(System.in);

    //declaracion de un objeto para usar las cosas en la capa logica
    static Gestor gestor = new Gestor();

    public static void main(String[] args) throws IOException {
//aca se llama un metodo que inica el programa
        inicarPrgrama();
    }

    static void inicarPrgrama() throws IOException {
        //este metodo hace que se ejcute el menu que se puede decir que es lo que controla el programa 
        ejecutarMenu();
    }

    static void ejecutarMenu() throws IOException {
        //se declaran variables 
        int opc;
        boolean noSalir = true;
//este do while permite ejecutar las opcciones del menu y ademas de ello permite repetir el menu 
//hasta que usario marque la opcion de salir ahi se acabara el progrma 
        do {
            mostrarMenu();
            opc = leerOpcion();
            noSalir = ejecutarAccion(opc);
        } while (noSalir);
    }
//se este metodo imprime el menu 

    static void mostrarMenu() {

        System.out.println("**************************************************");
        System.out.println("                    1.Crear Cliente    ");
        System.out.println("                    2.Listar  cliente           ");
        System.out.println("                    3.buscar Cliente          ");
        System.out.println("                    4.Crear cuentas    ");
        System.out.println("                    5.listar cuentas   ");
        System.out.println("                    6.salir");
        System.out.println("**************************************************");
    }
//este metodo lee la opcion digitada por el usario y la retorna 

    static int leerOpcion() throws java.io.IOException {

        int opcion;

        System.out.println("Seleccione su opcion: ");
        opcion = sc.nextInt();
        System.out.println();

        return opcion;
    }
//este metodo recibe la opccion digtada por el usuario y contro que las accinos sucedan 

    static boolean ejecutarAccion(int popcion) throws java.io.IOException {

        boolean noSalir = true;

        switch (popcion) {
            case 1:
                registrar();
                break;

            case 2:
                imprimirClientes();
                break;

            case 3:
                buscarC();
                break;

            case 4:

                registrarCuenta();

                break;

            case 5:
                llamarImprimir();
                break;

            case 6:
                noSalir = false;
                break;

            default: //Cualquier otro valor dado por el usuario se considera invalido

                System.out.println("Digite una opccion Valida");
                System.out.println("");
                System.out.println("");
                break;
        }
        return noSalir;
    }
//este metodo solicita los datos y los manda a la CL para se guardados

    static void registrar() throws IOException {

        String nombre = "";
        String cedula = "";
        String apellido = "";

        System.out.println("Digite el nombre del clinete ");
        nombre = br.readLine();
        System.out.println("Digite el numero de cedula del clinete");
        cedula = br.readLine();
        System.out.println("Digite el apellido");
        apellido = br.readLine();

        gestor.registrar(nombre, cedula, apellido);

        String des;
        System.out.println("Desea crear una cuenta para este cliente? Si(S) NO(N)");
        des = br.readLine();
        if (des.equals("S")) {
            double saldo = 0;
            String fecha = "";
            System.out.println("digite el saldo Inicial de la cuenta ");
            saldo = sc.nextDouble();
            System.out.println("digite la fecha en la que esta siendo creada esta cuenta");
            fecha = br.readLine();

            int numCuenta = gestor.generaNumoerCuenta();
            System.out.println("su  numero de cuenta es " + numCuenta);

            gestor.registrarCuentas(nombre, cedula, apellido, saldo, fecha);
        }

    }
//esto imprime la lista de los clientes 

    static void imprimirClientes() {
        for (String var : gestor.getClientes()) {
            System.out.println(var.toString());
        }
    }
//esta metodo crea la cuanta bancaria 

    static void registrarCuenta() throws IOException {
        double saldo = 0;
        String fecha = "";
        int numCuenta = gestor.generaNumoerCuenta();

        System.out.println("digite su saldo inicial");
        saldo = sc.nextDouble();
        System.out.println("digite la fecha de creacion de la cuenta");
        fecha = br.readLine();
        System.out.println("su  numero de cuenta es " + numCuenta);

        gestor.registrarCuenta(saldo, fecha);

    }

    static void buscarC() throws IOException {
        String cedula;
        int pos = 0;
        System.out.println("digite la cedula del cliente");
        cedula = br.readLine();

        pos = gestor.buscarCliente(cedula);

        imprimirBusquedaC(pos);

    }

    static void imprimirBusquedaC(int pos) {
        System.out.println("la info del cliente es " + gestor.imprimirPos(pos));

    }

    static void llamarImprimir() {
        for (String var : gestor.getCuentas()) {
            System.out.println(var.toString());
            
            
        }
    }
}
