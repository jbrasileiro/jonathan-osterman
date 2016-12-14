package org.jonathanosterman.webservice;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.jonathanosterman.core.WSRequest;

@XmlRootElement
public class ExampleRequest
    implements
    WSRequest {

    private static final long serialVersionUID = -4350583978814254103L;
    @XmlElement(
        name = "id",
        required = true,
        nillable = false)
    private Integer id;

    public Integer getId() {
        return id;
    }

}
