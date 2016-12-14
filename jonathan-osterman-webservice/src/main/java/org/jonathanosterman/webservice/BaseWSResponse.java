package org.jonathanosterman.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.jonathanosterman.core.CodeMessageStatusCatalogable;
import org.jonathanosterman.core.beans.NullCodeMessageStatus;
import org.jonathanosterman.core.enums.TypeWSResponseStatusEnum;

@XmlType(
    name = "response")
@XmlRootElement(
    name = "response")
@XmlAccessorType(XmlAccessType.FIELD)
public class BaseWSResponse
    implements
    WSCodeMessageResponse {

    private static final long serialVersionUID = 1L;
    @XmlElement(
        name = "code")
    private Long code;
    @XmlElement(
        name = "message")
    private String meaning;

    @Override
    public Long getCode() {
        return code;
    }

    public void setCode(final Long code) {
        this.code = code;
    }

    @Override
    public String getMeaning() {
        return meaning;
    }

    public void setMessage(final String meaning) {
        this.meaning = meaning;
    }

    public void setStatus(final CodeMessageStatusCatalogable codeMessageStatus) {
        if (codeMessageStatus == null) {
            setStatus(new NullCodeMessageStatus());
        } else {
            setCode(codeMessageStatus.getCode());
            setMessage(codeMessageStatus.getMeaning());
        }
    }

    public static <T extends BaseWSResponse> T successResponse(final Class<T> clazz) {
        try {
            final T response = clazz.newInstance();
            response.setStatus(TypeWSResponseStatusEnum.SUCESSO);
            return response;
        } catch (final Exception e) {
            throw new RuntimeException(e);
        }

    }

}
