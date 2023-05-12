package com.carebooking.carebooking.domain.enums;

public enum Perfil {
    CLIENTE(0, "CLIENTE"),
    MEDICO(1, "Médico"),
    COLABORADOR(2, "Colaborador");

    private Integer codigo;
    private final String cargo;

    Perfil(Integer codigo, String cargo) {
        this.cargo = cargo;
        this.codigo = codigo;
    }

    public String getCargo() {
        return cargo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public static Perfil toEnum(Integer cod) {
        if (cod == null) {
            return null;
        }
        for (Perfil funcao : Perfil.values()) {
            if (cod.equals(funcao.getCodigo())) {
                return funcao;
            }
        }
        throw new IllegalArgumentException("Perfil inválido!");
    }
}
