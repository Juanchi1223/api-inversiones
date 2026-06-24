package com.juanchi1223.apiinversiones.infrastructure.web.dto;

import com.juanchi1223.apiinversiones.domain.model.AssetType;

public record AssetTypeResponse(Integer id, String name) {

  public static AssetTypeResponse from(AssetType assetType) {
    return new AssetTypeResponse(assetType.id(), assetType.name());
  }
}
