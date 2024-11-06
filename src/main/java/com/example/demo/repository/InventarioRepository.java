package com.example.demo.repository;

import com.example.demo.entity.InventarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventarioRepository extends JpaRepository<InventarioEntity, Integer> {
}
