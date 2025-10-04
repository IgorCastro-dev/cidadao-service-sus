package org.sus.infrastructure.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.sus.application.gateway.SalvaCidadaoGateway;
import org.sus.domain.cidadao.model.Cidadao;
import org.sus.infrastructure.mapper.CidadaoMapper;
import org.sus.infrastructure.repository.CidadaoRepository;

@ApplicationScoped
public class SalvaCidadaoGatewayImpl implements SalvaCidadaoGateway {
    @Inject
    private CidadaoRepository cidadaoRepository;
    @Inject
    private CidadaoMapper cidadaoMapper;

    @Override
    @Transactional
    public void execute(Cidadao cidadao) {
        cidadaoRepository.persist(cidadaoMapper.toCidadaoEntity(cidadao));
    }
}
