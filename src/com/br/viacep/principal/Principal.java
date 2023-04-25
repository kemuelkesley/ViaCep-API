package com.br.viacep.principal;
import java.util.Scanner;
import com.br.viacep.modulos.GerenciarArquivo;
import com.br.viacep.modulos.Endereco;
import com.br.viacep.modulos.ServicoDeCep;

public class Principal {

	public static void main(String[] args) throws Exception {

		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe o Cep:");
		String cep = scanner.next();

		try {
			Endereco endereco = ServicoDeCep.buscaEndereco(cep);
			GerenciarArquivo criarArquivo = new GerenciarArquivo();
			criarArquivo.criarArquivoJson(endereco, "arquivo.json");
			
			
			
			System.out.println("Logradouro: " + endereco.getLogradouro());
			System.out.println("Bairro: " + endereco.getBairro());
			System.out.println("Logradouro: " + endereco.getLocalidade());
			
			
			
		} catch (Exception e) {
			System.out.println("Cep: " + cep + " não encontrado.");
		}

	}
}
