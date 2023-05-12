package com.carebooking.carebooking.domain.enums;

public enum AtendimentoTipo {
    ATENDIMENTO(0, "CONSULTA"),
    RETORNO(1, "RETORNO"),
    AGENDAMENTO(2, "AGENDAMENTO");


    private Integer codigo;
    private String descricao;
    AtendimentoTipo(Integer codigo, String descricao) {
    }
}
