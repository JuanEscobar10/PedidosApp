package com.example.PedidosApp.servicios;

import com.example.PedidosApp.repositorios.IRepartidorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RepartidorServicio {

    @Autowired
    IRepartidorRepositorio repositorio;
}
