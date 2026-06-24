package com.juanchi1223.apiinversiones.infrastructure.web;

import com.juanchi1223.apiinversiones.application.usecase.ListAssetTypes;
import com.juanchi1223.apiinversiones.domain.model.AssetType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(AssetTypeController.class)
class AssetTypeControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @MockitoBean
  private ListAssetTypes listAssetTypes;

  @Test
  void list_debeRetornar200ConLosTiposDeAsset() throws Exception {
    when(listAssetTypes.get()).thenReturn(List.of(
      new AssetType(1, "DOLAR"),
      new AssetType(2, "FONDO"),
      new AssetType(3, "CRIPTO"),
      new AssetType(4, "ACCION")
    ));

    mockMvc.perform(get("/api/asset-types"))
      .andExpect(status().isOk())
      .andExpect(jsonPath("$.length()").value(4))
      .andExpect(jsonPath("$[0].id").value(1))
      .andExpect(jsonPath("$[0].name").value("DOLAR"))
      .andExpect(jsonPath("$[3].name").value("ACCION"));
  }
}
