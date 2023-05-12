package com.carebooking.carebooking.domain.enums;

public enum Status {
    ABERTO(0, "ABERTO"),
    ANDAMENTO(1, "ANDAMENTO"),
    ENCERRADO(2, "ENCERRADO");

    private Integer codigo;
    private final String descricao;

    Status(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public static Status toEnum(Integer cod) {
        if (cod == null) {
            return null;
        }
        for (Status status : Status.values()) {
            if (cod.equals(status.getCodigo())) {
                return status;
            }
        }
        throw new IllegalArgumentException("Status Inválido!");
    }
}
