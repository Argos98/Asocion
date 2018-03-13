package cr.ac.ucenfotec.cl;

public class Computadora {

    String serie;
    String marca;
        Empleado responsable;

    public Computadora() {
    }

    public Computadora(String serie, String marca, Empleado responsable) {
        this.serie = serie;
        this.marca = marca;
        this.responsable = responsable;
    }

    public Computadora(String serie, String marca) {
        this.serie = serie;
        this.marca = marca;
    }

    public String getSerie() {
        return serie;
    }

    public String getMarca() {
        return marca;
    }

    public Empleado getResponsable() {
        return responsable;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setResponsable(Empleado responsable) {
        this.responsable = responsable;
    }

    @Override
    public String toString() {
        return "Computadora{" + "serie=" + serie + ", marca=" + marca + ", responsable=" + responsable + '}';
    }

}
