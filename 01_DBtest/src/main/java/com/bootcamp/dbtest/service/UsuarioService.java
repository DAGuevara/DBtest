package com.bootcamp.dbtest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.dbtest.entity.Usuario;
import com.bootcamp.dbtest.repository.IUsuarioRepository;


@Service
public class UsuarioService implements IUsuarioService {

	@Autowired
	IUsuarioRepository _repository;
	
	@Override
	public List<Usuario> listar() {
	
		List<Usuario> lista=_repository.findAll();
		return lista;
	}

}
