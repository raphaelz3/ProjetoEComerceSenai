package br.com.techmarket.api.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;
//Para adicionar as tabelas ao projeto deve-se clicar com o direito no schema, ir em Criar JPA, Selecionar as tabelas e adicionar a pasta model

@Getter
@Setter
@Entity
@Table(name = "cliente", schema = "ecommerce")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente", nullable = false)
    private Integer id;

    @Column(name = "email", nullable = false, length = Integer.MAX_VALUE)
    private String email;

    @Column(name = "senha", nullable = false, length = Integer.MAX_VALUE)
    private String senha;

    @Column(name = "telefone", nullable = false, length = Integer.MAX_VALUE)
    private String telefone;

    @Column(name = "data_cadastro")
    private OffsetDateTime dataCadastro;

    @Column(name = "nome", length = Integer.MAX_VALUE)
    private String nome;

}