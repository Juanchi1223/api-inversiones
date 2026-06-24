package com.juanchi1223.apiinversiones.infrastructure.persistence;

import com.juanchi1223.apiinversiones.domain.model.AssetType;
import com.juanchi1223.apiinversiones.domain.repository.AssetTypeRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AssetTypeRepositoryAdapter implements AssetTypeRepository {

  private final AssetTypeJpaRepository jpa;

  public AssetTypeRepositoryAdapter(AssetTypeJpaRepository jpa) {
    this.jpa = jpa;
  }

  @Override
  public List<AssetType> findAll() {
    return jpa.findAll().stream().map(e -> e.toDomain()).toList();
  }
}
