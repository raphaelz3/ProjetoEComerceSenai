package br.com.techmarket.api.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;

@Getter
@Setter
@Entity
@Table(name = "pagamento", schema = "ecommerce")
public class Pagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pagamentos", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "id_pedido")
    private Pedido idPedido;

    @Column(name = "forma_pagamento", nullable = false, length = Integer.MAX_VALUE)
    private String formaPagamento;

    @Column(name = "status", nullable = false, length = Integer.MAX_VALUE)
    private String status;

    @Column(name = "data_pagamento")
    private OffsetDateTime dataPagamento;

}