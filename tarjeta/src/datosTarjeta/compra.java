package datosTarjeta;

public class compra implements Comparable<compra> {
    private double valor;
    private String nombre;
    //constructor

    public compra(double valor, String nombre) {
        this.valor = valor;
        this.nombre = nombre;
    }
//getter
    public double getValor() {
        return valor;
    }

    public String getNombre() {
        return nombre;
    }
    //****************

    @Override
    public String toString() {
        return "compra: valor=" + valor +
                ", nombre: "+ nombre ;
    }

    @Override
    public int compareTo(compra otraCompra) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(otraCompra.getValor()));
    }
}
