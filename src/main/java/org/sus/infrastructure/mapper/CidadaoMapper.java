package org.sus.infrastructure.mapper;

import jakarta.enterprise.context.ApplicationScoped;
import org.sus.domain.cidadao.model.Cidadao;
import org.sus.infrastructure.entity.CidadaoEntity;

@ApplicationScoped
public class CidadaoMapper {
    public CidadaoEntity toCidadaoEntity(Cidadao cidadao){
        return new CidadaoEntity(
                cidadao.getId(),
                cidadao.getNome(),
                cidadao.getCpf(),
                cidadao.getEmail()
        );
    }

    public Cidadao toCidadao(CidadaoEntity unidadeEntity){
        return new Cidadao(
                unidadeEntity.getId(),
                unidadeEntity.getNome(),
                unidadeEntity.getCpf(),
                unidadeEntity.getEmail()
        );
    }
}
