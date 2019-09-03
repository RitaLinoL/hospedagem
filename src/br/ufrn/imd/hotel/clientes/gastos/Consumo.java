package br.ufrn.imd.hotel.clientes.gastos;

/**
 * Classe Consumo, respons�vel por a��es e dados referente a consumo dos servi�os gerais dos clientes
 *
 * @author Rita Lopes
 * @author Hilton Thallyson
 * @version 1.0
 * @since 2019.2
 *
 */



public class Consumo {
    //ATRIBUTOS
    private int codigo;
    private String descricao;
    private String quantidade;
    private double valorUnitario;

    /**
     * Construtor n�o parametrizado - padr�o
     * */
    public Consumo() {
        this.codigo = 0;
        this.descricao = " ";
        this.quantidade = " ";
        this.valorUnitario = 0.0;
    }

    /**
     * Construtor parametrizado
     * @param codigo - identificador do gasto
     * @param descricao - descri��o textual do gasto
     * @param quantidade - quantidade de vezes que o mesmo servi�os foi usado
     * @param valorUnitario - valor do gasto por unidade de servi�o
     * */
    public Consumo(int codigo, String descricao, String quantidade, Double valorUnitario) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }

    //Getters and setters
    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorUnitario() {
        return this.valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

}
