package org.sus.usecase;

import org.sus.domain.cidadao.model.Cidadao;

public interface BuscaCidadaoUsecase {
    Cidadao execute(Long id);
}
