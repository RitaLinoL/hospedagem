package br.ufrn.imd.lpii.unidadei.hotel;

import java.util.GregorianCalendar;

import br.ufrn.imd.lpii.unidadei.hotel.clientes.Conta;
import br.ufrn.imd.lpii.unidadei.hotel.clientes.Hospede;


/**
 * Classe Hospedagem, responsavel pela hospedagem feitas no hotel
 *
 * @author Rita Lopes
 * @author Hilton Thallyson
 * @version 1.0
 * @since 2019.2
 *
 */


public class Hospedagem {
	//ATRIBUTOS 
	private int codigo;
	private GregorianCalendar dataEntrada;
	private GregorianCalendar dataSaida;
	private Hospede hospede;
	private Aposento aposento;
	private Conta conta;
	
	/**
	 * Construtor padrão
	 * */
	public Hospedagem() {
		this.codigo = -1;
		this.dataEntrada = new GregorianCalendar();
		this.dataSaida = new GregorianCalendar();
		this.hospede = new Hospede();
		this.aposento = new Aposento();
		this.conta = new Conta();
		
	}
	/**
	 * Construtor parametrizado
	 * @param codigo - identificador da hospedagem
	 * @param dataEntrada - chegada no hotel
	 * @param dataSaida - saída do hotel
	 * @param hospede - quem é o cliente responsável pela hospedagem
	 * @param aposento - local privado onde o cliente será hospedado
	 * @param conta - referência à conta com os gastos do cliente que é responsável pela hospedagem
	 * */
	public Hospedagem(int codigo, GregorianCalendar dataEntrada, GregorianCalendar dataSaida, Hospede hospede, Aposento aposento, Conta conta) {
		this.codigo = codigo;
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
		this.hospede = hospede;
		this.aposento = aposento;
		this.conta = conta;
		
	}
	
	//GETTERS AND SETTERS
	public int getCodigo() {
		return this.codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public GregorianCalendar getDataEntrada() {
		return this.dataEntrada;
	}
	public void setDataEntrada(GregorianCalendar dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	
	public GregorianCalendar getDataSaida() {
		return this.dataSaida;
	}
	public void setDataSaida(GregorianCalendar dataSaida) {
		this.dataSaida = dataSaida;
	}
	
	public Hospede getHospede() {
		return this.hospede;
	}
	public void setHospede(Hospede hospede) {
		this.hospede = hospede;
	}
	
	public Aposento getAposento() {
		return this.aposento;
	}
	public void setAposento(Aposento aposento) {
		this.aposento = aposento;
	}
	
	public Conta getConta() {
		return this.conta;
	}
	public void setConta(Conta conta) {
		this.conta = conta;
	}
}
