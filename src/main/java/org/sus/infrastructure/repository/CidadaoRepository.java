package org.sus.infrastructure.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.sus.infrastructure.entity.CidadaoEntity;

@ApplicationScoped
public class CidadaoRepository implements PanacheRepository<CidadaoEntity> {

}
