package com.br.viacep.modulos;

import java.io.FileWriter;

import com.google.gson.JsonObject;

public class GerenciarArquivo {

	public String criarArquivoJson(Endereco endereco, String arquivoJson) {
		JsonObject obj = new JsonObject();
		obj.addProperty("logradouro", endereco.getLogradouro());
		obj.addProperty("bairro", endereco.getBairro());
		obj.addProperty("cidade", endereco.getLocalidade());

		try {
			FileWriter file = new FileWriter("C:/Users/kemuelsantos/Desktop/dados/arquivo.json");
			file.write(obj.toString());
			file.flush();
			System.out.println("Arquivo criado com sucesso");
			file.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return arquivoJson;
	}

	

}
