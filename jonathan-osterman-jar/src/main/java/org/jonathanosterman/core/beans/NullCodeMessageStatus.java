package org.jonathanosterman.core.beans;

import org.jonathanosterman.core.CodeMessageStatusCatalogable;

public class NullCodeMessageStatus
    implements
    CodeMessageStatusCatalogable {

    private static final long serialVersionUID = -4496935661163275745L;

    @Override
    public Long getCode() {
        return null;
    }

    @Override
    public String getMeaning() {
        return null;
    }

}
