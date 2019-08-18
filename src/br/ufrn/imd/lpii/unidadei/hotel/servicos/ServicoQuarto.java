package br.ufrn.imd.lpii.unidadei.hotel.servicos;

import java.util.GregorianCalendar;

import br.ufrn.imd.lpii.unidadei.hotel.Hospedagem;
import br.ufrn.imd.lpii.unidadei.hotel.funcionarios.Camareiro;

/**
 * Classe ServicoQuarto, classe que implementa m�todos e atributos dos servi�os oferecidos pelo hotel
 *
 * @author Rita Lopes
 * @author Hilton Thallyson
 * @version 1.0
 * @since 2019.2
 *
 */

public class ServicoQuarto {
	//ATRIBUTOS
	private GregorianCalendar data;
	private Hospedagem hospedagem;
	private Camareiro camareiro;
	private boolean realizado;
	
	/**
	 * Construtor n�o parametrizado
	 * */
	public ServicoQuarto() {
		this.data = new GregorianCalendar();
		this.hospedagem = new Hospedagem();
		this.camareiro = new Camareiro();
		this.realizado = false;
	}
	
	/**
	 * Construtor parametrizado
	 * @param data - parametro contendo a data de realiza��o do servi�o
	 * @param hospedagem - objeto da classe Hospedagem que armazena dados da hospedagem que solicitou o servi�o
	 * @param camareiro - objeto da classe Camareiro que armazena os dados do funcion�rio respons�vel pelo servi�o
	 * @param realizado - estado do servi�o
	 * */
	public ServicoQuarto(GregorianCalendar data, Hospedagem hospedagem, Camareiro camareiro, boolean realizado) {
		this.data = data;
		this.hospedagem = hospedagem;
		this.camareiro = camareiro;
		this.realizado = realizado;
	}
	
	//Setters and getters
	public GregorianCalendar getData() {
		return this.data;
	}

	public void setData(GregorianCalendar data) {
		this.data = data;
	}

	public Hospedagem getHospedagem() {
		return hospedagem;
	}

	public void setHospedagem(Hospedagem hospedagem) {
		this.hospedagem = hospedagem;
	}

	public Camareiro getCamareiro() {
		return camareiro;
	}

	public void setCamareiro(Camareiro camareiro) {
		this.camareiro = camareiro;
	}

	public boolean getRealizado() {
		return this.realizado;
	}
	
	/**
	  * realizarServicoQuarto - Metodo que marca um servi�o como realizado
	  * 
	  * @param hospedagem - parametro correspondente ao servico de hospedagem realizado 
	  *	@param camareiro - funcionario responsavel pelo servico
	  */
	public void realizarServicoQuarto(Hospedagem hospedagem, Camareiro camareiro) {
		this.hospedagem = hospedagem;
		this.camareiro = camareiro;
		this.realizado = true;
	}
	
	/**
	  * agendarServicoQuarto - Metodo que agenda servico de quarto
	  * 
	  * @param data - a data prevista para realizacao do servico de quarto
	  * @param hospedagem - parametro correspondente ao servico de hospedagem realizado 
	  *	@param camareiro - funcionario responsavel pelo servico
	  */
	public void agendarServicoQuarto(GregorianCalendar data, Hospedagem hospedagem, Camareiro camareiro) {
		
		
		GregorianCalendar dataAtual = new GregorianCalendar();
		if (data.compareTo(dataAtual) >= 0) {
			this.data = data;
			this.hospedagem = hospedagem;
			this.camareiro = camareiro;
			this.realizado = false;
		}else {
			System.out.println("data de servi�o inv�lida");
		}

		
	}
	
}
