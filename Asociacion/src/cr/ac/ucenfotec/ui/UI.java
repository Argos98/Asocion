package cr.ac.ucenfotec.ui;
//las librerias que se importan

import cr.ac.ucenfotec.gestores.Gestor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UI {
//declaracin de variable de lectura 

    static Scanner sc = new Scanner(System.in);
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Gestor gestor = new Gestor();

    public static void main(String[] args) throws IOException {

        inicarPrgrama();
    }

    static void inicarPrgrama() throws IOException {
        ejecutarMenu();
    }

    static void ejecutarMenu() throws IOException {
        int opc;
        boolean noSalir = true;

        do {
            mostrarMenu();
            opc = leerOpcion();
            noSalir = ejecutarAccion(opc);
        } while (noSalir);
    }

    static void mostrarMenu() {

        System.out.println("**************************************************");
        System.out.println("                    1. registrar empleado     ");
        System.out.println("                    2. registrar Computadoras            ");
        System.out.println("                    3. listar empleados "
                + "                             4.listar Computadoras  "
                + "                             5.asignar una pc a un empleado         ");
        System.out.println("                    6.salir     ");
        System.out.println("**************************************************");
    }

    static int leerOpcion() throws java.io.IOException {

        int opcion;

        System.out.println("Seleccione su opcion: ");
        opcion = sc.nextInt();
        System.out.println();

        return opcion;
    }

    static boolean ejecutarAccion(int popcion) throws java.io.IOException {

        boolean noSalir = true;

        switch (popcion) {
            case 1:
                registrarEmpleado();
                break;

            case 2:
                registrarPC();
                break;

            case 3:
                ListarEmpleado();
                break;

            case 4:
                ListarComputadora();
                break;

            case 6:

                noSalir = false;

                break;

            default: //Cualquier otro valor dado por el usuario se considera inv�lido

                System.out.println("Digite una opccion Valida");
                System.out.println("");
                System.out.println("");
                break;
        }
        return noSalir;

    }

    static void registrarEmpleado() throws IOException {
        String nombre;
        String cedula;
        String opc = "";
        String resultado;
        System.out.println("digite el nombre del empleado: ");
        nombre = br.readLine();

        System.out.println("digite la cedula del empleado: ");
        cedula = br.readLine();
        resultado = gestor.busquedaCedula(cedula);

        if (cedula.equals("1")) {
            System.out.println("ya esta registrado");

            System.out.println("digite la cedula del empleado: ");
            cedula = br.readLine();
            resultado = gestor.busquedaCedula(cedula);

            if (cedula.equals("1")) {
                System.out.println("ya esta registrado");

                System.out.println("digite la cedula del empleado: ");
                cedula = br.readLine();
                resultado = gestor.busquedaCedula(cedula);

                if (cedula.equals("1")) {
                    System.out.println("ya esta registrado");

                    System.out.println("digite la cedula del empleado: ");
                    cedula = br.readLine();
                    resultado = gestor.busquedaCedula(cedula);

                }
            }
        }

        gestor.registrarEmpleado(nombre, cedula);

    }

    public static void registrarPC() throws IOException {
        String marca;
        String serie;
        String resultado;
        String cedula;
        String nombre;

        System.out.println("digiti la marca de la Computadura  marca");

        marca = br.readLine();

        System.out.println("digite la serie de la pc ");
        serie = br.readLine();

        if (serie.equals("1")) {
            System.out.println("ya esta registrado");

            System.out.println("digite la serie: ");
            serie = br.readLine();
            resultado = gestor.busquedaSerie(serie);

            if (serie.equals("1")) {
                System.out.println("ya esta registrado");

                System.out.println("digite la serie: ");
                serie = br.readLine();
                resultado = gestor.busquedaSerie(serie);

            }
        }

        System.out.println("Desea registartar un responsable a la computadora, Si(S) No(N)");
        if (br.readLine().charAt(1) == 'S') {
            System.out.println("digite el numero de cedula del responsable ");
            cedula = br.readLine();
            System.out.println("digitie el nombre del responsable ");
            nombre = br.readLine();

            gestor.resgiratarEquipo(serie, marca, nombre, cedula);
        } else {

            gestor.registrarComputadora(serie, marca);
        }

    }

    public static void ListarEmpleado() {
        for (String var : gestor.getEmpleado()) {
            System.out.println(var.toString());

        }
    }

    public static void ListarComputadora() {
        for (String var : gestor.getComputadora()) {
            System.out.println(var.toString());

        }
    }

    public static void asignarEmpeladoPC() throws IOException {
        String cedula;
        String result;
        String serie;
        System.out.println("digite la cedula del empelado ");
        cedula = br.readLine();
        gestor.busquedaCedula(cedula);

        if (cedula.equals("1")) {

            result = gestor.busquedaResponableCedula(cedula);

            if (result.equals("1")) {
                System.out.println("no puedo relacinar ese empleado por que ya esta relacionda a un computadora ");
            }

        }

        System.out.println("digame el numero de serie de la computadora que desesa relacionar ");
        serie = br.readLine();
        
    }
}
