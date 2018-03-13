package ucenfotec.cl;

import java.time.LocalDateTime;

public class Cuenta {

    int numCuenta;
    double saldo;
    String fecha;
    Cliente duennio;

    public Cuenta(int numCuenta, double saldo, String fecha) {
        this.numCuenta = numCuenta;
        this.saldo = saldo;
        this.fecha = fecha;
    }

    public Cuenta(int numCuenta, double saldo, String fecha, Cliente duennio) {
        this.numCuenta = numCuenta;
        this.saldo = saldo;
        this.fecha = fecha;
        this.duennio = duennio;
    }

    public Cuenta() {
        numCuenta = 78;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numCuenta=" + numCuenta + ", saldo=" + saldo + ", fecha=" + fecha + ", duennio=" + duennio + '}';
    }

   

    public Cuenta(double saldo, int numCuenta, String fecha) {

        this.numCuenta = numCuenta;
        this.saldo = saldo;
        this.fecha = fecha;

    }

}
