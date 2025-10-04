package org.sus.infrastructure.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.sus.application.gateway.BuscaCidadaoGateway;
import org.sus.application.gateway.SalvaCidadaoGateway;
import org.sus.domain.cidadao.model.Cidadao;
import org.sus.infrastructure.mapper.CidadaoMapper;
import org.sus.infrastructure.repository.CidadaoRepository;

import java.util.Optional;

@ApplicationScoped
public class BuscaCidadaoGatewayImpl implements BuscaCidadaoGateway {
    @Inject
    private CidadaoRepository cidadaoRepository;
    @Inject
    private CidadaoMapper cidadaoMapper;
    @Override
    public Optional<Cidadao> execute(Long id) {
        return cidadaoRepository.findByIdOptional(id).map(cidadaoMapper :: toCidadao);
    }
}
