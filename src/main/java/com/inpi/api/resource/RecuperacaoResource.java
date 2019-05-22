package com.inpi.api.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inpi.api.exceptions.GruNaoEncontradaException;
import com.inpi.api.model.Recuperacao;
import com.inpi.api.service.RecuperacaoService;

@RestController
@RequestMapping("/recuperacao")
public class RecuperacaoResource {
	
	@Autowired
	RecuperacaoService recuperacaoService;
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Recuperacao> salvar(@RequestBody Recuperacao recuperacao){
		
		recuperacao = recuperacaoService.salvar(recuperacao);	
	
		
		return ResponseEntity.status(HttpStatus.CREATED).body(recuperacao);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> buscar(@PathVariable ("id") Long id) {
		
		Recuperacao recuperacao = null;
		
		try {
			recuperacao = recuperacaoService.buscar(id).get();
			
		} catch (GruNaoEncontradaException e) {
			// TODO Auto-generated catch block
			return ResponseEntity.notFound().build();
		}
		
		
		return ResponseEntity.status(HttpStatus.OK).body(recuperacao);
	}

}
