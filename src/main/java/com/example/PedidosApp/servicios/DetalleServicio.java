package com.example.PedidosApp.servicios;

import com.example.PedidosApp.repositorios.IDetalleRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetalleServicio {

    @Autowired
    IDetalleRepositorio repositorio;
}
