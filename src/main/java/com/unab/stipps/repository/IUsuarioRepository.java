package com.unab.stipps.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unab.stipps.entity.UsuarioEntity;

public interface IUsuarioRepository extends JpaRepository<UsuarioEntity, Long>{
}

