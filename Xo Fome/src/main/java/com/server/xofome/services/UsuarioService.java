package com.server.xofome.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.server.xofome.model.Usuario;
import com.server.xofome.repository.IUsuarioRepository;

@Service
@Transactional
public class UsuarioService implements IUsuarioService{

	@Autowired
	private IUsuarioRepository repository;
	
	
	@Override
	public Usuario save(Usuario usuario) {
		return repository.save(usuario);
	}

}
