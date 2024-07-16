package datosTarjeta;


import java.util.ArrayList;
import java.util.List;

public class datos {
    private double limite;
    private double saldoTarjeta;

    private double valorProducto;
    private List<compra> listaCompras;

    public datos(double limite ) {
        this.limite = limite;
        this.valorProducto = valorProducto;

        this.saldoTarjeta = limite;
        this.listaCompras =new ArrayList<>();
    }
public boolean lanzarCompra(compra Compra){
if (this.saldoTarjeta >= Compra.getValor()){
    this.saldoTarjeta -= Compra.getValor();
    this.listaCompras.add(Compra);
    return true;

}
return false;
}
    //getter
    public double getLimite() {
        return limite;
    }

    public double getSaldoTarjeta() {
        return saldoTarjeta;
    }



    public double getValorProducto() {
        return valorProducto;
    }

    public List<compra> getListaCompras() {
        return listaCompras;
    }


    //********************************

}
