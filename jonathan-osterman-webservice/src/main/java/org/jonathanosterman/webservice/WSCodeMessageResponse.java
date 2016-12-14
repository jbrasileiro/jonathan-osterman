package org.jonathanosterman.webservice;

import org.jonathanosterman.core.CodeCatalogable;
import org.jonathanosterman.core.Meaningful;
import org.jonathanosterman.core.WSResponse;

public interface WSCodeMessageResponse
    extends
    WSResponse,
    CodeCatalogable<Long>,
    Meaningful {

}
