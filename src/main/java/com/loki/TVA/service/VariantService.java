package com.loki.TVA.service;

import com.loki.TVA.dto.VariantRequestDTO;
import com.loki.TVA.dto.VariantResponseDTO;

import java.util.List;

public interface VariantService {
    List<VariantResponseDTO>  getAllVariant();
    VariantResponseDTO getVariantById(Long id);
    VariantResponseDTO createVariant(VariantRequestDTO request);
    VariantResponseDTO updateVariantById(Long id, VariantRequestDTO request);
    void deleteVariantById(Long id);

}
