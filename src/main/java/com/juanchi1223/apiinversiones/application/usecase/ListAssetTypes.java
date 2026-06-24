package com.juanchi1223.apiinversiones.application.usecase;

import com.juanchi1223.apiinversiones.domain.model.AssetType;
import com.juanchi1223.apiinversiones.domain.repository.AssetTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Supplier;

@Service
public class ListAssetTypes implements Supplier<List<AssetType>> {

  private final AssetTypeRepository repository;

  public ListAssetTypes(AssetTypeRepository repository) {
    this.repository = repository;
  }

  @Override
  public List<AssetType> get() {
    return repository.findAll();
  }
}
