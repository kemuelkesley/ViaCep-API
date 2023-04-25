package com.br.viacep.modulos;

public class BackupArquivo {
	package com.br.viacep.modulos;

	import java.io.File;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.FileWriter;

	import com.google.gson.Gson;
	import com.google.gson.JsonArray;
	import com.google.gson.JsonElement;
	import com.google.gson.JsonObject;
	import com.google.gson.JsonParser;

	public class GerenciarArquivo {
		
		private String diretorio = "C:/Users/kemuelsantos/Desktop/dados/arquivo.json";

		public String criarArquivoJson(Endereco endereco, String arquivoJson) throws FileNotFoundException {
			JsonObject obj = new JsonObject();
			obj.addProperty("logradouro", endereco.getLogradouro());
			obj.addProperty("bairro", endereco.getBairro());
			obj.addProperty("cidade", endereco.getLocalidade());
			
			File arquivo = new File(diretorio);
			
			try {
				FileWriter file = new FileWriter(arquivo);
				
				if (arquivo.exists()) {
					file.write(incrementarArquivo(endereco, diretorio));
				} else {
					file.write(obj.toString());
				}
				
				file.flush();
				System.out.println("Arquivo criado com sucesso");
				file.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			return arquivoJson;
		}
		
		
		public String incrementarArquivo(Endereco endereco, String diretorio) throws FileNotFoundException {
			Gson gson = new Gson();
			String novoEndereco = gson.toJson(endereco);
			
			FileReader file = new FileReader(diretorio);
			JsonArray json = (JsonArray) JsonParser.parseReader(file);
			
			json.add(novoEndereco);
			
			String output = "";
			for (JsonElement element : json) {
				output += element;
			}
			
			return output;
		}
		

	}

}
