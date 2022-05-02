package com.pdv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pdv.model.ClienteModel;
import com.pdv.repository.ClienteRepository;

@RestController
@RequestMapping("/clientes")
@CrossOrigin("*")
public class ClienteController {
	
	@Autowired
	ClienteRepository repositoryCliente;
	
	@PostMapping
	public ResponseEntity <ClienteModel> post(@RequestBody ClienteModel cliente){
		
		return ResponseEntity.status(HttpStatus.CREATED).body(repositoryCliente.save(cliente));
	}
	
	
}
