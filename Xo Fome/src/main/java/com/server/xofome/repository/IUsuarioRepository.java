package com.server.xofome.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.server.xofome.model.Usuario;

public interface IUsuarioRepository extends JpaRepository<Usuario,String> {

}
