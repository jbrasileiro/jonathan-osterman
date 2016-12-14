package org.jonathanosterman.webservice;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(
    namespace = "ExampleResponse")
@XmlRootElement
public class ExampleResponse
    extends
    BaseWSResponse {

    private static final long serialVersionUID = 7547535495976797143L;
    @XmlElement(
        name = "result")
    private String result;

    public String getResult() {
        return result;
    }

    public void setResult(final String result) {
        this.result = result;
    }

}
