package com.example.demo.util;

import java.io.BufferedReader;
import java.io.IOException;

public class Util {

    // Essa funcao converte um objeto Json para um objeto String
    public static String converteJsonEmString(BufferedReader buffereReader) throws IOException {
        String resposta, jsonEmString = "";
        while ((resposta = buffereReader.readLine()) != null) {
            jsonEmString += resposta;
        }
        return jsonEmString;
    }
}
