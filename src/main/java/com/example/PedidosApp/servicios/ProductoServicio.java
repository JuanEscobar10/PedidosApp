package com.example.PedidosApp.servicios;

import com.example.PedidosApp.repositorios.IProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoServicio {

    @Autowired
    IProductoRepositorio repositorio;
}
