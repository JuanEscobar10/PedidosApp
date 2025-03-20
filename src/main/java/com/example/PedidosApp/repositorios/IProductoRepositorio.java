package com.example.PedidosApp.repositorios;

import com.example.PedidosApp.modelos.Tienda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductoRepositorio extends JpaRepository<Tienda,Integer> {
}
