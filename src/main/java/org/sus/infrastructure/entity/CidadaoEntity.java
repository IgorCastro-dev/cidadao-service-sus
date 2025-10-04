package org.sus.infrastructure.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cidadao")
public class CidadaoEntity {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "cidadao_gen",sequenceName = "cidadao_seq",allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "cidadao_gen")
    private Long id;
    private String nome;
    private String cpf;
    private String email;
}
