package org.sus.application.usecaseimpl;

import org.sus.application.gateway.BuscaCidadaoGateway;
import org.sus.domain.cidadao.exception.CidadaoNaoEncontradoException;
import org.sus.domain.cidadao.model.Cidadao;
import org.sus.usecase.BuscaCidadaoUsecase;

public class BuscaCidadaoUseCaseImpl implements BuscaCidadaoUsecase {
    private BuscaCidadaoGateway buscaCidadaoGateway;

    public BuscaCidadaoUseCaseImpl(BuscaCidadaoGateway buscaCidadaoGateway) {
        this.buscaCidadaoGateway = buscaCidadaoGateway;
    }

    @Override
    public Cidadao execute(Long id) {
        Cidadao cidadao = buscaCidadaoGateway.execute(id).orElseThrow(() ->
                new CidadaoNaoEncontradoException("Cidadao Nao Encontrada")
        );
        return cidadao;
    }
}
