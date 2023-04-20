package com.br.viacep.principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.br.viacep.modulos.Endereco;
import com.br.viacep.modulos.ServicoDeCep;

public class Principal {
	
	public static void main(String[] args) throws Exception {
	
		List<Endereco> enderecos = new ArrayList<Endereco>();
		for (int i = 0; i < 5; i++) {
			String cep = new Scanner(System.in).nextLine();
			Endereco endereco = ServicoDeCep.buscaEndereco(cep);
			enderecos.add(endereco);
		}
		
		for (Endereco endereco : enderecos) {
			System.out.println("Logradouro: " + endereco.getLogradouro());
			System.out.println("Bairro: " + endereco.getBairro());
			System.out.println("Localidade: " + endereco.getLocalidade());
		}
	}
}	
