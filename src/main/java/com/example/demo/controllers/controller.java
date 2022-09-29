package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.PrevisaoTabela;
import com.example.demo.models.Coord;

import com.example.demo.services.ApiService;

@RestController
public class controller {

    @Autowired
    private ApiService apiService;

    // Rota para pegar a temperatura de uma cidade - passando sua latitude e
    // longitude
    @RequestMapping(value = "{lat}/{lon}/{appid}", method = RequestMethod.GET)
    public Coord getRota(@PathVariable String lat,
            @PathVariable String lon, @PathVariable String appid) throws Exception {
        Coord resultado = apiService.pegarTemperatura(lat, lon, appid);
        return resultado;
    }

    // Rota para pegar o histórico de buscas no banco de dados
    @GetMapping("/pegarRegistros")
    public ResponseEntity<List<PrevisaoTabela>> pegarHistoricoDeBuscas() {
        List<PrevisaoTabela> resultado = apiService.pegarHistoricoDeBuscas();
        return ResponseEntity.ok().body(resultado);
    }
}
