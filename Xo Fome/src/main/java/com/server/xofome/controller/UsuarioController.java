package com.server.xofome.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.server.xofome.model.Usuario;
import com.server.xofome.services.IUsuarioService;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController {

	@Autowired
	private IUsuarioService service;

	// public usuario save( Pedido pedido );
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Usuario> save(@RequestBody Usuario requestBuy) {
		Usuario usuario = service.save(requestBuy);
		return new ResponseEntity<Usuario>(usuario, HttpStatus.OK);
	}

}
