import datosTarjeta.compra;
import datosTarjeta.datos;

import java.util.Collections;
import java.util.Scanner;

public class prinicipal {
    public static void main(String[] args) {
        Scanner lectura =new Scanner(System.in);
        System.out.println("Escriba el limite de la terjeta: ");
        double limite = lectura.nextDouble();
        datos tarjeta =new datos(limite);
        int salir =1;
        while (salir !=0){
            System.out.println("escriba el nombre del producto: ");
            String nombre = lectura.next();
            System.out.println("Ingrese el valor de la compra: ");
            double valor = Double.valueOf(lectura.nextDouble());
            compra Compra =new compra(valor, nombre);
            boolean compraRealizada = tarjeta.lanzarCompra(Compra);
        if (compraRealizada){
            System.out.println("Compra relaizada");
            System.out.println("Escriba 0 para salir o 1 para continuar");
            salir = lectura.nextInt();
        }
        else {
            System.out.println("saldo insuiciente");
            salir = 0;
        }

        }
        System.out.println("****************************************************");
        //resumenTodo
        System.out.println("Compras realizadas");
        Collections.sort(tarjeta.getListaCompras());
        for (compra Compra : tarjeta.getListaCompras()){
            System.out.println(Compra.getNombre()+" - "+Compra.getValor());
        }
        System.out.println("******************************************");
        System.out.println("saldo de la tarjeta "+tarjeta.getSaldoTarjeta());


    }
}
