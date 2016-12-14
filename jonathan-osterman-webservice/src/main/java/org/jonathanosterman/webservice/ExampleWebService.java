package org.jonathanosterman.webservice;

import javax.ejb.EJB;
import javax.jws.WebService;

import org.jonathanosterman.core.enums.TypeWSResponseStatusEnum;
import org.jonathanosterman.ejb.bo.ExampleBOLocal;

@WebService(
    serviceName = "ClienteWService",
    targetNamespace = "http://interfaces.ws.clienteservice.riachuelo.com.br/",
    endpointInterface = "br.com.riachuelo.fincliente.web.webservices.IClienteWService")
public class ExampleWebService
    implements
    IExampleWebService {

    @EJB
    private ExampleBOLocal exampleBO;

    @Override
    public ExampleResponse obterCliente(final ExampleRequest request) {
        try {
            final ExampleResponse response = BaseWSResponse.successResponse(ExampleResponse.class);
            response.setResult(exampleBO.getResult(request.getId()));
            return response;
        } catch (final Exception e) {
            e.printStackTrace();
            final ExampleResponse response = new ExampleResponse();
            response.setStatus(TypeWSResponseStatusEnum.UNKNOWN_ERROR);
            response.setResult(e.getMessage());
            return response;
        }
    }

}
