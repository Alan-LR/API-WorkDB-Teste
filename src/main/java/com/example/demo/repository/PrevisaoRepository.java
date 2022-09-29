package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.PrevisaoTabela;

public interface PrevisaoRepository extends JpaRepository<PrevisaoTabela, String> {

}
