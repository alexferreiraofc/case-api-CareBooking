package com.carebooking.carebooking.domain.enums;

public enum Andamento {
    AGUARDANDO(0, "AGUARDANDO ATENDIMENTO"),
    ATENDIMENTO(1, "EM ATENDIMENTO"),
    EXAME(2, "REALIZANDO EXAME");

    private Integer codigo;
    private final String descricao;

    Andamento(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public static Andamento toEnum(Integer cod) {
        if (cod == null) {
            return null;
        }
        for (Andamento funcao : Andamento.values()) {
            if (cod.equals(funcao.getCodigo())) {
                return funcao;
            }
        }
        throw new IllegalArgumentException("Andamento inválido!");
    }
}
