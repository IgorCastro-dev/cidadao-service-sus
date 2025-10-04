package org.sus.application.usecaseimpl;

import org.sus.application.gateway.SalvaCidadaoGateway;
import org.sus.domain.cidadao.model.Cidadao;
import org.sus.usecase.CriaCidadaoUsecase;

public class CriaCidadaoUseCaseImpl implements CriaCidadaoUsecase {
    private SalvaCidadaoGateway salvaCidadaoGateway;

    public CriaCidadaoUseCaseImpl(SalvaCidadaoGateway salvaCidadaoGateway) {
        this.salvaCidadaoGateway = salvaCidadaoGateway;
    }

    @Override
    public String execute(Cidadao cidadao) {
        salvaCidadaoGateway.execute( cidadao );
        return "Cidadao criado com sucesso";
    }
}
