import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import br.ufrn.imd.lpii.unidadei.hotel.Aposento;
import br.ufrn.imd.lpii.unidadei.hotel.Hospedagem;
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
		
		ServicoQuarto servico = new ServicoQuarto();
		Hospedagem hospedagem = new Hospedagem();
		Camareiro camareiro = new Camareiro();
		GregorianCalendar data = new GregorianCalendar();
		servico.agendarServicoQuarto(data, hospedagem, camareiro);
		
		
		
		
		///Ações para criação de hotel
		//gerando recepcionistas
		ArrayList<Recepcionista>  recepcionistas = new ArrayList<Recepcionista>();
		ArrayList<String> idiomas = new ArrayList<String>();
		idiomas.add("Português");
		idiomas.add("Inglês");
		idiomas.add("Hebraico");
		recepcionistas.add(new Recepcionista("1", "Mário", 3.000, idiomas));
		idiomas.clear();
		idiomas.add("Grego");
		idiomas.add("Inglês");
		idiomas.add("Francês");
		recepcionistas.add(new Recepcionista("2", "Mônica", 30000, idiomas));
		
		//gerando camareiros
		ArrayList<Camareiro>  camareiros = new ArrayList<Camareiro>();
		camareiros.add(new Camareiro("1", "Aline", 40000));
		camareiros.add(new Camareiro("2", "José", 40000));
		camareiros.add(new Camareiro("3", "Rodrigo", 40000));
		
		
		//gerando  hospedagens
		ArrayList<Hospedagem> hospedagens = new ArrayList<Hospedagem>();
		Hospede hospede = new Hospede();
		Aposento aposento = new Aposento(1, 300, "description", 2);
		ArrayList<Consumo> consumo = new ArrayList<Consumo>();
		consumo.add(new Consumo(1, "agua", "1", 2.0));
		Conta conta = new Conta(1, 300, false, consumo);
		
		hospedagens.add(new Hospedagem(1, new GregorianCalendar(2019, 7,1,13,40), new GregorianCalendar(2019, 8,1,13,40),hospede, aposento, conta ));
		
		Hotel hotel = new Hotel("Malibu", "23124542-324", hospedagens, recepcionistas, camareiros);
				

		///loop de exibicao do menu
		while(true) {
			break;
		}
	}

}
