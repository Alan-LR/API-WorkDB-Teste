package com.example.demo.services;

import java.net.URL;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.HttpURLConnection;

import com.example.demo.models.PrevisaoTabela;
import com.example.demo.models.Coord;
import com.example.demo.repository.PrevisaoRepository;
import com.example.demo.util.Util;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.google.gson.Gson;

@Service
public class ApiService {

        @Autowired
        private PrevisaoRepository prevRep;

        static String webService = "https://api.openweathermap.org/data/2.5/weather?";
        static int codigoSucesso = 200;

        // Metodo para buscar a temperatura de uma cidade com a API OpenWeathermap
        public Coord pegarTemperatura(String lat, String lon, String appid) throws Exception {

                // Cria a URL que vamos acessar com os parametros que precisamos
                String urlChamada = webService + "lat=" + lat + "&lon=" + lon + "&appid=" + appid;

                try {
                        URL url = new URL(urlChamada);
                        // Faz a conexao ao site da URL que foi montada
                        HttpURLConnection conexao = (HttpURLConnection) url.openConnection();

                        // Testa se o retorno da URL funcionou ou retorna um erro
                        if (conexao.getResponseCode() != codigoSucesso)
                                throw new RuntimeException("HTTP error code : " + conexao.getResponseCode());

                        BufferedReader resposta = new BufferedReader(new InputStreamReader((conexao.getInputStream())));

                        // Funcao da classe util para converter JSON em String
                        String jsonEmString = Util.converteJsonEmString(resposta);
                        Gson gson = new Gson();
                        Coord cr = gson.fromJson(jsonEmString, Coord.class);

                        // Cria um objeto para salvar no banco de dados
                        PrevisaoTabela salvaResultado = new PrevisaoTabela(cr.getId(), cr.getMain().getTemp(),
                                        cr.getMain().getFeels_like(), cr.getMain().getTemp_min(),
                                        cr.getMain().getTemp_max(), cr.getMain().getPressure(),
                                        cr.getMain().getHumidity(), cr.getMain().getSea_level(),
                                        cr.getMain().getGrnd_level());

                        System.out.println(cr);
                        System.out.println(salvaResultado);
                        prevRep.save(salvaResultado);

                        return cr;
                } catch (Exception e) {
                        throw new Exception("ERRO: " + e);
                }

        }

        // Metodo para retornar o historico de pesquisas que ficou gravado no banco de
        // dados
        public List<PrevisaoTabela> pegarHistoricoDeBuscas() {
                return prevRep.findAll();
        }
}
