package org.jonathanosterman.core.enums;

import org.jonathanosterman.core.CodeMessageStatusCatalogable;

public enum TypeWSResponseStatusEnum
    implements
    CodeMessageStatusCatalogable {
        SUCESSO(1L,
            "SUCESSO"),
        ERRO(0L,
            "Ocorreu um erro e a solicitação não pode ser processada"),
        UNKNOWN_ERROR(0L,
            "ERRO INESPERADO:");

    private Long code;
    private String meaning;

    TypeWSResponseStatusEnum(
        final Long code,
        final String meaning) {
        this.code = code;
        this.meaning = meaning;
    }

    @Override
    public Long getCode() {
        return code;
    }

    @Override
    public String getMeaning() {
        return meaning;
    }

}
