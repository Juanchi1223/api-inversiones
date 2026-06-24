package com.juanchi1223.apiinversiones.infrastructure.web;

import com.juanchi1223.apiinversiones.application.usecase.ListAssetTypes;
import com.juanchi1223.apiinversiones.infrastructure.web.dto.AssetTypeResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/asset-types")
public class AssetTypeController {

  private final ListAssetTypes listAssetTypes;

  public AssetTypeController(ListAssetTypes listAssetTypes) {
    this.listAssetTypes = listAssetTypes;
  }

  @GetMapping
  public List<AssetTypeResponse> list() {
    return listAssetTypes.get().stream().map(AssetTypeResponse::from).toList();
  }
}
