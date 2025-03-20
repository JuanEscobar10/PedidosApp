package com.example.PedidosApp.servicios;

import com.example.PedidosApp.repositorios.IPagoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PagoServicio {

    @Autowired
    IPagoRepositorio repositorio;
}
