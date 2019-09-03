package br.ufrn.imd.hotel.clientes;
import java.util.ArrayList;

import br.ufrn.imd.hotel.clientes.gastos.Consumo;


/**
 * Classe Conta, classe que armazena o conjunto de consumo de cliente e a situa��o da conta
 *
 * @author Rita Lopes
 * @author Hilton Thallyson
 * @version 1.0
 * @since 2019.2
 *
 */

public class Conta {
    //ATRIBUTOS
    private int codigo;
    private double valor;
    private boolean pago;
    private ArrayList<Consumo> consumo;


    /**
     * Construtor padr�o
     * */
    public Conta() {
        this.codigo = 0;
        this.valor = 0.0;
        this.pago = false;
        this.consumo = new ArrayList<Consumo>();
        this.consumo.add(new Consumo());
    }

    /**
     * Construtor parametrizado
     * @param codigo - identificador da conta
     * @param valor - custo total da conta
     * @param pago - situa��o em que se encontra a conta
     * @param consumo - lista de consumo de servi�os
     * */
    public Conta(int codigo, double valor, boolean pago, ArrayList<Consumo> consumo) {
        this.codigo = codigo;
        this.valor = valor;
        this.pago = pago;
        this.consumo = new ArrayList<Consumo>();
        this.consumo.addAll(consumo);

    }

    //GETTERS AND SETTERS
    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean getPago() {
        return this.pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

}
