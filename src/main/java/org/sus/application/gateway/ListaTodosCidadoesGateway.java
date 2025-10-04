package org.sus.application.gateway;

import org.sus.domain.cidadao.model.Cidadao;

import java.util.List;

public interface ListaTodosCidadoesGateway {
    List<Cidadao> execute();
}
