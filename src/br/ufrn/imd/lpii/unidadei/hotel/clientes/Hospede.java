package br.ufrn.imd.lpii.unidadei.hotel.clientes;

/**
 * Classe Hospede, responsavel pelos dados pessoais do cliente 
 *
 * @author Rita Lopes
 * @author Hilton Thallyson
 * @version 1.0
 * @since 2019.2
 *
 */

public class Hospede {
	//ATRIBUTOS
	private int codigo;
	private String nome;
	private String CPF;
	private String RG;
	private String telefone;
	
	/**
	 * Construtor não parametrizado - padrão
	 * */
	public Hospede() {
		this.codigo = 0;
		this.nome = " ";
		this.CPF = " ";
		this.RG = " ";
		this.telefone = " ";
	}
	
	
	/**
	 * Construtor parametrizadO
	 * @param codigo - identificador do hospede
	 * @param nome - nome do hospede
	 * @param cpf - cadastro da pessoa física (do hospede)
	 * @param rg - Registro Geral do hospede
	 * @param telefone - contato do hospede
	 * */
	public Hospede(int codigo, String nome, String cpf, String rg, String telefone) {
		this.codigo = codigo;
		this.nome = nome;
		this.CPF = cpf;
		this.RG = rg;
		this.telefone = telefone;
	}
	
	//GETTERS AND SETTERS
	public int getCodigo() {
		return this.codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return this.CPF;
	}
	
	public void setCpf(String cpf) {
		this.CPF = cpf;
	}
	
	public String getRg() {
		return this.RG;
	}
	
	public void setRg(String rg) {
		this.RG = rg;
	}
	
	public String getTelefone() {
		return this.telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
