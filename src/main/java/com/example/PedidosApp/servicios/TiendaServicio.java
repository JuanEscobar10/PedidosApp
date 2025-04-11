package com.example.PedidosApp.servicios;

import com.example.PedidosApp.repositorios.ITiendaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TiendaServicio {

    @Autowired
    ITiendaRepositorio repositorio;

}
