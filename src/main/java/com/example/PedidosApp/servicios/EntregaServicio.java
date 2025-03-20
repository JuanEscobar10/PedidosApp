package com.example.PedidosApp.servicios;

import com.example.PedidosApp.repositorios.IEntregaRepositoro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntregaServicio {

    @Autowired
    IEntregaRepositoro repositoro;
}
