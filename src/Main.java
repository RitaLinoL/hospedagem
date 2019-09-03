import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import br.ufrn.imd.lpii.unidadei.hotel.Aposento;
import br.ufrn.imd.lpii.unidadei.hotel.Reserva;
import br.ufrn.imd.lpii.unidadei.hotel.Hotel;
import br.ufrn.imd.lpii.unidadei.hotel.clientes.Conta;
import br.ufrn.imd.lpii.unidadei.hotel.clientes.Hospede;
import br.ufrn.imd.lpii.unidadei.hotel.clientes.gastos.Consumo;
import br.ufrn.imd.lpii.unidadei.hotel.funcionarios.Camareiro;
import br.ufrn.imd.lpii.unidadei.hotel.funcionarios.Recepcionista;
import br.ufrn.imd.lpii.unidadei.hotel.servicos.ServicoQuarto;

/**
 * Classe Main, classe usada para testes
 *
 * @author Rita Lopes
 * @author Hilton Thallyson
 * @version 1.0
 * @since 2019.2
 *
 */

public class Main {

	public static void main(String[] args) {		
		
		Scanner leitor = new Scanner(System.in);
		
		
		ServicoQuarto servico = new ServicoQuarto();
			
				
		///Criação do hotel 
		System.out.println("CRIANDO SEU HOTEL...");
		System.out.println("Digite o nome do seu hotel.");
		String nome_hotel = leitor.next();
		System.out.println("Digite o CNPJ do seu hotel.");
		String cnpj_hotel = leitor.next();
		
		Hotel hotel = new Hotel(nome_hotel, cnpj_hotel);
	
		int opcao = -1;
		///loop de exibicao do menu
		while(true) {
			System.out.println();
			System.out.println(String.format("Welcome at hotel %s", hotel.getNome()));
			System.out.println("Digite o número correspondente a sua opção");
			
			System.out.println("1 - Adicionar Recepcionistas \n" +
					"2 - Adicionar Camareiros \n " +
					"3 - Nova Reserva\n" +
					"4 - Agendar serviço de quarto\n" +
					"5 - Realizar serviço de quarto\n" +
					"6 - Listar funcionários\n" +
					"" +
					"" +
					"" +
					" 0 - sair");
			opcao = leitor.nextInt();
			
			
			switch (opcao) {
			case 1:
				//adicionar recepcionista in array recepcionistas do hotel
				Recepcionista recepcionista;
				System.out.print("Digite a matricula: ");
				String matricula_r = leitor.next();
				System.out.print("Digite o nome: ");
				String nome_r = leitor.next();
				System.out.print("Digite o salário: ");
				Double salario_r = leitor.nextDouble();

				System.out.println("Quais idiomas o recepcionista domina? ");
				ArrayList<String> idiomas = new ArrayList<String>();
				
				boolean addId = true;
				while(addId){
					System.out.println("Digite o idioma.");
					idiomas.add(leitor.next());
					
					System.out.println("1- adicionar idioma");
					System.out.println("0 - finalizar cadastro");
					addId = leitor.nextInt() == 1? true:false;					
				}
				
				recepcionista = new Recepcionista(matricula_r, nome_r, salario_r, idiomas);
				
				hotel.addRecepcionista(recepcionista);
				
				break;
			case 2:
				//adicionar camareiro in array camareiros do hotel
				Camareiro camareiro;
				System.out.print("Digite a matricula: ");
				String matricula_c = leitor.next();
				System.out.print("Digite o nome: ");
				String nome_c = leitor.next();
				System.out.print("Digite o salário: ");
				Double salario_c = leitor.nextDouble();
				
				camareiro = new Camareiro(matricula_c, nome_c, salario_c);
				
				hotel.addCamareiros(camareiro);
				break;
			case 3:
				//adicionar hospedagens in array hospedagens
				
				break;
			case 4:
				//agendar serviço de quarto
				
				Reserva reserva = new Reserva();
				GregorianCalendar data = new GregorianCalendar();
				
						
				break;
			case 5:
				break;
			case 6:
				ArrayList<Recepcionista> recepcionistas = hotel.getRecepcionistas();
				System.out.println("RECEPCIONISTA");
				for(Recepcionista r : recepcionistas) {
					  System.out.println(String.format("Matricula: ", r.getMatricula()));
					  System.out.println(String.format("Nome: ", r.getNome()));
				}
				
				ArrayList<Camareiro> camareiros = new ArrayList<Camareiro>();
				camareiros.addAll(hotel.getCamareiros());
				System.out.println("RECEPCIONISTA");
				for(Camareiro c : camareiros) {
					  System.out.println(String.format("Matricula: ", c.getMatricula()));
					  System.out.println(String.format("Nome: ", c.getNome()));
				} 
				break;
			case 7:
				break;
			}
			
			if(opcao == 0 ){
				break;
			}
		}
		System.out.println("GOOD BYE!");
	}

}
