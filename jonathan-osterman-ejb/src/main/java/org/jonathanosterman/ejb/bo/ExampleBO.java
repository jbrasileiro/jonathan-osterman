package org.jonathanosterman.ejb.bo;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.inject.Inject;

import org.jonathanosterman.dao.GenericDAO;

@Stateless
@Local(ExampleBOLocal.class)
public class ExampleBO
    implements
    ExampleBOLocal {

    @Inject
    private GenericDAO dao;
    
    @Override
    public String getResult(final int id) {
//        return dao.get(ExamplePO.class, id).;
        return "";
    }

}
