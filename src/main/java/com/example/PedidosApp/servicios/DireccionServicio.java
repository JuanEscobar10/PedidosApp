package com.example.PedidosApp.servicios;

import com.example.PedidosApp.repositorios.IDireccionRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DireccionServicio {

    @Autowired
    IDireccionRepositorio repositorio;
}
