package org.sus.application.gateway;

import org.sus.domain.cidadao.model.Cidadao;

import java.util.Optional;

public interface BuscaCidadaoGateway {
    Optional<Cidadao> execute(Long id);
}
