package org.sus.infrastructure.controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Response;
import org.sus.usecase.BuscaCidadaoUsecase;

@Path("/cidadao")
public class CidadaoController {
    @Inject
    private BuscaCidadaoUsecase buscaCidadaoUsecase;

    @GET
    @Path("/{id}")
    public Response buscaCidadao(@PathParam("id") Long id) {
        return Response.ok(buscaCidadaoUsecase.execute(id)).build();
    }
}
