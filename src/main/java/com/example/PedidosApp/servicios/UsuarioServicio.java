package com.example.PedidosApp.servicios;

import com.example.PedidosApp.repositorios.IUsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServicio {
    @Autowired
    IUsuarioRepositorio repositorio;
}
