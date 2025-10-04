package org.sus.infrastructure.controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import org.sus.domain.cidadao.model.Cidadao;
import org.sus.usecase.BuscaCidadaoUsecase;
import org.sus.usecase.CriaCidadaoUsecase;
import org.sus.usecase.ListaTodosCidadoesUsecase;

@Path("/cidadao")
public class CidadaoController {

    private BuscaCidadaoUsecase buscaCidadaoUsecase;
    private ListaTodosCidadoesUsecase listaTodosCidadaoUsecase;
    private CriaCidadaoUsecase criaCidadaoUsecase;

    @Inject
    public CidadaoController(BuscaCidadaoUsecase buscaCidadaoUsecase, ListaTodosCidadoesUsecase listaTodosCidadaoUsecase, CriaCidadaoUsecase criaCidadaoUsecase) {
        this.buscaCidadaoUsecase = buscaCidadaoUsecase;
        this.listaTodosCidadaoUsecase = listaTodosCidadaoUsecase;
        this.criaCidadaoUsecase = criaCidadaoUsecase;
    }

    @GET
    @Path("/{id}")
    public Response buscaCidadao(@PathParam("id") Long id) {
        return Response.ok(buscaCidadaoUsecase.execute(id)).build();
    }

    @POST
    @Produces("application/json")
    @Consumes("application/json")
    public Response criaCidadao(Cidadao cidadao) {
        return Response.ok(criaCidadaoUsecase.execute(cidadao)).build();
    }

    @GET
    public Response listaCidadao() {
        return Response.ok(listaTodosCidadaoUsecase.execute()).build();
    }
}
