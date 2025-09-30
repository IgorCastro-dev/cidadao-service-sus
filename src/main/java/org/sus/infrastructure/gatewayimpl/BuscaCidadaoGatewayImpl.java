package org.sus.infrastructure.gatewayimpl;

import jakarta.inject.Inject;
import org.sus.application.gateway.BuscaCidadaoGateway;
import org.sus.domain.cidadao.model.Cidadao;
import org.sus.infrastructure.mapper.CidadaoMapper;
import org.sus.infrastructure.repository.CidadaoRepository;

import java.util.Optional;

public class BuscaCidadaoGatewayImpl implements BuscaCidadaoGateway {
    @Inject
    private CidadaoRepository repository;

    @Inject
    private CidadaoMapper mapper;

    @Override
    public Optional<Cidadao> execute(Long id) {
        return repository.findByIdOptional(id).map(mapper::toCidadao);
    }
}
