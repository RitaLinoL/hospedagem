package br.ufrn.imd.hotel.servicos;

import java.util.GregorianCalendar;

import br.ufrn.imd.hotel.Reserva;
import br.ufrn.imd.hotel.funcionarios.Camareiro;

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
    private Reserva reserva;
    private Camareiro camareiro;
    private boolean realizado;

    /**
     * Construtor não parametrizado
     * */
    public ServicoQuarto() {
        this.data = new GregorianCalendar();
        this.reserva = new Reserva();
        this.camareiro = new Camareiro();
        this.realizado = false;
    }

    /**
     * Construtor parametrizado
     * @param data - parametro contendo a data de realiza��o do servi�o
     * @param reserva - objeto da classe Reserva que armazena dados da reserva que solicitou o servi�o
     * @param camareiro - objeto da classe Camareiro que armazena os dados do funcion�rio respons�vel pelo servi�o
     * @param realizado - estado do servi�o
     * */
    public ServicoQuarto(GregorianCalendar data, Reserva reserva, Camareiro camareiro, boolean realizado) {
        this.data = data;
        this.reserva = reserva;
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

    public Reserva getHospedagem() {
        return reserva;
    }

    public void setHospedagem(Reserva reserva) {
        this.reserva = reserva;
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
     * @param reserva - parametro correspondente ao servico de reserva realizado
     *	@param camareiro - funcionario responsavel pelo servico
     */
    public void realizarServicoQuarto(Reserva reserva, Camareiro camareiro) {
        this.reserva = reserva;
        this.camareiro = camareiro;
        this.realizado = true;
    }

    /**
     * agendarServicoQuarto - Metodo que agenda servico de quarto
     *
     * @param data - a data prevista para realizacao do servico de quarto
     * @param reserva - parametro correspondente ao servico de reserva realizado
     *	@param camareiro - funcionario responsavel pelo servico
     */
    public void agendarServicoQuarto(GregorianCalendar data, Reserva reserva, Camareiro camareiro) {


        GregorianCalendar dataAtual = new GregorianCalendar();
        if (data.compareTo(dataAtual) >= 0) {
            this.data = data;
            this.reserva = reserva;
            this.camareiro = camareiro;
            this.realizado = false;
        }else {
            System.out.println("data de servi�o inv�lida");
        }


    }

}
