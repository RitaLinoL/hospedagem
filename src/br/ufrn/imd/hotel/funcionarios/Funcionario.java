package br.ufrn.imd.hotel.funcionarios;

/**
 * Classe Funcionario, classe abstrata que implementa atributos gerais dos funcion�rios
 *
 * @author Rita Lopes
 * @author Hilton Thallyson
 * @version 1.0
 * @since 2019.2
 *
 */

public abstract class Funcionario {
    //ATRIBUTOS
    private String matricula;
    private String nome;
    private double salario;

    /**
     * Construtor parametrizado
     * */
    public Funcionario() {
        this.matricula = "";
        this.nome = "";
        this.salario = 0;
    }

    /**
     * Método Contrutor parametrizado
     * @param matricula - atributo identificador do funcionario
     * @param nome - nome do funcionario
     * @param salario - salario do funcionario
     */
    public Funcionario(String matricula, String nome, double salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
    }

    //SETTERS AND GETTERS
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getMatricula() {
        return this.matricula;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double getSalario() {
        return this.salario;
    }
}
