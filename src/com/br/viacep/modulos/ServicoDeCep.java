package com.br.viacep.modulos;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

public class ServicoDeCep {
	static String webService = "http://viacep.com.br/ws/";
	static int codigoSucesso = 200;
	
	public static Endereco buscaEndereco(String cep) throws Exception {
		cep.replaceAll("[^0-9]", "");
		String urlParaChamada = webService + cep + "/json";
		
		try {
            URL url = new URL(urlParaChamada);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();

            if (conexao.getResponseCode() != codigoSucesso)
                throw new RuntimeException("HTTP error code : " + conexao.getResponseCode());

            BufferedReader resposta = new BufferedReader(new InputStreamReader((conexao.getInputStream())));
            String enderecoString = Util.converteJsonEmString(resposta);
            
            System.out.println(enderecoString);
            
            Gson gson = new Gson();

            Endereco endereco = gson.fromJson(enderecoString, Endereco.class);
            
            return endereco;
        } catch (Exception e) {
            throw new Exception("ERRO: " + e);
        }
	}
}
