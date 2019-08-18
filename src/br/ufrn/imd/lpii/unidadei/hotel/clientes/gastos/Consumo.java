package br.ufrn.imd.lpii.unidadei.hotel.clientes.gastos;

/**
 * Classe Consumo, responsável por ações e dados referente a consumo dos serviços gerais dos clientes
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
	 * Construtor não parametrizado - padrão
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
	 * @param descricao - descrição textual do gasto
	 * @param quantidade - quantidade de vezes que o mesmo serviços foi usado
	 * @param valorUnitario - valor do gasto por unidade de serviço
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
