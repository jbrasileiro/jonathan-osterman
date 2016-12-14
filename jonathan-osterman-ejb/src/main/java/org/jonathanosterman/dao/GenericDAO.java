package org.jonathanosterman.dao;

import org.jonathanosterman.dao.po.EntityPO;

public interface GenericDAO {

    <T extends EntityPO> T get(Class<T> clazz,
        Number id);

}
