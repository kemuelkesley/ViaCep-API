package com.br.viacep.modulos;

import java.io.BufferedReader;
import java.io.IOException;

public class Util {
	
    /**
     * Recebe um Json e converte em string.
     */
    public static String converteJsonEmString(BufferedReader bufferedReader) throws IOException {
        String resposta, jsonEmString = "";
        while ((resposta = bufferedReader.readLine()) != null) {
            jsonEmString += resposta;
        }
        return jsonEmString;
    }
}
