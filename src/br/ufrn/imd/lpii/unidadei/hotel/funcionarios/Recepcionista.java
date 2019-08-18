package br.ufrn.imd.lpii.unidadei.hotel.funcionarios;

import java.util.ArrayList;

/**
 * Classe Recepcionista, herda de funcionarios e é responsavel pelos dados especificos dos recepcionistas
 *
 * @author Rita Lopes
 * @author Hilton Thallyson
 * @version 1.0
 * @since 2019.2
 *
 */

public class Recepcionista extends Funcionario {
	//ATRIBUTOS
	private ArrayList<String> idiomasQueDomina;
	
	/**
	 * Método Contrutor não parametrizado
	 */
	public Recepcionista() {
		super();
		this.idiomasQueDomina = new ArrayList<String>();
		this.idiomasQueDomina.add(" ");
	}
	
	/**
	 * Método Contrutor parametrizado
	 * @param matricula - atributo identificador do funcionario
	 * @param nome - nome do funcionario
	 * @param salario - salario do funcionario
	 * @param idiomas - lista de idiomas nos quais o recepcionista é fluente
	 */
	public Recepcionista(String matricula, String nome, double salario, ArrayList<String> idiomas) {
		super(matricula, nome, salario);
		this.idiomasQueDomina = new ArrayList<String>();
		this.idiomasQueDomina.addAll(idiomas);
	}
	
	//MÉTODOS SETTERS AND GETTERS
	public void setIdiomasQueDomina(ArrayList <String> idiomas) {
		this.idiomasQueDomina = idiomas;
	}
	public ArrayList<String> getIdiomasQueDomina(){
		return this.idiomasQueDomina;
	}
	
	
	/**
	 * Método addIdioma, responsavel pela adiçao individual de idiomas
	 * @param idioma - str com idioma a ser adicionado
	 */
	public void addIdioma(String idioma) {
		this.idiomasQueDomina.add(idioma);
	}
}
