package com.example.PedidosApp.modelos;

import jakarta.persistence.*;

import java.math.BigDecimal;


@Entity
@Table(name="Detalle_Pedido")
public class Detalle {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="detalle_pedido")
    private Integer detalle_pedido;
    @Column(name="cantidad", nullable = false)
    private Integer cantidad;
    @Column(name="subtotal",nullable = false)
    private BigDecimal subtotal;

    public Detalle() {
    }

    public Detalle(Integer detalle_pedido, Integer cantidad, BigDecimal subtotal) {
        this.detalle_pedido = detalle_pedido;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
    }

    public Integer getDetalle_pedido() {
        return detalle_pedido;
    }

    public void setDetalle_pedido(Integer detalle_pedido) {
        this.detalle_pedido = detalle_pedido;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }
}
