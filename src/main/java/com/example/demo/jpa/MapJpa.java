package com.example.demo.jpa;

import com.example.demo.model.MapEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

public interface MapJpa extends JpaRepository<MapEntity,String>,
        JpaSpecificationExecutor<MapEntity>,Serializable {
}
