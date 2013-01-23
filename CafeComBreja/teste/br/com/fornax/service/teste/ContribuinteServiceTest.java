package br.com.fornax.service.teste;

import br.com.fornax.domain.Pessoa;
import br.com.fornax.impl.ContribuinteImpl;
import br.com.fornax.service.ContribuinteService;

public class ContribuinteServiceTest {

	public static void main(String[] args){
		
		ContribuinteServiceTest test = new ContribuinteServiceTest();
		test.salvarComSucessoContribuinte();
		System.out.println("Teste executado com sucesso!");
	}
	
	public void salvarComSucessoContribuinte(){
		Pessoa contruinte = new Pessoa();
		contruinte.setId((short) (0));
		contruinte.setNome("nome");
		contruinte.setApelido("apelido");
		contruinte.setEmail("email");
		contruinte.setTelefone("telefone");
		
		ContribuinteService service = new ContribuinteImpl();
			
		service.salvarContribuinte(contruinte);
		
		String str = new String("asd123asd123");
		str = str.replaceAll("[^0-9]*", "").trim();
		System.out.println(str);
	}
}
