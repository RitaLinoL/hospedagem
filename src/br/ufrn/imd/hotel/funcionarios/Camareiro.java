package br.ufrn.imd.hotel.funcionarios;


/**
 * Classe Camareiro, herda de funcionarios e � responsavel pelos dados especificos dos camareiros
 *
 * @author Rita Lopes
 * @author Hilton Thallyson
 * @version 1.0
 * @since 2019.2
 *
 */

public class Camareiro extends Funcionario {
    /**
     * Construtor n�o parametrizado
     * */
    public Camareiro() {
        super();
    }
    /**
     * Contrutor parametrizado
     * @param matricula - atributo identificador do funcionario
     * @param nome - nome do funcionario
     * @param salario - salario do funcionario
     */
    public Camareiro(String matricula, String nome, double salario) {
        super(matricula, nome, salario);
    }

}
