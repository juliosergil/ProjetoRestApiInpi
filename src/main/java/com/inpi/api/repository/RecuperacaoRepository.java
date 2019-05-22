package com.inpi.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inpi.api.model.Recuperacao;

@Repository
public interface RecuperacaoRepository extends JpaRepository<Recuperacao, Integer>{

}
