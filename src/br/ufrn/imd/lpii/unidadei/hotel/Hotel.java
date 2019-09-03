package br.ufrn.imd.lpii.unidadei.hotel;

import java.util.ArrayList;

import br.ufrn.imd.lpii.unidadei.hotel.funcionarios.*;

/**
 * Classe Hotel, responsavel pelos atributos e acoes da entidade hotel
 *
 * @author Rita Lopes
 * @author Hilton Thallyson
 * @version 1.0
 * @since 2019.2
 *
 */


public class Hotel {
	//ATRIBUTOS
	private String nome;
	private String CNPJ;
	private ArrayList<Reserva> hospedagens;
	private ArrayList<Recepcionista> recepcionistas;
	private ArrayList<Camareiro> camareiros;

	/**
	 * Construtor padrão
	 * */
	public Hotel() {
		this.nome = " ";
		this.CNPJ = " ";
		this.hospedagens = new ArrayList<Reserva>();
		this.hospedagens.add(new Reserva());
		this.recepcionistas = new ArrayList<Recepcionista>();
		this.recepcionistas.add(new Recepcionista());
		this.camareiros = new ArrayList<Camareiro>();
		this.camareiros.add(new Camareiro());
	}

	/**
	 * Construtor parametrizado
	 * @param nome - nome identificador do Hotel
	 * @param cnpj - número do cadastro nacional de pessoa juridica do hotel
	 * @param hospedagens- lista de hospedagens feitas no hotel
	 * @param recepcionistas - lista de funcionários recepcionistas no hotel
	 * @param camareiro - lista de funcionários camareiros no hotel
	 * */
	public Hotel(String nome, String cnpj, ArrayList<Reserva> hospedagens, ArrayList<Recepcionista> recepcionistas,
			ArrayList<Camareiro> camareiros) {
		this.nome = nome;
		this.CNPJ = cnpj;
		this.hospedagens = new ArrayList<Reserva>();
		this.hospedagens.addAll(hospedagens);
		this.recepcionistas = new ArrayList<Recepcionista>();
		this.recepcionistas.addAll(recepcionistas);
		this.camareiros = new ArrayList<Camareiro>();
		this.camareiros.addAll(camareiros);
	}
	
	/**
	 * Construtor parametrizado para criação inicial do hotel
	 * @param nome - nome identificador do Hotel
	 * @param cnpj - numero do cadastro nacional de pessoa juridica do hotel
	 * */
	public Hotel(String nome, String cnpj) {
		this.nome = nome;
		this.CNPJ = cnpj;
		this.hospedagens = new ArrayList<Reserva>();
		this.hospedagens.add(new Reserva());
		this.recepcionistas = new ArrayList<Recepcionista>();
		this.recepcionistas.add(new Recepcionista());
		this.camareiros = new ArrayList<Camareiro>();
		this.camareiros.add(new Camareiro());
		
	}

	///Metodos Getters and Setters
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCNPJ() {
		return this.CNPJ;
	}

	public void setCNPJ(String cnpj) {
		this.CNPJ = cnpj;
	}

	public ArrayList<Reserva> getHospedagens(){
		return this.hospedagens;
	}
	public void setHospedagens(ArrayList<Reserva> hospedagens) {
		this.hospedagens = hospedagens;
	}
	
	public ArrayList<Recepcionista> getRecepcionistas(){
		return this.recepcionistas;
	}
	public void setRecepcionistas(ArrayList<Recepcionista> recepcionistas) {
		this.recepcionistas= recepcionistas;
	}
	
	public ArrayList<Camareiro> getCamareiros(){
		return this.camareiros;
	}
	public void setCamareiros(ArrayList<Camareiro> camareiros) {
		this.camareiros = camareiros;
	}
	
	public void addRecepcionista(Recepcionista recepcionista){
		this.recepcionistas.add(recepcionista);	
	}
	public void addCamareiros(Camareiro camareiro){
		this.camareiros.add(camareiro);	
	}	
}
