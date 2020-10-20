package com.springboot.app.productos.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.app.ms.commons.models.entity.Producto;

public interface ProductoDao extends CrudRepository<Producto, Long>{

}
