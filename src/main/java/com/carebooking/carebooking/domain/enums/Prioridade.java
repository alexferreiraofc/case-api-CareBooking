package com.carebooking.carebooking.domain.enums;

public enum Prioridade {
    BAIXA(0, "BAIXA"),
    MEDIA(1, "MEDIA"),
    ALTA(2, "ALTA"),
    URGENTE(3, "Urgente");

    private Integer codigo;
    private final String descricao;

    Prioridade(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public static Prioridade toEnum(Integer cod) {
        if (cod == null) {
            return null;
        }
        for (Prioridade prioridade : Prioridade.values()) {
            if (cod.equals(prioridade.getCodigo())) {
                return prioridade;
            }
        }
        throw new IllegalArgumentException("Prioridade inválida!");
    }
}
