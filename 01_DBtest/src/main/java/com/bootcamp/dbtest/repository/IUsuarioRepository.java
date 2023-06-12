package com.bootcamp.dbtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootcamp.dbtest.entity.Usuario;

public interface IUsuarioRepository extends JpaRepository<Usuario, Long> {

}
