package com.juanchi1223.apiinversiones.infrastructure.persistence.entity;

import com.juanchi1223.apiinversiones.domain.model.AssetType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "asset_type")
@Getter
@NoArgsConstructor
public class AssetTypeEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(nullable = false, unique = true, length = 50)
  private String name;

  public AssetType toDomain() {
    return new AssetType(id, name);
  }
}
