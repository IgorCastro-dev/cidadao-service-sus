package org.sus.application.usecaseimpl;

import org.sus.application.gateway.ListaTodosCidadoesGateway;
import org.sus.domain.cidadao.model.Cidadao;
import org.sus.usecase.ListaTodosCidadoesUsecase;

import java.util.List;

public class ListaCidadaoUseCaseImpl implements ListaTodosCidadoesUsecase {

    private ListaTodosCidadoesGateway listaCidadaoGateway;

    public ListaCidadaoUseCaseImpl(ListaTodosCidadoesGateway listaCidadaoGateway) {
        this.listaCidadaoGateway = listaCidadaoGateway;
    }

    @Override
    public List<Cidadao> execute() {
        return listaCidadaoGateway.execute();
    }
}
