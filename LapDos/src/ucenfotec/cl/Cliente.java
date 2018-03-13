package ucenfotec.cl;

public class Cliente {

    String nombre;
    String cedula;
    String apellido;

    public Cliente() {
        nombre = "";
        cedula = "";
        apellido = "";
    }

    @Override
    public String toString() {
        String info;

        info = "los datos del cliente son "+" nombre: "+nombre +" numero de cedula:"+ cedula +""
                + " apellidos:"+ apellido+"\n";

        return info;
    }

    public Cliente(String nombre, String cedula, String apellido) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.apellido = apellido;
    }

}
