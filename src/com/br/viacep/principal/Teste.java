package com.br.viacep.principal;

import java.io.File;
import java.io.IOException;

public class Teste {

	public static void main(String[] args) {
		
		File arquivo = new File("C:/Users/kemuelsantos/Desktop/dados/arquivo.txt");
		
		try {
			arquivo.createNewFile();
			System.out.print("Arquivo criado com sucesso!");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	

}
