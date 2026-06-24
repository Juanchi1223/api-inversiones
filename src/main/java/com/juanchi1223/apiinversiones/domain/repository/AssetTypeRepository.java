package com.juanchi1223.apiinversiones.domain.repository;

import com.juanchi1223.apiinversiones.domain.model.AssetType;

import java.util.List;

public interface AssetTypeRepository {
  List<AssetType> findAll();
}
