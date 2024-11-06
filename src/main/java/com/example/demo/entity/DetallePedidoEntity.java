package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "detalles_pedidos")
public class DetallePedidoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer cantidad;
    private Double precioUnitario;

    @ManyToOne
    @JoinColumn(name = "pedido_id")
    private PedidoEntity pedido;

    @ManyToOne
    @JoinColumn(name = "producto_id")
    private ProductoEntity producto;
}
