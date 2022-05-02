package com.pdv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pdv.model.ProdutoModel;

public interface ProdutoRepository extends JpaRepository<ProdutoModel,Long>{

}
