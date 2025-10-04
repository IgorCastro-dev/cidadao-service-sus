package org.sus.infrastructure.config;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.Produces;
import org.sus.application.gateway.BuscaCidadaoGateway;
import org.sus.application.gateway.ListaTodosCidadoesGateway;
import org.sus.application.gateway.SalvaCidadaoGateway;
import org.sus.application.usecaseimpl.BuscaCidadaoUseCaseImpl;
import org.sus.application.usecaseimpl.CriaCidadaoUseCaseImpl;
import org.sus.application.usecaseimpl.ListaCidadaoUseCaseImpl;

@ApplicationScoped
public class CidadaoConfig {
    @Produces
    @ApplicationScoped
    public BuscaCidadaoUseCaseImpl buscaCidadaoUseCaseImpl(
            BuscaCidadaoGateway buscaCidadaoGateway
    ){
        return new BuscaCidadaoUseCaseImpl(buscaCidadaoGateway);
    }

    @Produces
    @ApplicationScoped
    public ListaCidadaoUseCaseImpl listaCidadaoUseCaseImpl(
            ListaTodosCidadoesGateway listaTodosCidadoesGateway
    ){
        return new ListaCidadaoUseCaseImpl(listaTodosCidadoesGateway);
    }

    @Produces
    @ApplicationScoped
    public CriaCidadaoUseCaseImpl criaCidadaoUseCaseImpl(
            SalvaCidadaoGateway salvaCidadaoGateway
    ){
        return new CriaCidadaoUseCaseImpl(salvaCidadaoGateway);
    }
}
