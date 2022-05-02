package com.pdv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pdv.model.ClienteModel;

public interface ClienteRepository extends JpaRepository<ClienteModel, Long>{

}
