package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "productos")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ProductoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreProducto;
    private String descripcionProducto;
    private Double precio;
    private String categoria;
    private Integer stock;

    @ManyToOne
    @JoinColumn(name = "proveedor_id")
    private ProveedoresEntity proveedor;

    // Relación con Inventario (opcional si Inventario es una tabla separada)
    @OneToOne(mappedBy = "producto", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private InventarioEntity inventario;
}
