package com.nex.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nex.cursomc.domain.Cliente;
import com.nex.cursomc.repositories.ClienteRepository;
import com.nex.cursomc.services.exception.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;
	
	public Cliente find(Integer id) {
		   Optional<Cliente> obj = repo.findById(id);
		   return obj.orElseThrow(() -> new ObjectNotFoundException(
		      "Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
		}
	
}

