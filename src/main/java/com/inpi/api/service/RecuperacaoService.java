package com.inpi.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inpi.api.exceptions.GruNaoEncontradaException;
import com.inpi.api.model.Recuperacao;
import com.inpi.api.repository.RecuperacaoRepository;

@Service
public class RecuperacaoService {
	
	@Autowired
	RecuperacaoRepository recuperacaoRepository;
	
	public Recuperacao salvar(Recuperacao recuperacao) {
		recuperacao = recuperacaoRepository.save(recuperacao);
		return (recuperacao);
	}
	
	public Optional<Recuperacao> buscar(Long id){
		
		Optional<Recuperacao> recuperacao = recuperacaoRepository.findById(id);
		
		// if(recuperacao == null) {
			
		//	throw new GruNaoEncontradaException("A GRU nao corresponde a serviço de deposito de DI");
		// }
		
		return recuperacao;
	}

}
