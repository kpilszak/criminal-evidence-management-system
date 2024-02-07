package com.kpilszak.criminalevidencemanagementsystem.repos;

import com.kpilszak.criminalevidencemanagementsystem.dao.AbstractEntity;

import java.util.HashMap;
import java.util.Map;

public class StubAbstractRepo <T extends AbstractEntity> implements AbstractRepo<T> {

    protected Map<Long, T> records = new HashMap<>();

    @Override
    public void save(T entity) {

    }

    @Override
    public void delete(T entity) {

    }

    @Override
    public int deleteById(Long entityId) {
        return 0;
    }

    @Override
    public T findById(Long entityId) {
        return null;
    }
}
