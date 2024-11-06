package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "empleados")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class EmpleadoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellido;
    private String puesto;
    private Double salario;

    @Temporal(TemporalType.DATE)
    private Date fechaContratacion;
}
