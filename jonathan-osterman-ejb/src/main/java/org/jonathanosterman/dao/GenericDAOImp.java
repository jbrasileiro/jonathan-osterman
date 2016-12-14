package org.jonathanosterman.dao;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.jonathanosterman.dao.po.EntityPO;

@Named
public class GenericDAOImp
    implements
    GenericDAO {

    @PersistenceContext(
        name = "",
        unitName = "")
    private EntityManager entityManager;

    @Override
    public <T extends EntityPO> T get(final Class<T> clazz,
        final Number id) {
        return entityManager.find(clazz, id);
    }

}
