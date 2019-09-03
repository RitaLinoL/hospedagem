package br.ufrn.imd.hotel;

import java.util.Set;
import java.util.GregorianCalendar;
import java.util.TreeSet;

import br.ufrn.imd.hotel.clientes.Conta;
import br.ufrn.imd.hotel.clientes.Hospede;


/**
 * Classe Reserva, responsavel pela hospedagem feitas no hotel
 *
 * @author Rita Lopes
 * @author Hilton Thallyson
 * @version 1.0
 * @since 2019.2
 *
 */


public class Reserva {
    //ATRIBUTOS
    private int codigo;
    private GregorianCalendar dataEntrada;
    private GregorianCalendar dataSaida;
    private TreeSet<Hospede> hospedes;
    private Aposento aposento;
    private Conta conta;

    /**
     * Construtor padrão
     * */
    public Reserva() {
        this.codigo = -1;
        this.dataEntrada = new GregorianCalendar();
        this.dataSaida = new GregorianCalendar();
        this.hospedes = new TreeSet<Hospede>();
        this.aposento = new Aposento();
        this.conta = new Conta();

    }
    /**
     * Construtor parametrizado
     * @param codigo - identificador da hospedagem
     * @param dataEntrada - chegada no hotel
     * @param dataSaida - sa�da do hotel
     * @param hospedes - quem são os clientes que ocuparam o quarto
     * @param aposento - local privado onde o cliente ser� hospedado
     * @param conta - refer�ncia � conta com os gastos do cliente que � respons�vel pela hospedagem
     * */
    public Reserva(int codigo, GregorianCalendar dataEntrada, GregorianCalendar dataSaida, Set<Hospede> hospedes, Aposento aposento, Conta conta) {
        this.codigo = codigo;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.hospedes = (TreeSet)hospedes;
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

    public Set<Hospede> getHospede() {
        return this.hospedes;
    }
    public void setHospede(Set<Hospede> hospedes) {
        this.hospedes = (TreeSet)hospedes;
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



    /**
     * @return o primeiro hospede do conjunto ordenado, ele corresponde ao responsavel
     * */
    public Hospede getResponsavel(){
        return hospedes.first();
    }


    /**
     * Adiciona um hospede ao conjunto de hospedes se no aposento houver capacidade
     * @param hospede - o objeto a ser adicionado no conjunto de hospedes
     * @return true se foi possivel adicionar e false se não
     * */
    public boolean addHospede(Hospede hospede){
        if(aposento.getCapacidade() >= hospedes.size()){
            System.out.print("O aposento só suporta ");
            System.out.print(aposento.getCapacidade());
            System.out.println(" Hospedes");
            return false;
        }

        hospedes.add(hospede);
        return true;
    }


}
