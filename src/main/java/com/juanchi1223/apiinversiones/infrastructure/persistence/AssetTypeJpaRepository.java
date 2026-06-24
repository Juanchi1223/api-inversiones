package com.juanchi1223.apiinversiones.infrastructure.persistence;

import com.juanchi1223.apiinversiones.infrastructure.persistence.entity.AssetTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssetTypeJpaRepository extends JpaRepository<AssetTypeEntity, Integer> {}
