package org.sus.infrastructure.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.sus.application.gateway.ListaTodosCidadoesGateway;
import org.sus.domain.cidadao.model.Cidadao;
import org.sus.infrastructure.mapper.CidadaoMapper;
import org.sus.infrastructure.repository.CidadaoRepository;
import java.util.List;

@ApplicationScoped
public class ListaTodosCidadoesGatewayImpl implements ListaTodosCidadoesGateway {
    @Inject
    private CidadaoRepository cidadaoRepository;
    @Inject
    private CidadaoMapper cidadaoMapper;


    @Override
    public List<Cidadao> execute() {
        return cidadaoRepository.findAll().stream().map(cidadaoMapper :: toCidadao).toList();
    }
}
