package br.ufrn.imd.lpii.unidadei.hotel;



/**
 * Classe Aposento, quarto onde o cliente � hospedado 
 *
 * @author Rita Lopes
 * @author Hilton Thallyson
 * @version 1.0
 * @since 2019.2
 *
 */

public class Aposento {
	//ATRIBUTOS
	private int codigo;
	private double valor;
	private String descricao;
	private int numero;
	
	/**
	 * Construtor padr�o
	 * */
	public Aposento() {
		this.codigo = 0;
		this.valor = 0.0;
		this.descricao = " ";
		this.numero = 0;
	}
	
	/**
	 * Construtor parametrizado
	 * @param codigo - identificador do quarto
	 * @param valor - valor pago pelo aposente
	 * @param descricao - descri��o do ambiente
	 * @param numero - n�mero do quarto para localiza��o
	 * */
	public Aposento(int codigo, double valor, String descricao, int numero) {
		this.codigo = codigo;
		this.valor = valor;
		this.descricao = descricao;
		this.numero = numero;
	}
	
	//SETTERS AND GETTERS
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
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
}
